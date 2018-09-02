package com.demo;

public class AgeTestdemo {
public static void main(String[] args) {
	
	int age = 27;
	if(age<=11) {
		
		System.out.println("Kid");
	}
	if(age>11 && age<=19) {
		System.out.println("Teenage");
	}
	if(age>19 && age<=35) {
		System.out.println("Youth");
	}
	if(age>35 && age<=55) {
		System.out.println("Middle age");
	}
	
	if (age >55 ) {
		System.out.println("Old");
	}
}

}
