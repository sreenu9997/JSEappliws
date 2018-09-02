package com.sreenu.factorialusingrecursive;

import java.util.Scanner;

public class FibonacciSeriesByPos {

	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number the Position to Get fibonacci value of the Postion :: ");
		
		int number = scanner.nextInt();
		
		int positinvalue = getFibonacciPosition(number);
		
		System.out.println(positinvalue);
		
		scanner.close();
		}
		public static int getFibonacciPosition(int pos) {
			if(pos == 1 || pos ==2 )
				return 1;
			int result = getFibonacciPosition(pos-1) + getFibonacciPosition(pos-2);
			
			return result;
		}
	
}
