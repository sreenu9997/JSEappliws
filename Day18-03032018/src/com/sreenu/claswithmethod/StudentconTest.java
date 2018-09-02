package com.sreenu.claswithmethod;

public class StudentconTest {

	
	public static void main(String[] args) {
		
		StudentCON sc = new StudentCON(65, 68, 95);
		
		
		int total = sc.getTotal();
		System.out.println(total);
		
		int average = sc.avgMarks();
		System.out.println(average);
		
		String status = sc.getStatus();
		System.out.println(status);
		
	}
}
