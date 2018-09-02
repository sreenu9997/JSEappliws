package com.demo;

public class AgeTestIfElse {

	public static void main(String [] args) {
		
		int age = 15;
		if(age <= 11) {
			System.out.println("Kid");
		}
		else if(age>11 & age <=19) {
			System.out.println("Teenage");
		}
		else if(age>19 & age<=35) {
			System.out.println("Young");
		}
		else if(age>35 & age<=55) {
			System.out.println("middleage");
		}
		else if(age>55) {
			System.out.println("old");
		}
		
	}
}
