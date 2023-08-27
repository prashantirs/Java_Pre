package com.interfaces;

public interface CalculatorInterface {
	//PI is static and Final (Constant)
	double PI = 3.14;
	
	//Only declaration is there in Interfaces
	double add(double x, double y);
	double sub(double x, double y);
	double mul(double x, double y);
	double div(double x, double y);

}


/* use of implements keyword
 * public class CalculatorInterfaceRunner implements CalculatorInterface {
 */
