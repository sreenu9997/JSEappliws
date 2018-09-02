package com.sreenu.fibonacci;

public class Fibonacciseriesusingarrayinmethodlevel {
	
	public static void main(String[] args) {
		int res[] = printFibonacci(100);
		for(int i=0; i<=res.length-1;i++) {
			System.out.print(res[i]+ " ");
		}
		
	}

	
	public static int[] printFibonacci(int number) {
		
		
		int a =0;
		int b = 0;
		int c =1;
		int values[] = new int[11];
		int index = 0;
		 
		while (c<= number) {
			values[index] = c;
			index++;
			a=b;
			b=c;
			c=a+b;
		}
		
		
		return values;
	}
}
