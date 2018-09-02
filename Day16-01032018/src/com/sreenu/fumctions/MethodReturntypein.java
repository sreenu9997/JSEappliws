package com.sreenu.fumctions;

public class MethodReturntypein {

	public static void main(String[] args) {
		
		char ch = getMethodreturn("Sreenu", 0);
		System.out.println(ch);
		
		
		String s1 = "Sanjay";
				String s2 = "Sanjay";
				
				
		if (s1 == s2) {
			System.out.println("good");
		}
		
		if(s1.equals(s2)) {
			System.out.println("poor");
		}
	}
	public static char getMethodreturn(String string , int position) {
		char character = string.charAt(position);
		return character;
	}
}
