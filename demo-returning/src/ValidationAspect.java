package com.capgemini.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.aspectj.lang.ProceedingJoinPoint;

@Aspect
@Component
class ValidationAspect{

	 @AfterReturning(pointcut = "execution(* com.capgemini.math.*.add(..))",returning ="number")
	public void add(int number) throws Throwable{	
		System.out.println("Add successs.......");
	}

	 @AfterReturning(pointcut = "execution(* com.capgemini.math.*.divide(..))",returning = "num")	
	public void divide(double num) throws Throwable{
		System.out.println("divide success");
	}
}