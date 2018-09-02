package com.sreenu.exception;

public class Exceptionavaoid {

	public static void main(String[] args) {
		
		int x = 20;
		int y = 0;
		int z = 0;
		if(y!=0) {// avoiding exception by checking the b!=0
			 z = x/y;
		}
		
		System.out.println(z);
	}
}
