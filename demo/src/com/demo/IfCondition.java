package com.demo;

public class IfCondition {

	public static void main (String [] args) {
		int sellingPrice = 80;
		int costPrice = 80;
		int result = sellingPrice - costPrice;
		if(result>0) {
			System.out.println("pofit is :: "+result);
		}
		if (result<0) {
			
			System.out.println("loss is :: "+result);
		}
		if(result == 0) {
			System.out.println("NO Loss No Profit");
		}
	}
}
