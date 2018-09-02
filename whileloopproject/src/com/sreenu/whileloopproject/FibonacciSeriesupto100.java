package com.sreenu.whileloopproject;

public class FibonacciSeriesupto100 {

	public static void main(String[] args) {
		int a=1;
		int b=1;
		System.out.print(a+" ");// 1
		System.out.print(b+" ");// 1
		int c = a+b;
		while (c<100) {
			System.out.print(c +" ");// 2
			// 1+2 = 3, 2+3 = 5, 3+5 = 8, 5+8 = 13..... 
			a=b; 
			b=c; 
			c=a+b;
		}
		
	}
}
