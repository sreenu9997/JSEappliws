package com.sreenu.scanner;

import java.util.Scanner;

public class ReadingInputfromConsole {

	
	
	public static void main(String[] args) {
		
		
		
	
				
				Scanner scanner = new Scanner(System.in);
				System.out.println("ENter the int value data : ");
				int value = scanner.nextInt();
				System.out.println("The value is : "+value);

				
				scanner.close();
		

	}
}
