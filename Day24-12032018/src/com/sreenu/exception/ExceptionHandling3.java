package com.sreenu.exception;

public class ExceptionHandling3 {

	
	public static void main(String[] args) {
		
		String s1 ;
		
		try {
		s1 = null;
		s1.length();
		System.out.println("try block");
	}catch(NullPointerException ne) {
		System.out.println("In the catch");
	}
		System.out.println("In the main after try catch");
	}
}
