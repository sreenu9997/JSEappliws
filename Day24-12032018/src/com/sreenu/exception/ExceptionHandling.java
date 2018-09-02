package com.sreenu.exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int x = 15;
		int y = 3;
		System.out.println("Before the try block");
		try {
			
			int z = x/y;
			System.out.println(z);
			System.out.println("In the try block");
		}
		catch(ArithmeticException ae) {
			System.out.println("In the Catch block");
		}
		System.out.println("After the Try & catch blocks ");
	}
}
