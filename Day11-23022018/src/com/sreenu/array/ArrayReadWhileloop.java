package com.sreenu.array;

public class ArrayReadWhileloop {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 23;
		a[1] = 13;
		a[2] = 43;
		a[3] = 33;
		a[4] = 53;
		int total = 0;
		int i= 0;
		while(i <=4) {
			total = total+ a[i];
			i= i+1;
			
		}
		System.out.println(total);
	}
}
