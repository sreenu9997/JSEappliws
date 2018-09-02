package com.sreenu.classbwithmethods;

public class BankAccount {

	int accountNo;
	String custName;
	float balance;
	
	
	void open(int accountNumber, String customerName) {
		
		accountNo = accountNumber;
		custName = customerName;
	}
	void deposit(float amount) {
		balance = balance+amount;
	}
	void withdraw(float amount) {
		balance = balance-amount;
		}
	float checkBalance() {
		return balance;

		 
	}
	
	
	
}
