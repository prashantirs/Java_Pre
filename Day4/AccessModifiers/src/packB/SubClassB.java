package packB;

import packA.ClassA;

public class SubClassB extends ClassA {
	
	public void demo() {
		//Protected is accessible as different package
		int Id = new SubClassB().salary;
		
		//Private can;t
		int pin = new SubClassB().pin;

		//public yes
		int id = new SubClassB().id;
	}
}	

//In a file only one public class
class Prashant{
	
}