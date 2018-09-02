package com.sreenu.dbretrieverecords;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetDatafromDBandSaveInFile {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sreenu123", "root", "root");
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:\\IODemo\\StudentdatafromDB1.txt", true));

		preparedStatement = connection.prepareStatement("select * from student");
		resultSet = preparedStatement.executeQuery();
		int count = 1;
		while (resultSet.next()) {

			bufferedWriter.write(resultSet.getInt("studentid") + "," + resultSet.getString("studentname") + ","
					+ resultSet.getInt("studentage") + "," + resultSet.getString("studentcity"));

			bufferedWriter.flush();
			bufferedWriter.newLine();
			System.out.println(count + " Record inserted");
			count++;
		}
		bufferedWriter.close();
		resultSet.close();
		preparedStatement.close();
		connection.close();
	}
}
