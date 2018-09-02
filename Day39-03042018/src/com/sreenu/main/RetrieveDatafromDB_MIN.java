package com.sreenu.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetrieveDatafromDB_MIN {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sreenu123", "root", "root");
		PreparedStatement preparedStatement = connection
				.prepareStatement("SELECT MIN(studentmarksmarks) AS lowestMarks FROM studentmarks");
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			int id = resultSet.getInt(1);
			System.out.println("lowestMarks In the  studentmarks Table :: "+id);			
		}
		connection.close();
	}
}
