package com.sreenu.dbretrieverecords;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDataByConsole {

	
	public static void main(String[] args)throws Exception {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Id : ");
		int id = scanner.nextInt();
		System.out.print("Enter Name : ");
		String name = scanner.next();
		System.out.print("Enter age : ");
		int age = scanner.nextInt();
		System.out.print("Enter City : ");
		String city = scanner.next();
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sreenu123", "root", "root");
			PreparedStatement preparedStatement = connection.prepareStatement("insert into student values(?,?,?,?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setInt(3, age);
			preparedStatement.setString(4, city);
			preparedStatement.executeUpdate();
			preparedStatement.close();
			connection.close();
			scanner.close();
			System.out.println("Inserted Successfully");
			
		
		
}

}
