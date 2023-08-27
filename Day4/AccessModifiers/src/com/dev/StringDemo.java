package com.dev;

public class StringDemo {

	public static void main(String[] args) {
		//String is a immutable object
		//java.lang ---> by default
		//== compare references of String as String is a reference type

		//Here it will point to different memory using new 
		String name1 = "Kim"; //using literals " "
		String name2 = new String("Kim"); //using new keyword
		System.out.println(name1 == name2);
		
		//points to different memory as new
		String name3 = new String(); 
		String name4 = new String(name3); 
		System.out.println(name3 == name4);
		
		//Here it will point to same memory using literals
		String name5 = "PS";
		String name6 = "PS";		
		System.out.println(name5 == name6);
		
		
		// .equals will compare contents of sting
		System.out.println(name1.equals(name2));
	}

}
