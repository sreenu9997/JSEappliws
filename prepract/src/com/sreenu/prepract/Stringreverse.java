package com.sreenu.prepract;

public class Stringreverse {
	
	
	public static void main(String[] args) {
		
		String string = "Hyderabad";
		
		for(int i=string.length()-1;i>=0;i--) {
			System.out.print(string.charAt(i));
		}
		
		String code= "hello india";
		System.out.println();
		String demo = code.substring(2,9);
		System.out.println(demo);
	}

}
