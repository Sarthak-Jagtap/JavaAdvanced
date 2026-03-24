package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspect {

	@Pointcut("execution(* com.example.demo.service.*.*(..))")
	public void serviceMethods() {
	}

	@Before("serviceMethods()")
	public void beforeMethod(JoinPoint jp) {
		System.out.println("Before method: " + jp.getSignature().getName());
	}

	@After("serviceMethods()")
	public void afterMethod(JoinPoint jp) {
		System.out.println("After method: " + jp.getSignature().getName());
	}

	@AfterReturning(pointcut = "serviceMethods()", returning = "result")
	public void afterReturning(JoinPoint jp, Object result) {
		System.out.println("Method Returned" + result);
	}

	@AfterThrowing(pointcut = "serviceMethods()", throwing = "ex")
	public void afterThrowing(JoinPoint jp, Exception ex) {
		System.out.println("Exception Thrown" + ex.getMessage());
	}

	@Around("serviceMethods()")
	public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
	    long start = System.currentTimeMillis();

	    Object result = pjp.proceed();   // capture result

	    long end = System.currentTimeMillis();

	    System.out.println("Performance: " + (end - start) + " ms");

	    return result;  
	}
}
