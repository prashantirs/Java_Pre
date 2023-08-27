package com.run;

import java.util.Calendar;

public class ControlFlow {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int M = cal.get(Calendar.MONTH);
		System.out.println(M);
		
		//If Else
		if(M > 4 && M < 9) {
			System.out.println("Rainy Season");
		}else {
			System.out.println("Not Rainy Season");
			
		}
		
		//Switch Case
		int day = 4;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		}
		
		//Array is an object in java
		int[] a = new int[30];
		System.out.println(a);
		a[0] = 1;
		a[1] = 2;
		//For Each
		for(int v:a) {
			System.out.println(v);
		}
//		Anomynous
//		new int[] {101,102,103}
		
		//2D array           [row][col]  
		int[][] ids = new int[5][];
		
		ids[0] = new int[3];
		ids[1] = new int[4];
		ids[2] = new int[3];
		
		String[][] empData = {{"101","Kim","98785"},
							  {"102","Lee","88785"},
							  {"103","park","78786"}};
		
		for(int row=0; row<empData.length; row++) {
			for(int col=0; col<empData[row].length; col++) {
				System.out.println(empData[row][col]);
			}
		}
		
		//For each loop
		for(String[] rows:empData) {
			for(String x : rows) {
				System.out.print(x+" ");
			}
			System.out.println("\t");
		}
		
		//String Array
		String[] row3= {"104","PS","98986"};
		String[][] str = new String[3][];
		
	}

}
