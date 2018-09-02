package com.sreenu.ioexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLinebyLine {

	
	public static void main(String[] args) {
		try {
		FileReader fileReader = new FileReader("F:\\vijay.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String string = bufferedReader.readLine();
		while(string !=null) {
		
			System.out.println(string);
			string = bufferedReader.readLine();
		}
		bufferedReader.close();
		}catch (IOException ie) {
			System.out.println(ie);
		}
				
	}
}
