package com.sreenu.scanner;

public class IntegerDemo {
	
	public static void main(String[] args) {
		
		IntegerDemo integerDemo = new IntegerDemo();
		integerDemo.addOne(null);	// ambiguity error for string and string buffer
		
	}

	
	
	public void addOne(String i) {
		
		System.out.println(i);
	}
public void addOne(int i2) {
		
		System.out.println(" Integer :"+i2);
	}
	

}
