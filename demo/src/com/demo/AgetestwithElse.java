package com.demo;

public class AgetestwithElse {

	public static void main(String [] args) {
		int age =110;
		if(age<=11) {
			System.out.println("Kid");
		}
		else if(age>11 & age<=19) {
			System.out.println("teenager");
		}
		else if(age>19 & age<=35) {
			System.out.println("Youth");
		}
		else if(age >35 & age<=55) {
			System.out.println("middle age");
		}
		else if (age>55 & age<=100) {
			System.out.println("old");
		}
		else {
			System.out.println("Invalid Input Age");
		}
	}
}
