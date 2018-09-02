package com.sreenu.factorialusingrecursive;

import java.util.Scanner;

public class FibonacciSeriesPosition {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number :: ");
		int number = scanner.nextInt();
		
		int data = getFibonacciPosition(number);
		System.out.println(data);
		scanner.close();
	}
	
	public static int getFibonacciPosition(int pos) {
		
		int i = 1;
		int j = 1;
		int k = j+i;
		for(int l = 3; l<pos; l++) {
			
			i=j;
			j=k;
			k = i+ j ;
			
		}
		return k;
	}

}
