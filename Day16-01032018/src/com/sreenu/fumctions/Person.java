package com.sreenu.fumctions;

public class Person {

	
	int id;
	String name;
	String gender;
	String city;
	int age;
	
	
	boolean isTechnicalPerson() {
		
		if(age>25)
			return true;
		else
			return false;
	}
}
