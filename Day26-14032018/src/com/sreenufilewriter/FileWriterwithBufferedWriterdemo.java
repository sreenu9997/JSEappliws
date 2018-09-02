package com.sreenufilewriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterwithBufferedWriterdemo {
	
	public static void main(String[] args) {
		
		
		try {
		FileWriter fileWriter = new FileWriter("F:\\IODemo\\try.txt",true);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write("Weldone");
		bufferedWriter.newLine();
		bufferedWriter.write("Good Day");
		bufferedWriter.flush();
		bufferedWriter.close();fileWriter.close();
		System.out.println("done");
	
	}	
	catch(IOException ie) {
		System.out.println(ie);
	}
	}

}
