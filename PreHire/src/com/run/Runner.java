package com.run;

import com.dev.Greeting;
import com.dev.ScopeOfVariable;

public class Runner {

	public static void main(String[] args) {
		
		Greeting greet = new Greeting() ; 
		greet.sayGreet();
		
		//calling
		System.out.println(ScopeOfVariable.code); //cant access cause code is default variable
		                                          //default vairable can only be accessed within same package
	}

}
