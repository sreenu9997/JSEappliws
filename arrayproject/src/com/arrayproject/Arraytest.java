package com.arrayproject;

public class Arraytest {

	public static void main(String [] args) {
		int a[] = new int[10];
		for (int i = 0; i<=9; i++) {
			a[i] = i;
		}
		for (int i=0; i<=9; i++) {
			System.out.print(a[i]+" : ");
		}
	}
}
