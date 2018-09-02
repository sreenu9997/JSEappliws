package com.sreenu.time;

public class SimpleInterest {
	
	public static void main(String [] args) {
		
		int principal = 10000;
		int time = 12;
		int rate = 2;
		int interest = principal*time*rate/100;
		System.out.println("Total Interest :: " +interest);
		int totalAmount = principal + interest;
		System.out.println("Total Amount :: " + totalAmount);
	}

}
