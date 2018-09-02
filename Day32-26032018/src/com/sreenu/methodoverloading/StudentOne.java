package com.sreenu.methodoverloading;

public class StudentOne {

	
	
	public void test() {
		
		System.out.println("Test method"+getClass());
	}
}
class StudentTwo extends StudentOne{
	
	public void test(String name) {
		System.out.println("Test method"+getClass()+"  :: "+name);
	}
}
class StudentThree extends StudentTwo{
	public void test(int number) {
	System.out.println("Test method"+getClass()+"  :: "+number);	
	}
}