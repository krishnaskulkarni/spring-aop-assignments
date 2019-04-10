package com.capgemini.main;

import com.capgemini.math.*;
import com.capgemini.calculator.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main{
	public static void main(String []arg){
				
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		Calculator calculator = context.getBean(Calculator.class);	

		System.out.println(calculator.add(100,100));
		System.out.println(calculator.divide(100,10));
	}
}