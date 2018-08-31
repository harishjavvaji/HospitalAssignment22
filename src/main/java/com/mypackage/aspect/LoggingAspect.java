package com.mypackage.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* com.mypackage.controllers.RegistrationController.viewRegistration(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature());
    }

    @After("execution(* com.mypackage.controllers.RegistrationController.viewRegistration(..))")
    public void after(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature());
    }

    @Before("execution(* com.mypackage.controllers.LoginController.*(..))")
    public void beforeLogin(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature());

    }

    @Around("execution(* com.mypackage.controllers.*.*(..))")
    public void afterLogin(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature());
    }
}
