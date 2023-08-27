package packA;

public class AnotherClassA {
	
	int EmpId = new ClassA().id;
	
	public void demo(){
	
		int EmpId = new ClassA().id;
		int Protectedsalary = new ClassA().salary;
		int PrivatePin = new ClassA().pin;	 //Can't access
	}
}
