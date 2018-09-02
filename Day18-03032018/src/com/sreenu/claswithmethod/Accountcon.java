package com.sreenu.claswithmethod;

public class Accountcon {

	int balance;
	int accountNumber;
	String Name;
	
	
	public Accountcon(int amount) {
		balance = amount;
	
	}
	
	int deposit(int amount) {
		balance = balance+amount;
		return balance;
	}
	int withdraw(int amount) {
		balance = balance - amount;
		return balance;
	}
	int total() {
		
		return balance;
	}
}
