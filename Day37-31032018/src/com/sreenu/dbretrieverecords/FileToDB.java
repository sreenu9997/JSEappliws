package com.sreenu.dbretrieverecords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FileToDB {

	public static void main(String[] args) {

		try {  
			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sreenu123", "root",
					"root");
			PreparedStatement preparedStatement = null;

			BufferedReader bufferedReader = new BufferedReader(new FileReader("F:\\IODemo\\studentdata.txt"));
			String str = bufferedReader.readLine();
			int count = 1;
			while (str != null) {
				String[] array = str.split(",");

				preparedStatement = connection.prepareStatement("insert into datafromfiletodb values(?,?,?)");

				preparedStatement.setInt(1, Integer.parseInt(array[0]));
				preparedStatement.setString(2, array[1]);
				preparedStatement.setString(3, array[2]);
				preparedStatement.executeUpdate();
				System.out.println(count + " Inserted Successfully");

				count++;
				str = bufferedReader.readLine();
			}
			bufferedReader.close();

			preparedStatement.close();
			connection.close();

		} catch (SQLException s) {
			s.printStackTrace();
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		} catch (IOException o) {
			o.printStackTrace();
		}
	}

}
