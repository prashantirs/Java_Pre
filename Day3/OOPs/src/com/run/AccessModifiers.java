package com.run;

public class AccessModifiers {

	public static void main(String[] args) {
		//object === instance  
		//Creating object (Same package so need not to be imported
		//e1 id Reference Variable (as point to memory)/ Object
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		//assigning value when data members are public
		/*e1.empId = 79;
		e1.empName = "Prashant";
		e1.empPhoneNo = 8839435;*/
		
		//Assigning by setter method for data member are private
		//It is called Encapsulation --> Data member Private and Getting and accessing
		//                               by getter and setter
		e1.setEmpId(79);
		e1.setEmpName("Prashant");
		e1.setEmpPhoneNo(8839435657L);
		
		//assigning value
		e2.setEmpId(68);
		e2.setEmpName("Ram");
		e2.setEmpPhoneNo(7089568657L);
		
		//Copy Constructor Default
		//e3 will point to e1 same memory address
		//change in e3 will change e1
		//as object is reference to memory location
		Employee e3 = e1;
		
		e3.setEmpName("Changed");
		
		e1.displayEmpDetails();
		e2.displayEmpDetails();
		e3.displayEmpDetails();
		
		System.out.print("Employe Id of Object E1 is:");
		System.out.println(e1.getEmpId());;
	}

}
