package com.sreenu.readingwordcount;

public class CheckingRepeatedWordsInTwoSeentences {

	
	
	public static void main(String[] args) {
		
		String string1 = "Java World";
		String string2 = "Welccome to Hello World of Java learn Java World";
		String [] values = string1.split(" ");
		String [] array = string2.split(" ");
		for(int i=0;i<values.length;i++) {
			String res = values[i];
			int count=0;
			for(int j=0;j<array.length;j++) {
				if(res.equals(array[j])) {
					count++;
				}
				
			}System.out.println(res+" is repeated "+count);
		}
	}
}
