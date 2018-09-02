package com.sreenu.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DBConnectionclass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter ID to delete record :: ");
		int id = scanner.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String str = "delete from student where studentid = ";
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sreenu123", "root", "root");
			PreparedStatement preparedStatement = connection.prepareStatement(str+""+id);
			//PreparedStatement preparedStatement = connection.prepareStatement("delete from student where studentid=1");		
			preparedStatement.executeUpdate();
			preparedStatement.close();
			connection.close();
			scanner.close();
			System.out.println("Successfully Deleted");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}	} }
