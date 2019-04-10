package com.capgemini.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
class ValidationAspect{

	@Before("execution(* com.capgemini.math.*.*(..))")
	public void log(){
		System.out.println("validation successfull");
	}	

}