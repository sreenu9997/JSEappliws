package com.sreenu.array;

public class EvenNumbersinArray {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		a[0] = 12;
		a[1] = 25;
		a[2] = 16;
		a[3] = 19;
		a[4] = 28;
		for(int i =0; i<=4; i++) {
			if(a[i]%2 == 0) {
				System.out.println(a[i]);
			}
		}
	}
}
