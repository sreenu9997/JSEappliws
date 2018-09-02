package com.sreenu.time;

public class Find1to1000divededby10 {
	
	public static void main(String [] args) {
		
		int number = 1000;
		int count =0;
		
		for (int i=1;i<=number;i=i+1) {
			if (i%10==0) {
				count = count+1;
				System.out.println("The number divided by 10 is :: "+i);
			}
			
		}System.out.println(count);
	}}

