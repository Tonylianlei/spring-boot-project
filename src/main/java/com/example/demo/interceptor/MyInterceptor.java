package com.example.demo.interceptor;

import com.example.demo.utils.NetworkUtil;
import com.example.demo.utils.region.IpRegionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.stream.Collectors;

/**
 * 创建人:连磊
 * 日期: 2018/5/16. 9:20
 * 描述：
 */
public class MyInterceptor implements HandlerInterceptor {

    private  static Logger logger = LoggerFactory.getLogger("MyInterceptor");

    private static Properties properties = null;
    private static String path = null;
    static {
        properties = new Properties();
        try {
            properties.load(MyInterceptor.class.getClassLoader().getResourceAsStream("whiteList.properties"));
            path = properties.getProperty("path");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String ipAddress = NetworkUtil.getIpAddress(request);
        logger.info("访问人IP："+ ipAddress);
        String servletPath = request.getServletPath();
        String[] split = path.split(",");
        int size = Arrays.stream(split).filter(url -> url.equals(servletPath)).collect(Collectors.toList()).size();
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
