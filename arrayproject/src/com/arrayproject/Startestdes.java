package com.arrayproject;

public class Startestdes {

	public static void main(String [] args) {
		int number = 5;
		for(int i=1; i<=5;i++) {
			for (int j=1; j<=number;j++) {
				System.out.print(" * ");
			}
			System.out.println();
			number = number- 1;
		}
	}
}
