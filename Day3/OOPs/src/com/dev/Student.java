package com.dev;

public class Student extends Object{
	private int studentId;
	private String studentName;
	private int rank;
	
	public Student() {
		super(); //also call by default
		System.out.println("Student Default Constructor Ran");
	}
	public Student(int studentId, String studentName) {
		// by default super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	public Student(int studentId, String studentName, int rank) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.rank = rank;
	}
	
	//Method Over Riding --> Run time polymorphism
	//Same function name, parameter & return type
	
}
