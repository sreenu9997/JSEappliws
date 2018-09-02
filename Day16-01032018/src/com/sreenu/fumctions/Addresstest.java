package com.sreenu.fumctions;

public class Addresstest {

	
	public static void main(String[] args) {
		
		Address add = new Address();
		add.pin = 2;
		add.city = "Hyd";
				
		
		
		Address adr = new Address();
		adr.city = "Koti";
		adr.pin = 1;
		
				String result = add.getArea();
				System.out.println(result);
		
				String results = adr.getArea();
				System.out.println(results);
				
				
	}
}
