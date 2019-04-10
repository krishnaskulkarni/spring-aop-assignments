package com.capgemini.math;

import com.capgemini.calculator.*;
import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator{
	

	public double divide(int num1,int num2){
		double result = num1/num2;
		System.out.println("working");
		return result;
	}

}