package com.sreenu.classbwithmethods;

public class CalcTest {

	
	public static void main(String[] args) {
		
	Calc c1 = new Calc();
	c1.value1 = 100;
	c1.value2 = 50;
	
	c1.add();
	System.out.println(c1.result);
	c1.sub();
	System.out.println(c1.result);
	c1.mul();
	System.out.println(c1.result);
	c1.div();
	System.out.println(c1.result);
}
}