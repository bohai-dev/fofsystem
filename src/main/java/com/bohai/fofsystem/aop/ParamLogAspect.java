package com.bohai.fofsystem.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * Created by cxy on 2018/11/5
 * 记录日志切面
 */
@Component
@Aspect
@Order(2)
public class ParamLogAspect {
    /** logger */
    private static final Logger LOGGER = LoggerFactory.getLogger(ParamLogAspect.class);




    @Pointcut("execution(public * com.bohai.fofsystem.controller..*.*(..))")
    public void webLog(){}

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        // 接收到请求，记录请求内容
        LOGGER.info("接收到请求:");
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();



        // 记录下请求内容
        LOGGER.info("URL : " + request.getRequestURL().toString());
        LOGGER.info("HTTP_METHOD : " + request.getMethod());
        LOGGER.info("IP : " + request.getRemoteAddr());
        LOGGER.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        LOGGER.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));


    }



}
