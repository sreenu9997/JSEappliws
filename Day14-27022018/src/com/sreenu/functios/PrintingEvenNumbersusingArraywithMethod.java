package com.sreenu.functios;

public class PrintingEvenNumbersusingArraywithMethod {
	public static void main(String[] args) {
		int result[]= getEvenNumbers(10);
		for(int i=0;i<=result.length-1;i++) {
			System.out.println(result[i]);
		}
	}

	public static int[] getEvenNumbers(int number) {
		int result[]= new int[number];
		int index = 0;
		for(int i=1;i<=number*2;i++) {
			if(i%2 ==0 ) {
				result[index] = i;
				index++;
			}
		}
		return result;
	}
}
