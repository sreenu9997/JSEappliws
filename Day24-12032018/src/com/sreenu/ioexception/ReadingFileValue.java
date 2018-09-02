package com.sreenu.ioexception;


import java.io.FileReader;
import java.io.IOException;

public class ReadingFileValue {

	
	public static void main(String[] args) {
		
		try {
			
			FileReader fileReader = new FileReader("F:\\vijay.txt");
			int ch= fileReader.read();
			System.out.println(ch);
			System.out.println((char)ch);
			fileReader.close();
		}
		 catch (IOException e) {
			
			e.printStackTrace();
		}
	}	
}
