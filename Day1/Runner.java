package com.run;

//For accessing Greeting in Com -> Dev -> Greeting Class
//javac -d . *.java
//tree/f
import com.dev.Greeting;

public class Runner{
	public static void main(String[] args){
	 Greeting grt = new Greeting(); //instance of Greeting
	 grt.sayGreet(); //Call the method	
	
	}
	
}