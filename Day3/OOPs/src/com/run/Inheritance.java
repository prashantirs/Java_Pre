package com.run;

import com.dev.Book;

public class Inheritance {
	//Run time polymorphism Method Over Riding
	public static void displayEmpDeatils(Employee emp) {
		//Type Casting employee emp into Manager
		
		if(emp instanceof Manager) {
			System.out.println(((Manager) emp).getMnglevel());
			System.out.println(emp.getVariablePay());
			
		}else if(emp instanceof Engineer) {
			System.out.println(((Engineer) emp).getEngType());
			System.out.println(emp.getVariablePay());
		}
	}
	
	public static void main(String[] args) {
		//Parent class is called super class
		//Employee is Parent class of Engineer and Manager
		//extends keyword work with is-a Relationship
		//eg : Engineer is-a Employee
		//eg : Manager is-a Employee
		
		//Cannot initiate any object from abstract class
		
		//new Employee(); //not possible
		
		Manager M1 = new Manager();
		M1.setEmpId(82);
		M1.setEmpName("Pushpendra");
		M1.setEmpPhoneNo(89563514552l);
		M1.setMnglevel("Head Manager");
		
		Engineer E1 = new Engineer();
		E1.setEmpId(84);
		E1.setEmpName("Raja");
		E1.setEmpPhoneNo(9812414552l);
		E1.setEngType("Electrical Engineer");
		
		M1.displayEmpDetails();
		E1.displayEmpDetails();

		System.out.println(M1.getMnglevel());
		System.out.println(E1.getEngType());
		
		//Method Over Riding
		System.out.println(E1.getVariablePay());
		System.out.println(M1.getVariablePay());
		
		System.out.println("");
		displayEmpDeatils(E1);
		System.out.println("");
		displayEmpDeatils(M1);
		
		Book book1 = new Book();
		book1.setBookId(88);
		book1.setBookAuthor(new String[] {"Bert Bytes","Kathay Sierra"});
		book1.setBookName("Dont Read Book");
		book1.setBookCost(750);
		
		System.out.println(book1);
	}

}
