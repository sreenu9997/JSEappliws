package com.sreenufilewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args){
		
		try {
		FileWriter fileWriter= new FileWriter("F:\\IODemo\\sree.txt",true);
		
		fileWriter.write(" Welcome to the world of Java");
		fileWriter.write(" Heartly welcomes you");
		fileWriter.flush();
		fileWriter.close();
		System.out.println("Completed....");
	}catch(IOException ie) {
		System.out.println(ie);
	}
	}
}
