package com.sreenu.dbretrieverecords;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class OperationsByConsole {

	
	public static void main(String[] args){
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sreenu123", "root", "root");
		PreparedStatement preparedStatement= null;
		ResultSet resultSet= null;
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			
		
		System.out.println("Select Your Operation :: ");
		System.out.println("1 . Insert Data ");
		System.out.println("2 . Update Data ");
		System.out.println("3 . Delete Data ");
		System.out.println("4 . Get Data By ID ");
		System.out.println("5 . Get All Data ");
		System.out.println("6 . Exit ");
		
		int options = scanner.nextInt();
		
		switch(options) {
		
		case 1 : 
			System.out.print("Enter StudentID : ");
			int id = scanner.nextInt();			
			System.out.print("Enter StudentName : ");
			String name = scanner.next();
			System.out.print("Enter StudentAge : ");
			int age = scanner.nextInt();
			System.out.print("Enter StudentCity : ");
			String city = scanner.next();
			
			
			preparedStatement = connection.prepareStatement("insert into student values(?,?,?,?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setInt(3, age);
			preparedStatement.setString(4, city);
			preparedStatement.executeUpdate();				
			System.out.println( " Inserted Data");
			break;
			
		case 2 : 
			System.out.print("Enter Student Name : ");
			String uname = scanner.next();
			System.out.print("Enter Student ID : ");
			int uid = scanner.nextInt();
			preparedStatement = connection.prepareStatement("update student set studentname = ? where studentid =?");
			preparedStatement.setString(1, uname);
			preparedStatement.setInt(2, uid);
			preparedStatement.executeUpdate();
				
			System.out.println( " Updated Data");
			break;
						
		case 3 : 
			System.out.print("Enter Student id : ");
			int did = scanner.nextInt();
			preparedStatement = connection.prepareStatement("delete from student where studentid =?");
		preparedStatement.setInt(1, did);
		preparedStatement.executeUpdate();
					
			System.out.println( " Deleed Data");
			break;
			
			
		case 4 : 
			
			System.out.print("Enter  StudentID : ");
			int gid = scanner.nextInt();
			preparedStatement = connection.prepareStatement("select * from student where studentid=?");
			preparedStatement.setInt(1, gid);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()){
			int rid = resultSet.getInt("studentid");
			String rname = resultSet.getString("studentname");
			int rage = resultSet.getInt("studentage");
			String rcity = resultSet.getString("studentcity");
			
			System.out.println("Student ID : "+rid+" StudentName : "+rname+" Student age : "+rage+" Student city : "+rcity);
				
			resultSet.close();
			}
			
			
			System.out.println( " Get By Id Retrieved Data");
		break;
		case 5 : 
			preparedStatement = connection.prepareStatement("select * from student");
			resultSet = preparedStatement.executeQuery();
			int count = 1;
			while(resultSet.next()){
			int rid = resultSet.getInt("studentid");
			String rname = resultSet.getString("studentname");
			int rage = resultSet.getInt("studentage");
			String rcity = resultSet.getString("studentcity");
			
			System.out.println("Student ID : "+rid+" StudentName : "+rname+" Student age : "+rage+" Student city : "+rcity);
				
			
			System.out.println(count+" Record completed");
			count++;
			}		
			resultSet.close();
			
			System.out.println( " Get All Data");
			break;
			
		case 6 : flag= false;
		System.out.println("Exit");break;
		}
		}
		
		preparedStatement.close();
		connection.close();
		scanner.close();
		}catch(SQLException s) {
			s.printStackTrace();
		}catch(ClassNotFoundException c) {
			c.printStackTrace();
		}
		
	}
}
