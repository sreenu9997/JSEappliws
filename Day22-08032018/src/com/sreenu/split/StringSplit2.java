package com.sreenu.split;

public class StringSplit2 {

	
	public static void main(String[] args) {
		
		String s= new String("Welcome,to,Java,world");
		String[] values = s.split(",");
		
		for(int i=0;i<=values.length-1;i++) {
			System.out.println(values[i]);
		}
	}
}
