package com.sreenu.whileloopproject;

public class WhileReverseNumber {

	public static void main(String[] args) {
		int a = 1256;
		int b= 0;
		while(a>0) {
			b= (b*10) + a%10; // (0*10) + (1256% 10 = 6) = 0+6
							//(6*10) + (125%10 = 5) = 60+5
							//(65+10) + (12%10 = 2) = 650+2
							//(652*10)+(1%10 = 1) = 6520+1
			a = a/10;
			
		}
	
	System.out.println("Revesre number : "+b); //6521
	}
}
