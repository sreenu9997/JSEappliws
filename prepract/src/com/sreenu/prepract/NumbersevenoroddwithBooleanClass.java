package com.sreenu.prepract;

import java.util.Scanner;

public class NumbersevenoroddwithBooleanClass {

	
	public static void main(String[] args) {
		
		int number;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number :");
		number = scanner.nextInt();
		boolean result = isEven(number);
		System.out.println(result);
		scanner.close();
	}
	public static boolean isEven(int num) {
		if(num%2 == 0) {
			return true;
		}else {
			return false;
		}
	}
}
