package com.sreenu.dbconnectiontest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConeectionTest {
	public static void main(String[] args) {

		try {

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sreenu123", "root",
					"root");
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into student values(4,'sreenu',25,'mca')");
			preparedStatement.executeUpdate();
			preparedStatement.close();
			connection.close();
			System.out.println("Successfully Updated");

		} catch (SQLException sql) {
			sql.printStackTrace();

		}
	}
}