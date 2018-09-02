package com.sreenu.methodoverridingtest;

public class StudentOverriding {

	public void test() {
		
		System.out.println("Test method :: StudentOverriding "+getClass());
	}
}
class StudentOverridingTwo extends StudentOverriding{
	
	public void test() {
		
		System.out.println("Test method :: StudentOverridingTwo "+getClass());
	}
}