package com.example.demo.aspect;

import com.example.demo.utils.NetworkUtil;
import com.example.demo.utils.region.IpRegionUtil;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 创建人:连磊
 * 日期: 2018/5/19. 16:22
 * 描述：
 */
@Aspect
@Component
public class ControllerRestAspect {

    private static Logger logger = LoggerFactory.getLogger(ControllerRestAspect.class);

    @Pointcut("execution(* com.example.demo.controller..*.*(..))")
    public void controllerPointcut(){}

    @Before("controllerPointcut()")
    public void controllerUserIP(){
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        String ipAddress = null;
        try {
            ipAddress = NetworkUtil.getIpAddress(request);
            String ipRegion = IpRegionUtil.getIpRegion(ipAddress);
            logger.info("访问人所在位置：" + ipRegion);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
