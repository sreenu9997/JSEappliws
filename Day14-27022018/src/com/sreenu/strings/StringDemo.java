package com.sreenu.strings;

public class StringDemo {

	public static void main(String[] args) {
		
		String s = "Hello World";
		System.out.println(s);
		String s1 = new String(s);
		System.out.println(s1);
		if(s == s1) {
			System.out.println(s1);
		}
	}
}
