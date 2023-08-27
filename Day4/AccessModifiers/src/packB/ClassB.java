package packB;

import packA.ClassA;

public class ClassB {
	public void demo() {
		//public accessible
		int id = new ClassA().id ;
		
		//Protected can't be accessible as different package
		int salary = new ClassA().salary; //protected can't
		int pin = new ClassA().pin; //private can't  
		
		//default of ClassA can't be accessible in different package
		//new ClassA().
	}
}
