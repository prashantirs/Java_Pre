package packA;

public class SubClassA extends ClassA {
	//SubClass mean inherited class
	int id = new SubClassA().id;
	int Protectedsalary = new SubClassA().salary;	
	
	
	public void demo() {
		 //new SubClassA(). 
		//public, protected accessible
		//private not accessible
	    int id = new SubClassA().id;	
	    int Protectedsalary = new SubClassA().salary;	
	    int PrivatePin = new SubClassA().pin;	 //Can't access
	}
}
