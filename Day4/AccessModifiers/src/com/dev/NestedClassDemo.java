package com.dev;

public class NestedClassDemo {
	private static int counter; //only single memory is created when class is loaded
	
	//Constructor
	public NestedClassDemo() {
		System.out.println("Nested Constructor");
	}
	
	//Class
	static public class StaticInnerClass{
		//a function
		public void demo_staticinnerclass() {
			++counter; //inner class access private member of outer classes
			System.out.println("Static Inner function");
		}
	}
	
	//Class
	public class NonStaticInnerClass{
		//a function
		public void demo_nonstaticinnerclass() {
			++counter; //inner class access private member of outer classes
			System.out.println("Non-Static Inner function");
		}
	}
}
