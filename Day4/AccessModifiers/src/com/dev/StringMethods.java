package com.dev;

public class StringMethods {

	public static void main(String[] args) {
		String str1 = "Deloitte Technology Academy";
		String str2 = "deloitte technology academy";
		
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		String[] tokens = str1.split(" ");
		for (String x : tokens) {
			System.out.println(x);
		}
		
		System.out.println(str1.length());
		System.out.println(tokens.length);
		
		String str3 = str1.substring(1);
		System.out.println(str3);
		
		String str4 = str1.substring(2,7);
		System.out.println(str4);
	
		System.out.println(str1.indexOf("Academy"));
		
		char[] eachChar = str1.toCharArray();
		for (char x : eachChar) {
			System.out.print(x+" ");
		}
	
	
	}
	
}
