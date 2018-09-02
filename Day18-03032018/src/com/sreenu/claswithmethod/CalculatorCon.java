package com.sreenu.claswithmethod;

public class CalculatorCon {

	
	int value1;
	int value2;
	int total;
	
	public CalculatorCon(int v1, int v2) {
	value1 =v1;
	value2=v2;
	
	}
	
	void addition() {
		
		 total = value1 + value2;
	}
	void substraction() {
		total = value1-value2;
		}
	void multiplication() {
		total = value1*value2;
	}
	void division() {
		total = value1/value2;
	}
	
	
}
