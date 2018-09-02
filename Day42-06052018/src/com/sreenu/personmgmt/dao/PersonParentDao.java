package com.sreenu.personmgmt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sreenu.personmgmt.pojo.PersonPojo;

public class PersonParentDao {

	
	
	public ArrayList<PersonPojo> getPersonPojos(){
		
		
		ArrayList<PersonPojo> personList = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3366/onemany", "root", "root");
			PreparedStatement preparedStatement = connection.prepareStatement("select * from person");
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
			
				PersonPojo personPojo = new PersonPojo();
				personPojo.setIdperson(resultSet.getInt("idperson"));
				personPojo.setPname(resultSet.getString("pname"));
				personPojo.setQualification(resultSet.getString("qualification"));
				personPojo.setParentid(resultSet.getInt("parentid"));
				
				personList.add(personPojo);
			}
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return personList;
	}
}
