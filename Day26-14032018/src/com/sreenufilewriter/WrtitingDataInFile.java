package com.sreenufilewriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WrtitingDataInFile {
public static void main(String[] args) {
	
	try {
		String[] string1 = {"A","B","C"}; 
	FileWriter fileWriter = new FileWriter("F:\\IODemo\\outtimeok.txt",true);
	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	
	
for(int i=0;i<string1.length;i++) {
	bufferedWriter.write("Student : "+string1[i]);
	bufferedWriter.newLine();
}
bufferedWriter.flush();
fileWriter.close();
bufferedWriter.close();
	System.out.println("Done");
	}
	catch(IOException ie) {
		System.out.println(ie);
		}
	}

}

