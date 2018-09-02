package com.sreenu.first;

public class FirstProgram {
	
	public int number;
	public String name;
	int phoneNumber;
	
	
	public FirstProgram() {
	System.out.println("default constructor");
	}
	
	public FirstProgram(int no, String sname, int pno) {
		
		this.name = sname;
		this.number = no;
		this.phoneNumber = pno;
		
		System.out.println("Parameterized constructor");
		
		
		
	}
	
	
	public String getDetails(){
		
		String result =  number + name + phoneNumber;
		return result;
		
	}
	
	
	

}
