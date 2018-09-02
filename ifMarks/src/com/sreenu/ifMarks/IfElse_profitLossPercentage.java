package com.sreenu.ifMarks;

public class IfElse_profitLossPercentage {
	
			
		public static void main(String [] args) {
			
			float costPrice = 50.58f;
			float sellingPrice = 150.58f;
			
			float result = sellingPrice- costPrice;
			
			if(result >0) {
				System.out.println("Total Profit :: "+result);
				float profitPercentage = (result*100)/costPrice;
				System.out.println("Total Profit % is :: "+ profitPercentage);
			}
			else if (result< 0) {
				System.out.println("Total Loss :: "+result);
				float lossPercentage = (result*100)/costPrice;
				System.out.println("Total Loss % is :: "+ lossPercentage);
			}
			else if(result==0){
				System.out.println("No Profit No Loss");
			}
		}

	}

