package com.sreenu.ifmarksdb;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ReadDataFromFileAndStoreInDB {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sreenu123", "root", "root");
		PreparedStatement preparedStatement = null;
		BufferedReader bufferedReader = new BufferedReader(new FileReader("F:\\IODemo\\stumarks.txt"));
		String str = bufferedReader.readLine();
		int count = 1;
		while (str != null) {
			String[] array = str.split(",");
			preparedStatement = connection.prepareStatement("insert into studentmarks values(?,?,?,?,?)");
			preparedStatement.setInt(1, Integer.parseInt(array[0]));
			preparedStatement.setString(2, array[1]);
			preparedStatement.setInt(3, Integer.parseInt(array[2]));
			preparedStatement.setInt(4, Integer.parseInt(array[3]));
			preparedStatement.setString(5, array[4]);
			preparedStatement.executeUpdate();
			System.out.println(count + " Inserted Successfully");
			count++;
			str = bufferedReader.readLine();
		}
		bufferedReader.close();
		 preparedStatement.close();
		connection.close();
	}

}