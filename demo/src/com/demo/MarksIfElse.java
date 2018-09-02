package com.demo;

public class MarksIfElse {

	public static void main(String [] args) {
		int marks =150;
		if(marks>=0 & marks<35) {
			System.out.println("fail");
		}
		else if (marks>=35 & marks <50) {
			System.out.println("Third class");
		}
		else if (marks >=50 & marks<60) {
			System.out.println("Second class");
		}
		else if(marks>=60 & marks<75) {
			System.out.println("First class");
		}
		else if (marks>=75 & marks<=100) {
			System.out.println("Distinction");
		}
		else {
			System.out.println("Invalid Marks");
		}
	}
}
