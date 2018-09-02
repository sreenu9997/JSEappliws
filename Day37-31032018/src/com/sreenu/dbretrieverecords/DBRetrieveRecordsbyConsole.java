package com.sreenu.dbretrieverecords;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBRetrieveRecordsbyConsole {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number to retrieve record :: ");
		int id = scanner.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sreenu123", "root",
					"root");
			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from student where studentid=?");
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				int studentid = resultSet.getInt("studentid");
				String studentname = resultSet.getString("studentname");
				int studentage = resultSet.getInt("studentage");
				String studentcity = resultSet.getString("studentcity");

				System.out.println("SID :: " + studentid + " SName :: " + studentname + " SAGE :: " + studentage
						+ " SCITY :: " + studentcity);
			}
			resultSet.close();
			preparedStatement.close();
			connection.close();
			scanner.close();
		} catch (SQLException s) {
			s.printStackTrace();
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		}	}  }
