package com.run;

public abstract class Employee {
	private int empId; //camelCase
	private String empName;
	private long empPhoneNo;
	
	//Constructor
	public Employee() {
		System.out.println("Constructor of Employee");
	}
	
	//Right click + source + getter and setter for Private data members
	//Setter
	public void setEmpId(int empId) {
		if(empId > 0 && empId<1000) {
			this.empId = empId;
		}else {
			this.empId = 0;
		}
		
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpPhoneNo(long empPhoneNo) {
		this.empPhoneNo = empPhoneNo;
	}
	
	//Getter
	public int getEmpId() {
		return empId;
	}
	
	//Method
	public void displayEmpDetails() {
		System.out.println(empId+"\t"+empName+"\t"+empPhoneNo);
	}
	
	//abstract 
	public abstract String getVariablePay();
	
	
	/************************* Abstract ****************/
	//when a function is abstract then class should also make abstract
	//vice versa not true
	
	
	//abstract is used when we will over Ride any method in child(sub) class
	
	//When a class is abstract so we can't make object from it
	//When a class is abstract so we initiate a instance from it
	
	//abstract class is a Partially Created class 
	//--> some methods are defined and some only are declared 
	
	/*
	public abstract class ClassName{
		//optional abstract method
		//may be there or may not be
	}*/
	
	//Abstract class can't be instantiated only used as a reference type
	
	
	/*************** Interface ***************/
	//Interface is un-implemented structure
	//abstract class both --> Ho and nhi bhi ho sakta hai
	
	//Class is implemented structure
	//Abstract Class is partially-implemented structure
	//Interface is unimplemented structure
	
	
	//Syntax
	interface InterfaceName{
		//only we can declare function
		//data members are --> Public , Static , Final (Constatnt cant be changed)
		//it is by default public , abstract
	}
	
	//multiple inheritance is possible using interfaces
	
	//We can achieve abstraction using Interfaces
	
	
	/****************Static******************/
	//We don't need to create object of static class to access data member
}
