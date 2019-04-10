package com.capgemini.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.aspectj.lang.ProceedingJoinPoint;
import java.lang.ArithmeticException;

@Aspect
@Component
class ValidationAspect{

	/*
	 @AfterThrowing (pointcut = "execution(* com.capgemini.math.*.divide(..))", throwing = "ex")
	public void add(ArithmeticException ex) throws Throwable{	
		System.out.println("Add successs.......");
	}
	*/

	@AfterThrowing(pointcut = "execution(* com.capgemini.math.CalculatorImpl.divide(..))", throwing = "ex")	
	public void divide(ArithmeticException ex) {
		
	System.out.println("after throwing example-----");
	}
}