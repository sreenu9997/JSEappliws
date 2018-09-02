package com.sreenu.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnectionRetrieveAllRecords {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sreenu123", "root",
					"root");
			PreparedStatement preparedStatement = connection.prepareStatement("select * from student");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt("studentid");
				String studentname = resultSet.getString("studentname");
				String studentage = resultSet.getString("studentage");
				String studentcity = resultSet.getString("studentcity");
				System.out.println("Student ID : " + id + "  :: StudentName : " + studentname + " :: Student Age : "
						+ studentage + " :: Student City : " + studentcity);
				System.out.println("=========================");
			}
		} catch (SQLException | ClassNotFoundException s) {
			s.printStackTrace();
		}	} }
