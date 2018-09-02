package com.arrayproject;

public class ArrayDemoforloop {

	public static void main(String [] args) {
		int a[] = new int [6];
		a[0] = 65;
		a[1] = 45;
		a[2] = 68;
		a[3] = 26;
		a[4] = 35;
		a[5] = 95;
		System.out.println(a);
		for (int i = 0; i<=5; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
