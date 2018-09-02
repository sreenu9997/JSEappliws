package com.sreenu.abstraction;

import java.util.Scanner;



public class AbstractionHiding {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number :: ");
		int number = scanner.nextInt();
		while(number != 9) {

			System.out.print("Enter Number :: ");
			 number = scanner.nextInt();

		}
		scanner.close();
		System.out.println("Done");
		
	}
	
	
	
}
