package com.sreenu.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DBRetrieveRecordOneColumnData {

	
	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sreenu123","root","root");
		PreparedStatement preparedStatement = connection.prepareStatement("select * from student");
		ResultSet resultSet = preparedStatement.executeQuery();
		resultSet.next();
		int id = resultSet.getInt(1);
		String name = resultSet.getString(2);
		int age = resultSet.getInt(3);
		String city = resultSet.getString(4);
		System.out.println("StudentID  :: "+id+" StudentName  :: "+name+" StudentAGE  :: "+age+" StudentCity :: "+city);
		
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException c) {
			c.printStackTrace();
		}
	}
}
