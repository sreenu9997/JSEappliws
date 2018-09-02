package com.sreenu.array;

public class EvenNumbers1to20inArray {

	public static void main(String[] args) {
		int even[] = new int[10];
		int count = 0;
		for(int i =1; i<=20;i++) {
			if(i%2 == 0) {
				even[count] = i;
				count++;
			}
		}
		for(int i=0; i<=even.length-1;i++) {
			System.out.println(even[i]);
		}
		
	}
}
