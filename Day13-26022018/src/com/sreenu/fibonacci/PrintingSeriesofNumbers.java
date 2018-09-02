package com.sreenu.fibonacci;

public class PrintingSeriesofNumbers {
	public static void main(String[] args) {
		
	int number = 30;
	int multiply = 1;
	int result =0;
	
	for(int i = 2; i<=number; i= i+2) {
		
		result = multiply *i; 
		
		System.out.println(result);
		multiply++;
		
		
	}
	}
}
