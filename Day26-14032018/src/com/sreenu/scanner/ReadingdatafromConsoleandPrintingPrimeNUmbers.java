package com.sreenu.scanner;

import java.util.Scanner;

public class ReadingdatafromConsoleandPrintingPrimeNUmbers {

	
	
	
	public static void main(String[] args) {
		int count =0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number : ");
		
		int number = scanner.nextInt();
		
		for(int i=1;i<=number;i++) {
			
			if(number%i==0) {
				count++;
			}
		}
			if(count==2) {
				
				System.out.println(number+" is a Prime Number");
			}
			else {
				System.out.println(number+" Not a Prime Number");
			}
		
		
		scanner.close();
	}
}
