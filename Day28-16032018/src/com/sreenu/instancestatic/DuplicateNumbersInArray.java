package com.sreenu.instancestatic;

public class DuplicateNumbersInArray {


	public static void main(String[] args) {
		
		int values[]= {2,3,5,2,3};
		
		for(int i=0; i<values.length; i++) {
			int count =0;
			for(int j=0;j<values.length; j++) {
				
				if(values[i] == values[j]) {
					count++;
				}
			}if(count>1) {
				
				
				System.out.println(values[i] + "Is repeated "+count);
			}
		
	}}
	
	
}
