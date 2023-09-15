package com.example.aoptesting.aop;

import com.google.common.base.Stopwatch;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Aspect
@Component
public class TimeCheckAspect {

    @Pointcut("execution(public * com.example.aoptesting.aop.*.*(..))")
    private void timeCheckPointCut() {

    }

    @Around("com.example.aoptesting.aop.TimeCheckAspect.timeCheckPointCut()")
    public Object timeCheck(ProceedingJoinPoint joinPoint) throws Throwable {
        Stopwatch stopwatch = Stopwatch.createStarted();
        Object proceed = joinPoint.proceed();
        stopwatch.stop();
        System.out.println("time = " + stopwatch.elapsed(TimeUnit.MILLISECONDS) + "ms");
        return proceed;
    }
}
