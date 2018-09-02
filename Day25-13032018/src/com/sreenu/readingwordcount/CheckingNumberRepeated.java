package com.sreenu.readingwordcount;

public class CheckingNumberRepeated {

	
	public static void main(String[] args) {
		
		int number = 5;
		int array[] = {1,5,1,4,5,3,2,5,6,8,5,2,5};
		int count =0;
		for(int i=0;i<array.length;i++) {
			if(number==array[i]) {
				count++;
			}
		}
		System.out.println(number+" is Repeated "+count);
	}
}
