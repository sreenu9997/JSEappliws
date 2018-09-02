package com.sreenu.fibonacci;

public class PrintSeriesofSquareusingarray {

	public static void main(String[] args) {
		int num = 25;
		int result[] = getSquare(num);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
	
	public static int[] getSquare(int number) {
		int value[] = new int[25];
		int index = 0;
		
		for (int i =1; i<=number; i++) {
		value[index] = i*i;
		index++;
		
		}
		return value;
	}
}
