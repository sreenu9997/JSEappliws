package com.sreenu.iopackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.sreenu.thirdclass.StudentDetailsgetset;

public class StudentDetailsIOsetget {

	public void savestudentdetails(StudentDetailsgetset studentDetailsgetset) {
		
		
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:\\IODemo\\studentgetset.txt",true));
			bufferedWriter.newLine();
			bufferedWriter.write(studentDetailsgetset.getName()+","+studentDetailsgetset.getAge()+","+studentDetailsgetset.getQualification()+","+studentDetailsgetset.getPhoneNumber()+","+studentDetailsgetset.getAddress());
			bufferedWriter.flush();
			bufferedWriter.close();
		
		
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
