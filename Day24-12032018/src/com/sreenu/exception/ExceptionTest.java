package com.sreenu.exception;

public class ExceptionTest {

	
	public static void main(String[] args) {
		
		int a =20;
		int b = 0;
		try {
			int c = a/b;// try block contains risky statements / un garanteed statements as well as dependent lines on  risky statements
			System.out.println(c);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("This is Exception Handling....");
		}
		System.out.println("This is Exception Handling....2");
	}
	
}
