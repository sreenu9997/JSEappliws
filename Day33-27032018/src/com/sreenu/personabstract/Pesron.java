package com.sreenu.personabstract;

import com.sreenu.person.Person;

public abstract class Pesron {
	
	private String name;
	private int age;
	
	public abstract void gotoWork();
	

}
class Employee extends Person{
	private int empID;
	
}