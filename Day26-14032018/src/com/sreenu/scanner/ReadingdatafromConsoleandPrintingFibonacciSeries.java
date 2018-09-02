package com.sreenu.scanner;

import java.util.Scanner;

public class ReadingdatafromConsoleandPrintingFibonacciSeries {
	
	
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number : ");
		
		int value = scanner.nextInt();
		
		int a=0;
		int b=1;
		int c=1;
		System.out.print(b+" ");
		while(c<value) {
				System.out.print(c+" ");
			a=b;
			b=c;
			c=a+b;			
			}
		scanner.close();
		}
	}
