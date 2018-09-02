package com.sreenu.fumctions;



public class Persontest2 {

	public static void main(String[] args) {
		
	Person p = new Person();
	p.name = "Sreenu";
	p.age = 35;

	Person p3 = new Person();
	p3.age = 26;
	p3.name = "Sri";
	
	Person p2 = new Person();
	p2.age = 22;
	p2.name = "Sree";
	boolean result = p3.isTechnicalPerson();
	System.out.println(result);
}
}
