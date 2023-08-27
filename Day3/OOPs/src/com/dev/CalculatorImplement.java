package com.dev;

import com.interfaces.CalculatorInterface;

public class CalculatorImplement implements CalculatorInterface {
	//Right click + source + Override/Implements Method
	
	@Override
	public double add(double x, double y) {
		// TODO Auto-generated method stub
		double p = CalculatorInterface.PI;
		return x+y;
	}

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

}
