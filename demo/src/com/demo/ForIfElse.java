package com.demo;

public class ForIfElse {

	public static void main(String [] args) {
		int a= 55;
		int b=56;
		if (a<20) {
			int c=13;
			for(int i = 1;i<=5;i++) {
				System.out.print("Welcome ");
				System.out.println(b+c);
			}
		}
		else {
			int d = 54;
			for(int j=0;j<5;j++) {
				System.out.print("Welcome else ");
				System.out.println(b+d);
			}
		}
	}
}
