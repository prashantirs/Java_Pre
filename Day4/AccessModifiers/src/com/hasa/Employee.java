package com.hasa;

import java.util.Arrays;

public class Employee {
	private int empId;
	private String empName;
	private long empPhone;
	
	//has-a relation (employee has-a address)
	private Address[] empAddress;

	public void setEmpAddress(Address[] empAddress) {
		this.empAddress = empAddress;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getEmpPhone() {
		return empPhone;
	}


	
	public Address[] getEmpAddress() {
		return empAddress;
	}

	public void setEmpPhone(long empPhone) {
		this.empPhone = empPhone;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empPhone=" + empPhone + ", empAddress="
				+ Arrays.toString(empAddress) + "]";
	}
	
	
	
	
}
