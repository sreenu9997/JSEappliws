package com.sreenu.iopackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StudentDataIo {

	
	
	public void saveStudentdata(String name, int age, String qualification) {
		
		try {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:\\IODemo\\studentdata.txt", true));
		bufferedWriter.newLine();
		bufferedWriter.write(name+" , "+age+" , "+qualification);
		
		bufferedWriter.flush();
		bufferedWriter.close();
		
	}
	catch(IOException ie) {
		System.out.println(ie);
	}
	}
}
