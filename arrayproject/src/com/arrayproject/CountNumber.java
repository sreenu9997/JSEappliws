package com.arrayproject;

public class CountNumber {

	public static void main(String[] args) {
		int number = 29;
		int count = 0;
		for (int i=1;i<=number;i++) {
			if(number%i == 0) {
				count =count+1;
			}
		}
		System.out.println(count);
		if(count ==2) {
			System.out.println("This is a Prime number :: "+number);
		}else {
			System.out.println("This is not a Prime Number :: "+number);
		}
	}
}
