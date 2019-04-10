package com.capgemini.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.aspectj.lang.ProceedingJoinPoint;

@Aspect
@Component
class ValidationAspect{

	@Around("execution(* com.capgemini.math.*.add(..))")
	public void add(ProceedingJoinPoint joinpoint) throws Throwable{
		Object[] args = joinpoint.getArgs();
		int num1= Integer.parseInt(args[0].toString());
		int num2= Integer.parseInt(args[1].toString());		
		
		if(num1 > 0 && num2 > 0){
			joinpoint.proceed();
		}
		else
			System.out.println("Numbers can not be negatives");
	
	}

	@Around("execution(* com.capgemini.math.*.divide(..))")	
	public void divide(ProceedingJoinPoint joinpoint) throws Throwable{
		Object[] args = joinpoint.getArgs();
		double num2= Double.parseDouble(args[1].toString());		
		
		if(num2 != 0){
			joinpoint.proceed();
		}
		else
			System.out.println("Denominator can not be zero");
	}
}