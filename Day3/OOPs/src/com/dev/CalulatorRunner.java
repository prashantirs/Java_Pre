package com.dev;

import java.util.Scanner;

import com.run.Calculator;

public class CalulatorRunner {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();

		Scanner sc = new Scanner(System.in);

		System.out.println("What Would you like to do select option");
		System.out.println("1 Addition");
		System.out.println("2 Subtraction");
		System.out.println("3 Multiplication");
		System.out.println("4 Division");
		
		//Taking Input
		int option = sc.nextInt();
				
		System.out.print("Enter Two Numbers to Operation You Selected : ");

		//Taking Input
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		switch(option) {
			case 1:
				System.out.println("Addition of "+ num1 +" + " +num2 + " = "+c1.add(num1, num2));
				break;
			case 2:
				System.out.println("Subtraction of "+ num1 +" - " +num2 + " = "+c1.sub(num1, num2));
				break;
			case 3:
				System.out.println("Multiplication of "+ num1 +" * " +num2 + " = "+c1.mul(num1, num2));
				break;
			case 4:
				System.out.println("Division of "+ num1 +" / " +num2 + " = "+c1.div(num1, num2));
				break;
			default:
				System.out.println("Bye Bye!");
			
		}
		//Function Overloading with double dataType
		c1.add(4.0, 5);
		

	}

}
