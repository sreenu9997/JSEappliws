package com.sreenu.fumctions;

public class Methodreturntype {

	public static void main(String[] args) {
		
		String string = "Kakinada";
		int position = 4;
		char character = getChar(string, position);
		System.out.println(character);
	}
	public static char getChar(String string , int position) {
		char ch = string.charAt(position-1);
		return ch;
	}
}
