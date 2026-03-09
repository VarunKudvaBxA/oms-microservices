package com.example.order_service.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* example.orderservice.service.*.*(..))")
    public void logMethodCall(JoinPoint joinPoint) {

        System.out.println("Method called: " + joinPoint.getSignature());
    }

    @Around("execution(* example.orderservice.controller.*.*(..))")
    public Object measureExecutionTime(org.aspectj.lang.ProceedingJoinPoint pjp) throws Throwable {

        long start = System.currentTimeMillis();

        Object result = pjp.proceed();

        long end = System.currentTimeMillis();

        System.out.println("Execution time: " + (end - start));

        return result;
    }
}
