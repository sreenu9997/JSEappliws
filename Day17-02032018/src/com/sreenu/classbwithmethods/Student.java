package com.sreenu.classbwithmethods;

public class Student {

	String name;
	int sub1;
	int sub2;
	int sub3;
	int total;
	float average;
	
	
	
	int totalMarks() {
		 int total = sub1+sub2+sub3;
		 return total;
		 
	}
	float averageMarks() {
		 average = (sub1+sub2+sub3)/3;
		return average;
		
	}
	String result() {
		
		if(sub1 >=35 & sub2>=35 & sub3>=35 ) {
			return "Pass";
		}else {
		return "Fail";
	}
}
}
