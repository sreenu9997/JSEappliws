package com.sreenu.ioexception;

import java.io.FileReader;
import java.io.IOException;

public class Readingfile {

	
	
	public static void main(String[] args) {
		
try {
		FileReader fileReader = new FileReader("F:\\vijay.txt");
		int ch =fileReader.read();
		System.out.println(ch);
		fileReader.close();
	}catch(IOException ie) {
		System.out.println(ie);
	}
	}
}
