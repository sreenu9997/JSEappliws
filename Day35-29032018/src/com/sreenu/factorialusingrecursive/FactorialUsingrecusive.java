package com.sreenu.factorialusingrecursive;

import java.util.Scanner;

public class FactorialUsingrecusive {

	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number ::");
		int number = scanner.nextInt();
		
		int data = getFact(number);
				System.out.println("Factorial of "+number+" :: "+data);
				scanner.close();
	}
	
	public static int getFact(int num) {
		
		if(num == 1)
			return 1;
		
		int result = 1;
		result = num *getFact(num-1);
		return result;
		
	}
}
