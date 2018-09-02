package com.sreenu.ifmarksdb;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SaveDataByMarks {

	public static void main(String[] args)throws Exception {
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sreenu123", "root", "root");
		
		PreparedStatement preparedStatement = connection.prepareStatement("select * from studentmarks");
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			
			resultSet.getInt("idstudentmarks");
			resultSet.getString("studentmarksname");
			resultSet.getInt("studentmarksmarks");
			resultSet.getInt("studentmarksage");
			resultSet.getString("studentmarkscity");
			
			if(resultSet.getInt("studentmarksmarks")<35) {
			
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:\\IODemo\\marks35.txt", true));
		bufferedWriter.write(resultSet.getInt("idstudentmarks")+","+
			resultSet.getString("studentmarksname")+","+
			resultSet.getInt("studentmarksmarks")+","+
			resultSet.getInt("studentmarksage")+","+
			resultSet.getString("studentmarkscity"));
		
		bufferedWriter.flush();
		bufferedWriter.newLine();
		bufferedWriter.close();
		
		
		}
			else if(resultSet.getInt("studentmarksmarks")>=35 & resultSet.getInt("studentmarksmarks")<50) {
				
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:\\IODemo\\marks50.txt", true));
				bufferedWriter.write(resultSet.getInt("idstudentmarks")+","+
					resultSet.getString("studentmarksname")+","+
					resultSet.getInt("studentmarksmarks")+","+
					resultSet.getInt("studentmarksage")+","+
					resultSet.getString("studentmarkscity"));
				
				bufferedWriter.flush();
				bufferedWriter.newLine();
				bufferedWriter.close();
				
				
				}
else if(resultSet.getInt("studentmarksmarks")>=50 & resultSet.getInt("studentmarksmarks")<60) {
				
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:\\IODemo\\marks60.txt", true));
				bufferedWriter.write(resultSet.getInt("idstudentmarks")+","+
					resultSet.getString("studentmarksname")+","+
					resultSet.getInt("studentmarksmarks")+","+
					resultSet.getInt("studentmarksage")+","+
					resultSet.getString("studentmarkscity"));
				
				bufferedWriter.flush();
				bufferedWriter.newLine();
				bufferedWriter.close();
				
				}
else if(resultSet.getInt("studentmarksmarks")>=60 & resultSet.getInt("studentmarksmarks")<70) {
	
	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:\\IODemo\\marks70.txt", true));
	bufferedWriter.write(resultSet.getInt("idstudentmarks")+","+
		resultSet.getString("studentmarksname")+","+
		resultSet.getInt("studentmarksmarks")+","+
		resultSet.getInt("studentmarksage")+","+
		resultSet.getString("studentmarkscity"));
	
	bufferedWriter.flush();
	bufferedWriter.newLine();
	bufferedWriter.close();
	
	}
		}
		
	}

}
