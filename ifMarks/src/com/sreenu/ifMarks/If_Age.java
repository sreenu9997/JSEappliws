package com.sreenu.ifMarks;

public class If_Age {
public static void main(String [] args) {
	int age = 80;
	if( age >=1 & age <=15) {
		System.out.println("Child");
	}
	if (age>=16 & age<=25) {
		System.out.println("Teenager");
	}
	if (age>=26 & age<=35) {
		System.out.println("Young");
	}
	if (age>=36 & age<=45) {
		System.out.println("Middle ager");
	}
	if (age>=46 | age<=70) {
		
		System.out.println("oldage");
	}
}
}
