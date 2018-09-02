package com.sreenu.whileloopproject;

public class ReverseNumber {

	public static void main(String[] args) {
		int a = 12356;
		while(a>0) { //12356>0, 1235>0, 
			System.out.print(a%10); // 12356%10 = 6, 1235%10 = 5
			a=a/10;   //12356/10= 1235, 1235/10 = 123
		}
	}
}
