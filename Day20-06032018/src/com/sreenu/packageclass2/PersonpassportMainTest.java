package com.sreenu.packageclass2;

import com.sreenu.packageclass.Passport;
import com.sreenu.packageclass1.Person;

public class PersonpassportMainTest {
	
	
	public static void main(String[] args) {
		
		Person person = new Person();
		
		Passport passport = new Passport();
		passport.passportId="M2534879";
		passport.issueDate = "12/04/2015";
		passport.issueLocation = "Hyderabad";
		
		person.name= "Sreenu";
		person.age= 28;
		person.gender= "male";
		person.passport= passport;
		
		
		
	}

}
