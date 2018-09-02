package com.sreenu.time;


public class PrimrnumberTest {

	
	public static void main(String [] args) {
		
		int number = 21;
		 int count = 0;
		 
		 for (int i =1; i<=number; i= i+1) {
			 if( number%i==0) {
				 count = count+1;
			 }
		 }
			 if(count==2) {
				 System.out.println(" This is a prime number ");
			  }else
			  {
				  System.out.println(" This is not a prime number ");
			  }
	
	}
}
