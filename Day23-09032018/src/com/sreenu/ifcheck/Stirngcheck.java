package com.sreenu.ifcheck;

public class Stirngcheck {
	
	
	public static void main(String[] args) {
		
		String s1 = new String("Welcome to Java");
	String[] s2 = s1.split(" ");
	for(int i=s2.length-1;i>=0;i--) {
		
		System.out.println(s2[i]);
	}
	
	System.out.println("===========");
	
	for(int i=0;i<=s2.length-1;i++) {
		System.out.println(s2[i]);
	}
			
		}
	

	
	
	
}
