package com.run;

public class DataTypes {

	public static void main(String[] args) {
		//Primitive is 8
		byte a = 10; //-128 to 127
		short z = 129;
		int b = 2;
		long c =b ; //low to high --> Implicit allowed by java
		int d = (int)c; //high to low --> explicit memory loss
		long phone_no = 1234567890L;
		
		float e = 100.50f;
		double p = 400.00;
		
		char q ='a';
		//Ascii value
		System.out.println((int)q);
		
		boolean r =false;
		
		//By default in java --> int , double & 0
		

	}

}
