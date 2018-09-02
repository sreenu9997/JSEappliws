package com.sreenu.readingtxtfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

	public static void main(String[] args) {
		
		int words =0;
		int lines =0;
	
		try {
		FileReader fileReader = new FileReader("F:\\vijay.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String string = bufferedReader.readLine();
		
		while(string!=null) {
			String array[] =string.split(",");
		for(int i=0;i<=array.length-1;i++) {
			System.out.println(array[i]);
			words =words+1;
			
		}string = bufferedReader.readLine();
		lines =lines+1;
		}
		
			
			
		
		
		System.out.println("Word count : "+words);
		System.out.println("No.Of Lines :"+lines);
		bufferedReader.close();
		
		}	catch(IOException ie) {
			
			System.out.println(ie);
		}
		
	}
}
