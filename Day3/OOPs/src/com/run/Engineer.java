package com.run;

public class Engineer extends Employee{
	private String engType;
	
	public Engineer() {
		System.out.println("Engineer Constructor Called");
	}

	public String getEngType() {
		return engType;
	}

	public void setEngType(String engType) {
		this.engType = engType;
	}

	//Source + Override/Implement

	@Override
	public String getVariablePay() {
		return "7% for Engineers";
	}
	
	// escape sequence for new line  \n
	
	
}
