package com.sreenu.ifMarks;

public class If_Distinction {
	
	public static void main(String [] args) {
		
		
		int marks = 70;
		
		if (marks >=80) {
			System.out.println("Distinction");
			
		}
		if(marks>= 70) {
			System.out.println("First class");
		}
		if(marks>= 60) {
			System.out.println("Second class");
		}
		if(marks>=50) {
			System.out.println("third class");
		}
		if (marks>= 35) {
			
			System.out.println("Passed");
		}
		
		if (marks<35) {
			System.out.println("Failed");
		}
	}

}
