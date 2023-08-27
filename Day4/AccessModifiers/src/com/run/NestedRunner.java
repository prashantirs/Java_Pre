package com.run;

import com.dev.NestedClassDemo;

public class NestedRunner {

	public static void main(String[] args) {
		
		//For Static Class
		//In static class we need not to created object of that class
		NestedClassDemo.StaticInnerClass static_inner = new NestedClassDemo.StaticInnerClass();
		static_inner.demo_staticinnerclass();
	
		//Non Static Class
		NestedClassDemo.NonStaticInnerClass nonstatic_inner = new NestedClassDemo().new  NonStaticInnerClass();
		nonstatic_inner.demo_nonstaticinnerclass();
	
		//new Calcu + (ctrl + space)
		CalculatorInterface cal = new CalculatorInterface() {
			
			@Override
			public double sub(double x, double y) {
				// TODO Auto-generated method stub
				return x-y;
			}
		
			@Override
			public double mul(double x, double y) {
				// TODO Auto-generated method stub
				return x*y;
			}
			
			@Override
			public double div(double x, double y) {
				// TODO Auto-generated method stub
				return x/y;
			}
			
			@Override
			public double add(double x, double y) {
				// TODO Auto-generated method stub
				return x+y;
			}
		};
		
		System.out.println(cal.add(20,30));
		
	}

}
