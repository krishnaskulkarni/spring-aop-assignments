package com.capgemini.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
class ValidationAspect{

	@After("execution(* com.capgemini.math.CalculatorImpl.*(..))")
	public void log(){
		System.out.println("validation successfull");
	}	

}