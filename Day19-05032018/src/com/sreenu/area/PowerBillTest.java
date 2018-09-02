package com.sreenu.area;

public class PowerBillTest {
	
	public static void main(String[] args) {
		
		
		
		PowerBill powerbill = new PowerBill(150,405);
		int result = powerbill.billAmount();
		System.out.println(result);
	}

}
