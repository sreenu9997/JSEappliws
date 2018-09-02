package com.sreenu.fumctions;

public class Address {

	int pin ;
	String city;
	String dNo;
	String state;
	
	
	String getArea() {
		if(pin == 1) {
			return "a1";
		}
		else if(pin == 2) {
			return "a2";
		}
		else {
			return "a3";
		}
	}
	
	
	
}
