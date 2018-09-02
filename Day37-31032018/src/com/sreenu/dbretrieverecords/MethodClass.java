package com.sreenu.dbretrieverecords;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MethodClass {
	public static Connection connection;
	public static PreparedStatement preparedStatement;
	public static DriverManager driverManager;
	public static void getMysqlDriverConnection() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sreenu123", "root", "root");	
	}
	public static void insert(int id, String name, String city) throws Exception{
		getMysqlDriverConnection();
		preparedStatement = connection.prepareStatement("insert into filetodb values(?,?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, city);
		
		preparedStatement.executeUpdate();
		preparedStatement.close();
		connection.close();
		System.out.println("Inserted");
		}
	public static void delete(String name)throws Exception{
		
		getMysqlDriverConnection();
		preparedStatement = connection.prepareStatement("delete from filetodb where name =?");
		preparedStatement.setString(1, name);
		int data = preparedStatement.executeUpdate();
		System.out.println(data);
		preparedStatement.close();
		connection.close();
		System.out.println("Deleted");
		
	}
	public static void retrieve() throws Exception{
		
	
	getMysqlDriverConnection();
	preparedStatement = connection.prepareStatement("select * from filetodb");
	ResultSet rs = preparedStatement.executeQuery();

	while(rs.next()){

		System.out.println(rs.getInt("idfiletodb")+","+rs.getString("filetodbname")+","+rs.getString("filetodbcourse"));
		
		
	}
	
	
}
}