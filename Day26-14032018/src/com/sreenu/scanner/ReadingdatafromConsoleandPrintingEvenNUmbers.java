package com.sreenu.scanner;

import java.util.Scanner;

public class ReadingdatafromConsoleandPrintingEvenNUmbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int value = scanner.nextInt();
				
		for(int i=1;i<=value;i++) {
			
			if(i%2 == 0)
				System.out.print(" "+i+" ");
		}
		scanner.close();
	}
}
