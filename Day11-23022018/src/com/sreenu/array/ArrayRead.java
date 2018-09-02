package com.sreenu.array;

public class ArrayRead {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 52;
		a[1] = 62;
		a[2] = 12;
		a[3] = 32;
		a[4] = 56;
		
		int total = 0;
		for (int i=0;i<=4; i++) {
			total = total + a[i];
		
		}
		System.out.println(total);
	}
}
