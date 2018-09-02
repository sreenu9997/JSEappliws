package com.sreenu.claswithmethod;

public class StudentClass {

	int marks1;
	int marks2;
	int marks3;
	String name;
	String sno;
	
	int total() {
		int result = marks1 + marks2+ marks3;
		return result ;
	}
	int avg() {
		int avgResult = (marks1 + marks2+ marks3)/3;
		return avgResult;
	}
	String getStatus() {
		if(marks1>=35 && marks2>=35 && marks3>=35) {
			return "pass";
		}
		else {
			return "fail";
		}
		
	}
	
}
