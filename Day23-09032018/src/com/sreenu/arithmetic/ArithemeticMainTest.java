package com.sreenu.arithmetic;

public class ArithemeticMainTest {

	
	public static void main(String[] args) {
		
		
		ClassArithmetic ca = new ClassArithmetic();
		ca.value1=25;
		ca.value2=0;
		int result = ca.getResult();
		
		System.out.println(result);
	}
}
