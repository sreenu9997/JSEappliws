package com.sreenu.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.sreenu.Pojo.PassportPojo;
import com.sreenu.Pojo.PersonPojo;
import com.sreenu.Pojo.PhonePojo;

public class PersonPhoneDetailsBypassportNumberDao {
	
	public PersonPojo getPersonPhoneDetailsBypassportNumber(String passportnumber) {
		PersonPojo personPojo = new PersonPojo();
		ArrayList<PhonePojo> list = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3366/onemany", "root", "root");
			PreparedStatement preparedStatement = connection.prepareStatement("select * from person p join phone ph "+
			" on p.idperson=ph.idphone join passport pt on pt.pid=p.idperson where pt.passportnumber = ?");
			preparedStatement.setString(1, passportnumber);
			ResultSet resultSet =  preparedStatement.executeQuery();
			
			while(resultSet.next()){
				
				personPojo.setPname(resultSet.getString("pname"));
				personPojo.setQualification(resultSet.getString("qualification"));
				personPojo.setAge(resultSet.getInt("age"));
				PassportPojo passport = new PassportPojo();
				
				passport.setPassportnumber(resultSet.getString("passportnumber"));
				passport.setExpdate(resultSet.getString("expdate"));
				passport.setIssuedate(resultSet.getString("issuedate"));
				personPojo.setPassportPojo(passport);
				
				PhonePojo phonePojo = new PhonePojo();
				phonePojo.setPhonenumber(resultSet.getInt("phonenumber"));
				phonePojo.setNetwork(resultSet.getString("network"));
				list.add(phonePojo);
				
				}
			
			personPojo.setArrayphones(list);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return personPojo;
		
	}

}
