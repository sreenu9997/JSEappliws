package com.sreenu.methodoverridingtest;

public class StudentMainTest {

	public static void main(String[] args) {
		StudentOverridingTwo studentOverridingTwo = new StudentOverridingTwo();
		studentOverridingTwo.test();
		System.out.println("===============================");
		
		StudentOverriding studentOverriding = new StudentOverriding();
		studentOverriding.test();
		
		
	}
	
}
