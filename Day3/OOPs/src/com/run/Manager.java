package com.run;

public class Manager extends Employee{
	private String mnglevel;
	
	public Manager() {
		System.out.println("Manager Constructor Called");
	}
	
	public String getMnglevel() {
		return mnglevel;
	}

	public void setMnglevel(String mnglevel) {
		this.mnglevel = mnglevel;
	}
	
	@Override
	public String getVariablePay() {
		return "10% for Manager";
	}
	
//	public String getVariablePay() {
//		return super.getVariablePay() + "10% for Manager";
//	}
	
}
