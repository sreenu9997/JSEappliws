package com.sreenu.switchLogic;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.sreenu.switchtestPojo.StudentData;

public class StudentDS {

	public void saveData(StudentData studentData) throws IOException{
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:\\IODemo\\switchdata.txt", true));
		bufferedWriter.newLine();
		bufferedWriter.write(studentData.getName()+" , " +studentData.getAge()+" , "+ studentData.getQualification()+" , "+studentData.getPhoneNumber());
		bufferedWriter.flush();
		bufferedWriter.close();																																																															
	}
	
	public void readData() throws IOException{
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("F:\\\\IODemo\\\\switchdata.txt"));
		String data = bufferedReader.readLine();
		while( data != null) {
		System.out.println();
			System.out.println(data);
		
			data = bufferedReader.readLine();
		}
		bufferedReader.close();
		
	}
	
	
}
