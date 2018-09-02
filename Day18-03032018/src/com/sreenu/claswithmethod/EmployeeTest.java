package com.sreenu.claswithmethod;

public class EmployeeTest {

	public static void main(String[] args) {
		
		EmployeeClass ec = new EmployeeClass();
		ec.quarter1 = 75;
		ec.quarter2 = 80;
		ec.quarter3 = 95;
		
		int result = ec.getTotalPerformance();
		System.out.println(result);
		int avgper = ec.averagePerformance();
		System.out.println(avgper);
		String status = ec.getPerformanceStatus();
		System.out.println(status);
	
	
		EmployeeClass ec1 = new EmployeeClass();
		ec1.quarter1 = 50;
		ec1.quarter2 = 90;
		ec1.quarter3 = 98;
	

		int result1 = ec1.getTotalPerformance();
		System.out.println(result1);
		int avgper1 = ec1.averagePerformance();
		System.out.println(avgper1);
		String status1 = ec1.getPerformanceStatus();
		System.out.println(status1);
	
	}
}
