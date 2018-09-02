package com.sreenu.split;

public class StringSplit {

	
	public static void main(String[] args) {
		
		
		
		//String s1 = new String("Java;");
				
		String s2 = "Slokam Tech Solutions Pvt Ltd";
		String [] values = s2.split(" ");
		for(int i=0;i<=values.length-1;i++) {
		System.out.println(values[i]);
		}
		System.out.println("++++++++++++++++++++++++");
		for(int i=values.length-1;i>=0;i--) {
			System.out.println(values[i]);
		}
	}
	
	
	
}
