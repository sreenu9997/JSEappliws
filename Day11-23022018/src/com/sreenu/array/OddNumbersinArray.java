package com.sreenu.array;

public class OddNumbersinArray {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 16;
		a[1] = 15;
		a[2] = 11;
		a[3] = 19;
		a[4] = 33;
		for(int i=0;i<=4;i++) {
			if(a[i]%2 ==1) {
				System.out.println(a[i]);
			}
		}
	}

}
