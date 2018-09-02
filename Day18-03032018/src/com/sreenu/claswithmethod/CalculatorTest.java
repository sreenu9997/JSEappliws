package com.sreenu.claswithmethod;

public class CalculatorTest {

	
	public static void main(String[] args) {
		
		CalculatorCon cc = new CalculatorCon(25, 5);
		cc.addition();
		System.out.println(cc.total);
		cc.substraction();
		System.out.println(cc.total);
		cc.multiplication();
		System.out.println(cc.total);
		cc.division();
		System.out.println(cc.total);
		
	}
}
