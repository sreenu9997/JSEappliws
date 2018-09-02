package com.sreenu.claswithmethod;

public class AccountTest {

	
	
	public static void main(String[] args) {
		
		Accountcon con = new Accountcon(5000);
		con.deposit(2500);
		con.withdraw(1000);
		con.deposit(5000);
		con.withdraw(2000);
		int bal = con.total();
		System.out.println(bal);
	}
}
