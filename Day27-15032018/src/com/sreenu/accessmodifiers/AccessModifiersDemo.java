package com.sreenu.accessmodifiers;

public class AccessModifiersDemo {
	
	
	String country;
	public String name;
	private String address;
	protected String city;
	
	void countryMethod() {
		
		System.out.println("Default methodCountry "+country);
	}
	
	public void nameMethod() {
		System.out.println("public nameMethod "+name);
	}
	private void addressMethod() {
		System.out.println("private addressMethod "+ address);
	}
	protected void cityMethod() {
		System.out.println("protected cityMethod "+ city);
	}
	

}
