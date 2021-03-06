package com.example.demo.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.util.Properties;

/**
 * redis工具类
 * 
 * @author lujun.chen
 * @version [版本号, 2016年7月27日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public final class RedisUtil {

    private static Logger logger = LogManager.getLogger(RedisUtil.class);

    private static String ADDR = "";

    private static int PORT = 6379;

    private static String AUTH = null;

    private static int MAX_ACTIVE = 300;

    private static int MAX_IDLE = 200;

    private static int MAX_WAIT = 10000;

    private static int TIMEOUT = 10000;

    private static boolean TEST_ON_BORROW = true;

    private static JedisPool jedisPool = null;

    private static Jedis jedis = null;

    private static Properties properties = null;

    /**
     * 初始化Redis连接池
     */
    static {
        try {
            init();
        } catch (Exception e) {
            logger.error("初始化Redis出错，" + e);
        }
    }

    /**
     * 初始化连接池
     * 
     * @see [类、类#方法、类#成员]
     */
    private static synchronized void init() throws IOException {
        properties = new Properties();
        properties.load(RedisUtil.class.getClassLoader().getResourceAsStream("application.yml"));
        ADDR = properties.getProperty("spring.redis.host");
        PORT = Integer.valueOf(properties.getProperty("spring.redis.port"));
        MAX_ACTIVE = Integer.valueOf(properties.getProperty("spring.redis.pool.max_active"));
        MAX_IDLE = Integer.valueOf(properties.getProperty("spring.redis.pool.max_idle"));
        MAX_WAIT = Integer.valueOf(properties.getProperty("spring.redis.pool.max_wait"));
        TIMEOUT = Integer.valueOf(properties.getProperty("spring.redis.pool.timeout"));

        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(MAX_IDLE);
        config.setMaxWaitMillis(MAX_WAIT);
        config.setTestOnBorrow(TEST_ON_BORROW);
        config.setMaxTotal(MAX_ACTIVE);
        jedisPool = new JedisPool(config, ADDR, PORT, TIMEOUT, AUTH);
    }

    /**
     * 获取Jedis实例
     * 
     * @return
     */
    private static Jedis getJedis() {
        try {
            if (jedisPool != null) {
                jedis = jedisPool.getResource();
            } else {
                init();
                jedis = jedisPool.getResource();
            }
        } catch (Exception e) {
            logger.error("获取Redis实例出错，" + e);
        }
        return jedis;
    }

    /**
     * 设置单个值
     * 
     * @param key
     * @param value
     * @return
     */
    public static String set(String key, String value) {
        return set(key, value, null);
    }

    /**
     * 设置单个值，并设置超时时间
     * 
     * @param key
     *            键
     * @param value
     *            值
     * @param timeout
     *            超时时间（秒）
     * @return
     * @see [类、类#方法、类#成员]
     */
    public static String set(String key, String value, Integer timeout) {
        String result = null;

        Jedis jedis = RedisUtil.getJedis();
        if (jedis == null) {
            return result;
        }
        try {
            result = jedis.set(key, value);
            if (null != timeout) {
                jedis.expire(key, timeout);
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        } finally {
            if (null != jedis) {
                jedis.close();
            }
        }
        return result;
    }

    /**
     * 获取单个值
     * 
     * @param key
     * @return
     */
    public static String get(String key) {
        String result = null;
        Jedis jedis = RedisUtil.getJedis();
        if (jedis == null) {
            return result;
        }
        try {
            result = jedis.get(key);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        } finally {
            if (null != jedis) {
                jedis.close();
            }
        }
        return result;
    }

    /**
     * 删除redis中数据
     * 
     * @param key
     * @return
     * @see [类、类#方法、类#成员]
     */
    public static boolean del(String key) {
        Boolean result = Boolean.FALSE;
        Jedis jedis = RedisUtil.getJedis();
        if (null == jedis) {
            return Boolean.FALSE;
        }
        try {
            jedis.del(key);
        } catch (Exception e) {
            logger.error("删除redis数据出错，" + e);
        } finally {
            if (null != jedis) {
                jedis.close();
            }
        }
        return result;
    }

    /**
     * 追加
     * 
     * @param key
     * @param value
     * @return
     * @see [类、类#方法、类#成员]
     */
    public static Long append(String key, String value) {
        Long result = Long.valueOf(0);
        Jedis jedis = RedisUtil.getJedis();
        if (null == jedis) {
            return result;
        }
        try {
            result = jedis.append(key, value);
        } catch (Exception e) {
            logger.error("追加redis数据出错，" + e);
        } finally {
            if (null != jedis) {
                jedis.close();
            }
        }
        return result;
    }

    /**
     * 检测是否存在
     * 
     * @param key
     * @return
     * @see [类、类#方法、类#成员]
     */
    public static Boolean exists(String key) {
        Boolean result = Boolean.FALSE;
        Jedis jedis = RedisUtil.getJedis();
        if (null == jedis) {
            return result;
        }
        try {
            result = jedis.exists(key);
        } catch (Exception e) {
            logger.error("检查是否存在出错：，" + e);
        } finally {
            if (null != jedis) {
                jedis.close();
            }
        }
        return result;
    }
}