package com.sreenu.classbwithmethods;

public class BankaaccountTest {

	public static void main(String[] args) {
		
	BankAccount bank = new BankAccount();
	bank.open(123547, "Sreenu");
	bank.deposit(30000);
	bank.withdraw(25000);
	bank.deposit(65000);
	bank.withdraw(45000);
	
	float bal = bank.checkBalance();
	System.out.println(bal);
	
	
}
}