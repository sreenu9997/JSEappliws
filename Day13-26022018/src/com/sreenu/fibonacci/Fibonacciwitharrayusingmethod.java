package com.sreenu.fibonacci;

public class Fibonacciwitharrayusingmethod {

	public static void main(String[] args) {
		
	int res[] = getEven();
	for(int i=0;i<res.length; i++) {
		System.out.print(res[i]+ " ");
	}
}
	
	public static int[] getEven() {
		int values[] = new int [50];
		int index =0;
		for(int i=1; i<=100;i++) {
			if(i%2==0) {
				values[index] = i;
				index ++;
				
			}
		}
		return values;
	}
	
	
	
}
