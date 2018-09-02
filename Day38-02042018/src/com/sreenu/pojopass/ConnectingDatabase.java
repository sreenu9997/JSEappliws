package com.sreenu.pojopass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectingDatabase {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sreenu123", "root",
					"root");
			System.out.println("Database Connection Success " + connection);
			connection.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
