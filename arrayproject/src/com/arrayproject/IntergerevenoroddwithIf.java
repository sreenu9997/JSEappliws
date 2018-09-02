package com.arrayproject;

public class IntergerevenoroddwithIf {

	public static void main(String[] args) {
		int number = 18;
		if(number % 2 ==1) {
			System.out.println("FINE");
		}
		else {
			if(number>=2 & number<=8) {
				System.out.println("Not fine");
			}
			else if(number>8 & number<=20) {
				System.out.println("fiNE");
			}
			else if(number> 20) {
				System.out.println("Fine");
			}
		}
	}
}
