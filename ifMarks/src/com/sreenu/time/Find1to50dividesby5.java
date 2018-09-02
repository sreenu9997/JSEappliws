package com.sreenu.time;

public class Find1to50dividesby5 {
 public static void main(String [] args) {
	int count = 0;
for (int i=1;i<=50;i=i+1) {
	if(i%5==0) {
		count=count+1;
		System.out.println("The number divided by 5 Is " +i);
	}
	}
	System.out.println("Count :: "+count);
}
}
