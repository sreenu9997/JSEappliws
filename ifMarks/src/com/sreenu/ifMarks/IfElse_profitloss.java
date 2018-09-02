package com.sreenu.ifMarks;

public class IfElse_profitloss {
	
	public static void main(String [] args) {
		
		float costPrice = 50.58f;
		float sellingPrice = 30.58f;
		
		float result = sellingPrice- costPrice;
		
		if(result >0) {
			System.out.println("Total Profit :: "+result);
		}
		else if (result< 0) {
			System.out.println("Total Loss ::"+result);
		}
		else if(result==0){
			System.out.println("No Profit No Loss");
		}
	}

}
