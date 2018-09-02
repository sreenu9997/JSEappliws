package com.sreenu.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sreenu.pojorec.StudentPojo;

public class RetrieveDatafromDB_BETWEEN {

	public static void main(String[] args) throws Exception {
		List<StudentPojo> lists = new ArrayList<>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sreenu123", "root", "root");
		PreparedStatement preparedStatement = connection
				.prepareStatement("SELECT * FROM studentmarks WHERE studentmarksmarks BETWEEN 70 AND 80");
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			StudentPojo studentPojo = new StudentPojo();
			studentPojo.setIdstudentmarks(resultSet.getInt(1));
			studentPojo.setStudentmarksname(resultSet.getString(2));
			studentPojo.setStudentmarksmarks(resultSet.getInt(3));
			studentPojo.setStudentmarksage(resultSet.getInt(1));
			studentPojo.setStudentmarkscity(resultSet.getString(5));
			lists.add(studentPojo);
		}

		for(int i=0; i<lists.size();i++) {
			
			StudentPojo studentPojo  = lists.get(i);
		System.out.println(studentPojo.getIdstudentmarks() + " :: "+ studentPojo.getStudentmarksname() 
				+ " :: " + studentPojo.getStudentmarksmarks()+ " :: "+ studentPojo.getStudentmarksage()+ " :: " 
				+ studentPojo.getStudentmarkscity());
			}
		connection.close();
	}
}
