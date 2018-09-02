package com.sreenu.scanner;

import java.util.Scanner;

public class ReadingdatafromConsoleandReverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the data : ");
		String string = scanner.nextLine();
		String [] array = string.split(" ");
		char ch;
		for(int i=0;i<=array.length-1;i++) {
			if(array[i]!=null) {
				for(int j=array[i].length()-1;j>=0;j--) {
				ch = array[i].charAt(j);
					System.out.print(ch);
			}
			System.out.print(" ");
			}
		}	scanner.close();	
	}
}
