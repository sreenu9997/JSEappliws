package com.sreenu.staticvar;

public class SIMCardTest {

	public static void main(String[] args) {
		
		SIMCard.network="Voda";
		SIMCard simcard = new SIMCard();
		simcard.imeino="2152";
		
		System.out.println(SIMCard.network);
		System.out.println(simcard.network);
	}
}
