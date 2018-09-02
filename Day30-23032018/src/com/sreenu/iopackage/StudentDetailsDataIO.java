package com.sreenu.iopackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.sreenu.thirdclass.StudentDetails;

public class StudentDetailsDataIO {

	
	public void saveStudentDetails(StudentDetails studentDetails) throws IOException{
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:\\IODemo\\StudentDetailsIO.txt",true));
		bufferedWriter.newLine();
		bufferedWriter.write(studentDetails.name+", "+studentDetails.age+" , "+studentDetails.qualification+" , "+studentDetails.phoneNumber+" , "+studentDetails.address);
		bufferedWriter.flush();
		bufferedWriter.close();
		
		
	
	
}}
