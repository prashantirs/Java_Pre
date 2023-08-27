package com.run;

import com.hasa.Address;
import com.hasa.Employee;

public class EmployeeRunner {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setEmpId(101);
		emp1.setEmpName("Prashant");
		emp1.setEmpPhone(8869212415l);
	
		//anonymous array we pass
		//new Address[] {"1","2"}
		emp1.setEmpAddress(new Address[] {
				new Address("B-718","Sector 13","486884"),
				new Address("N-465","NTPC","506884"),
		});
		
		Employee emp2 = new Employee();
		emp2.setEmpId(102);
		emp2.setEmpName("Shashank");
		emp2.setEmpPhone(896212415l);
		emp2.setEmpAddress(new Address[] {
				new Address("B-718","Sector 13","486884"),
		});
		
		Employee emp3 = new Employee();
		emp3.setEmpId(103);
		emp3.setEmpName("Pushpendra");
		emp3.setEmpPhone(7089212415l);
		emp3.setEmpAddress(new Address[] {
				new Address("A10","Jabalpur","486884"),
				new Address("C-89","NTPC","506884"),
		});
	

		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
	}

}
