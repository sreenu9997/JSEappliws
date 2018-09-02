package com.sreenu.array;

public class PrimeNumbers1to100 {

	public static void main(String[] args) {
		
		int i =0;
		int num = 0;
		 String prime = "";
		 
		 int count =0;
		 
		 for(i =0; i<=100; i++){
			 for(num = i; num>=1;num--) {
				 if(i%num == 0) {
					 count = count+1;
				 }
			 }
			 if(count == 2) {
				 prime = prime + i + " ";
			 }
		 }
		
		System.out.println(" Prime Numbers from 1 to 100 ");
		System.out.println(prime);
	}
}
