package com.run;

public class B extends A{
	public B() {
		//super() --> represent constructor of Parent i.e class A
		//compiler by default call super();
		super("Kim");
		System.out.println("Inside B");
	}
}
