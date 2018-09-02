package com.sreenu.fibonacci;



public class Fibonacciseries {
	
	public static void main(String[] args) {
		
		printFibonacci(100);
	}
		
		public static void printFibonacci(int number) {
			int a = 0;
			int b = 0;
			int c = 1;
			
			while(c<=number) {
				System.out.print(c+ " ");
				a=b;
				b=c;
				c=a+b;
				
			}
		}
	

}
