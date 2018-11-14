package com.dongqilin.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: dongql
 * @date: 2018/3/29 14:17
 */
@Aspect
@Component
public class LogAspect {
    //Controller层切点
    @Pointcut("@annotation(com.dongqilin.annotation.LogAnnotation)")
    public void logPointCut() {
    }

    @Around("logPointCut()")
    public void aroundMethod(ProceedingJoinPoint pjd) {
        System.out.println(("请求方法:" + (pjd.getTarget().getClass().getName() + "." + pjd.getSignature().getName() + "()")));

        try {
            pjd.proceed();
            System.out.println("after");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }
}
