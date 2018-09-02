package com.sreenufilewriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingDataAndTransferingDatatoAnotherFile {
	
	
	public static void main(String[] args) {
		try {
			
		
		FileReader fileReader = new FileReader("F:\\IODemo\\input.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String stringLine = bufferedReader.readLine();
		
		
		FileWriter fileWriter = new FileWriter("F:\\IODemo\\timeout.txt",true);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		while(stringLine!=null) {

			
			// write the data in to the output.txt file
			
			bufferedWriter.write(stringLine);
			bufferedWriter.newLine();
			stringLine = bufferedReader.readLine();
			
		}
		
		bufferedReader.close();
		bufferedWriter.close();
		fileReader.close();
		fileWriter.close();
	//	System.out.println(stringLine);
		
	}catch(IOException ie) {
		System.out.println(ie);
	}
	}

}
