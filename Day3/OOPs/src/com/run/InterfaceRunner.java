package com.run;

import com.interfaces.CalculatorInterface;
import com.dev.CalculatorImplement;

public class InterfaceRunner {

	public static void main(String[] args) {
		CalculatorInterface cal  = new CalculatorImplement();
		System.out.println(CalculatorImplement.PI);
		System.out.println(cal.add(10,10));
		System.out.println(cal.mul(5.0,6));
		
	}

}
