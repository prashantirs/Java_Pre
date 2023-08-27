package com.run;

public class Calculator {
	public int add(int a, int b) {
		return a+b;
	}
	//Method Overloading (function name should be same and different parameter list)
	//return type may be different
	/**
	 *  add methods with double params
	 *  
	 */
	public double add(double a, double b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		return a/b;
	}
}
