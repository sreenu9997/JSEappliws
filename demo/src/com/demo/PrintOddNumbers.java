package com.demo;

public class PrintOddNumbers {

	public static void main(String [] args) {
		
		for (int i=0; i<=100; i=i+1) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}
	}
}