package com.sreenu.ifmarksdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class QueriesfromConsole {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String : ");
		String query = scanner.next();
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sreenu123", "root", "root");
		PreparedStatement preparedStatement = connection
				.prepareStatement("select * from studentmarks where studentmarksname like ? ");

		preparedStatement.setString(1, query + "%");

		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {

			System.out.println(resultSet.getInt("idstudentmarks") + ":" + resultSet.getString("studentmarksname") + ":"
					+ resultSet.getInt("studentmarksmarks") + ":" + resultSet.getInt("studentmarksage") + ":"
					+ resultSet.getString("studentmarkscity"));
		}
		connection.close();
		scanner.close();
	}
}
