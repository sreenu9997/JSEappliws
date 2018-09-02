package com.sreenu.time;

public class PrintEvenOdd {

	public static void main(String [] args) {
		int number = 100;
		for (int i=0;i<=number; i++) {
			if(i%2==0) {
				System.out.println(i+ " :: Even");
			}else if(i%2==1) {
				System.out.println(i+" :: Odd ");
			}
		}
	}
}
