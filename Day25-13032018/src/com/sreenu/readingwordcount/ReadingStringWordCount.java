package com.sreenu.readingwordcount;

public class ReadingStringWordCount {

	
	
	public static void main(String[] args) {
		
		String string = " Hello World Welcome to the World of Java Java Language Tutorial of Java Welcomes you heartly welcome";
		String [] array= string.split(" ");
		int countRepeated=0;
		for(int i=0;i<array.length;i++) {
			if(array[i].equals("World")) {
				countRepeated++;
			}
			//System.out.println(array[i]);
		}
		System.out.println("World repeated ::"+countRepeated);
	}
}
