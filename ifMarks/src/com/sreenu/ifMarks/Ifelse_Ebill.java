package com.sreenu.ifMarks;

public class Ifelse_Ebill {
	
	
	public static void main(String [] args) {
	int preReading = 1253;
	int curReading = 1562;
	int totalReading = curReading - preReading;
	if (totalReading<100) {
		
	System.out.println(totalReading*1);
	}
	else if(totalReading<=100 & totalReading>200) {
		System.out.println(totalReading*2);
		
	}
	else if(totalReading<=200 & totalReading>300) {
		System.out.println(totalReading*3);
	}
	else {
		System.out.println(totalReading*4);
	}
	}
}
