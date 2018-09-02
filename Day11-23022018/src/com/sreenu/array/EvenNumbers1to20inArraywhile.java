package com.sreenu.array;

public class EvenNumbers1to20inArraywhile {

	public static void main(String[] args) {
		
		int even[] = new int[10];
		int count = 0;
		int i = 1;
		int j = 0;
		
		
		while(i <=20) {
			if(i%2 == 0) {
				even[count] = i;
				count++;
			}i++;
		}
		while(j<=even.length-1) {
			System.out.print(even[j]);
			j++;
		}
		System.out.println();
		System.out.println(even[even.length-1]);
	}
}
