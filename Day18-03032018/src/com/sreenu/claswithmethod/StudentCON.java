package com.sreenu.claswithmethod;

public class StudentCON {

	
	int marks1;
	int marks2;
	int marks3;
	
	
	public StudentCON(int m1, int m2, int m3) {
		
		marks1=m1;
		marks2=m2;
		marks3=m3;
		
		System.out.println("Hello Constructor");
	}
	
int getTotal(){
	int total = marks1+ marks2+marks3;
	return total;
}
int avgMarks() {
	int average =(marks1+marks2+marks3)/3;
	return average;
}
String getStatus() {
	if(marks1>=35 && marks2>=35 && marks3>=35) {
		return "Pass";
		}
	else {
		return "Fail";
	}
}


}
