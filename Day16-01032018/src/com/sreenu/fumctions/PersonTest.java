package com.sreenu.fumctions;

public class PersonTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.age = 25;
		person.name = "Sreenu";
		person.city = "Hyderabad";
		person.gender = "Male";
		person.id = 1;
		
		System.out.println("ID :: " +person.id+", Name :: "+person.name +", Gender :: "+ person.gender +", Age :: "+ person.age +", City :: "+ person.city);
	}
}
