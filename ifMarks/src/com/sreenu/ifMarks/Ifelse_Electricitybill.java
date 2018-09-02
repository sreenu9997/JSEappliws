package com.sreenu.ifMarks;

public class Ifelse_Electricitybill {

	public static void main(String [] args) {
		int startUnits = 50;
		int endUnits = 520;
		int consumedUnits = endUnits-startUnits;
		if (consumedUnits<=100) {
			int total = consumedUnits * 1;
			System.out.println("Total Price = " +total);
		}
		if (consumedUnits>=100 & consumedUnits<=200) {
			int total = consumedUnits*2;
			System.out.println("Total Price = "+total);
		}
		if(consumedUnits>300){
			int total=consumedUnits*3;
			System.out.println("Total Price = "+ total);
		}
	}
}
