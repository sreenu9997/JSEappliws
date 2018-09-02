package com.sreenu.ioexception;

import java.io.FileReader;
import java.io.IOException;

public class ReadingFileCharbyChar {

	public static void main(String[] args) {
		try {
		FileReader fileReader = new FileReader("F:\\vijay.txt");
		int ch = fileReader.read();
	
		while(ch!=-1) {
		System.out.print((char)ch);
		ch = fileReader.read();
		}
		fileReader.close();
	}
	catch (IOException ie) {
		System.out.println(ie);
	}
	
	
	}
}
