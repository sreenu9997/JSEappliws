package com.sreenu.claswithmethod;

public class EmployeeClass {

	int salary;
	int quarter1;
	int quarter2;
	int quarter3;
	String name;
	String address;
	
	int getTotalPerformance(){
		
		int result = quarter1 + quarter2 + quarter3;
		return result;
	}
	int averagePerformance() {
		
		int average = (quarter1+quarter3+quarter2)/3;
		return average;
	}
	String getPerformanceStatus(){
		
		if(quarter1>= 60 & quarter2 >=60 & quarter3>=60) {
			return "Good Performance";
		}else {
			return " Bad Performance";
		}
	}
	
}
