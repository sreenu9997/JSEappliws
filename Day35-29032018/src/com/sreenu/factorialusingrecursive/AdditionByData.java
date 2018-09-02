package com.sreenu.factorialusingrecursive;

import java.util.Scanner;

public class AdditionByData {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.print("Enter Number :: ");
		int data = getData(number);
	System.out.println(data);
	
	scanner.close();
	}
	public static int getData(int number) {
		if(number==0)
			return 0;
		int result = number+getData(number-1) ;
		return result;
		
	}

}
