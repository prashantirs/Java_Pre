package com.run;

public class A {
	//Default Constructor
	public A() {
		System.out.println("Inside A");
	}
	
	//Parameterized Constructor | Constructor Chaining --> Inheritance
	public A(String str) {
		this(); //It represent to our object(Instance) A
		System.out.println(str);
	}
}
