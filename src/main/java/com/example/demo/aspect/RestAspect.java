package com.example.demo.aspect;

import com.example.demo.resultUtils.ResultMessage;
import com.example.demo.utils.NetworkUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * 创建人:连磊
 * 日期: 2018/5/16. 11:17
 * 描述：
 */
@Aspect
@Component
@Order(0)
public class RestAspect {

    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(RestAspect.class);

    private Long timeLong = 0L;

    /**
     * 定义拦截规则
     */
    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void urlPointcut(){}

    @Before("urlPointcut()")
    public void doBefore(JoinPoint joinPoint) {
        timeLong = System.currentTimeMillis();
        try {
            logger.info("开始访问。。。。。。。。。");
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            HttpServletRequest request = attributes.getRequest();

            String targetName = joinPoint.getTarget().getClass().getName();
            String methodName = joinPoint.getSignature().getName();
            logger.info("开始访问接口时间：" + new Date());
            logger.info("pointcut-log: url={}", request.getRequestURL());
            logger.info("pointcut-log: method={}", request.getMethod());
            logger.info("pointcut-log: args={}", joinPoint.getArgs());
            logger.info("pointcut-log: lassMethod={}", methodName);
            logger.info("pointcut-log: targetName={}", targetName);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

    @AfterReturning(returning = "ret" , pointcut = "urlPointcut()")
    public void doAfterReturning(Object ret) throws Throwable{
        logger.info("返回参数："+ret);
    }

    @AfterThrowing(value = "urlPointcut()" , throwing = "e")
    public void doAfterThrowing(JoinPoint joinPoint , Exception e){
        if (e != null) {
            ResultMessage.getNew().setMes(e.getMessage()).setCode(500);
        }
    }


    @After("urlPointcut()")
    private void doAfter(JoinPoint joinPoint){
        logger.info("结束访问接口时间：" + new Date());
        logger.info("访问当前接口时间为："+(System.currentTimeMillis() - timeLong));
        logger.info("结束访问。。。。。。。。。");
    }
}
