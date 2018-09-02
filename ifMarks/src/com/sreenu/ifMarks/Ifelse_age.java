package com.sreenu.ifMarks;


public class Ifelse_age {
/**
 * @param args
 */
public static void main(String[] args) {
	
	int age = 50;
	if (age >=1 & age<=15) {
		System.out.println("Child");
	}
	else if (age>=16 & age<=25) {
		System.out.println("Teenager");
	}
	else if (age>=26 & age<= 35) {
		System.out.println("younger");
	}
	else if(age>=36 & age<=50) {
		System.out.println("Midle ager");
	}
	else if (age>= 51 & age<=70) {
		System.out.println("oldage");
	}


}
}
