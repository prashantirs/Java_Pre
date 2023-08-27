package com.run;

 public class FinalDemo {
	final int p = 79;
	
	public void a() {
		final Book book1 = new Book();
		Book book2 = new Book();
		book1 = book2; //can't do
	}
	
	final public void b() {
		p++; //variable's value cannot be changed once it has been initialized.
		     // This creates a constant variable.
	}
	
	/*Final Method: When you declare a method as final, it means that the method 
	 *cannot be overridden by subclasses. Subclasses won't be able to provide a
	 * different implementation for the final method.
	*/
		
	public void c() {
		
	}

}

//Final class cannot be extended (Not inherited)
class Demo extends FinalDemo{
	
	//cannot override final method
	public void b() {
		
	}
	 
	
}


/* final public class FinalDemo {
   
   //This Class is final and now no any other child class can inherit it
    * child class == subclass
 
}
*/

/*
 
  //Final class cannot be extended (Not inherited)
 * class Demo extends FinalDemo{
	
	
	}
}
  */
