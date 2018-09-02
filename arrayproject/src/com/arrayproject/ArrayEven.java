package com.arrayproject;

public class ArrayEven {

	public static void main(String [] args) {
		int a[] = new int[10];
		for (int i=0; i<=9;i++) {
			a[i] = i*2;
			}
		for (int i=0; i<=9;i++) {
			System.out.println(a[i]);
		}
	}
}
