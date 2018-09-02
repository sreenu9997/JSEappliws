package com.sreenu.array;

public class EvenNumbersinArraywhileloop {
	public static void main(String[] args) {
	
		int a[] = new int[10];
		a[0] = 16;
		a[1] = 15;
		a[2] = 11;
		a[3] = 19;
		a[4] = 33;
		a[5] = 12;
		a[6] = 25;
		a[7] = 18;
		a[8] = 19;
		a[9] = 28;
		int i=0;
		while(i<=a.length-1) {
			if(a[i]%2 ==0) {
				System.out.println(a[i]);
			}i=i+1;
		}System.out.println("Length of array :: "+a.length);
		System.out.println(a[a.length-6]);
}
}
