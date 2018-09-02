package com.sreenu.exception;

public class ExceptionHandling2 {

public static void main(String[] args) {
		
	int x = 60;
	int y = 0;

	System.out.println("Before try");
	
	try {
		int z=x/y;
		System.out.println("Risky statements");
		System.out.println("In the try block");
		System.out.println(z);
	}catch(ArithmeticException ae) {
		System.out.println("in the catch");
	}
	System.out.println("after catch");
}
}