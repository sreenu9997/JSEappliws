package com.sreenu.dbretrieverecords;

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
		BufferedReader bufferedReader = new BufferedReader(new FileReader("F:\\IODemo\\studentdata.txt"));
		String str = bufferedReader.readLine();
		int count = 1;
		while (str != null) {
			String[] array = str.split(",");
			String id = array[1];
			String name = array[0];
			String course = array[2];
			System.out.println(id + "::" + name + ":" + course);
			preparedStatement = connection.prepareStatement("insert into datafromfiletodb values(?,?,?)");
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, course);
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