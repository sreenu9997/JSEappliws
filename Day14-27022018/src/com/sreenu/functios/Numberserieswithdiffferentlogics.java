package com.sreenu.functios;

public class Numberserieswithdiffferentlogics {

	public static void main(String[] args) {
		
		int count =1;
		for (int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i*count +" ");
				count++;
			}
		}
	}
}
