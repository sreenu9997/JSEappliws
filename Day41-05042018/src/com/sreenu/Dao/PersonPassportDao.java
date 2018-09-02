package com.sreenu.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sreenu.Pojo.PassportPojo;
import com.sreenu.Pojo.PersonPojo;

public class PersonPassportDao {

	public ArrayList<PersonPojo> getPersonPassportDetailsByCourseName(String name){
		
		ArrayList<PersonPojo> arrayList = new ArrayList<PersonPojo>();
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3366/onemany", "root", "root");
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM person p join person_course pc on p.idperson = pc.pid join course c on pc.cid = c.idcourse join passport pt on pt.pid = p.idperson where c.cname = ? ");
			preparedStatement.setString(1, name);
			ResultSet resultSet =  preparedStatement.executeQuery();
			while(resultSet.next()){
				
				PersonPojo personPojo = new PersonPojo();
				personPojo.setIdperson(resultSet.getInt("idperson"));
				personPojo.setPname(resultSet.getString("pname"));
				personPojo.setAge(resultSet.getInt("age"));
				personPojo.setQualification(resultSet.getString("qualification"));
				
				PassportPojo passportPojo = new PassportPojo();
				passportPojo.setIdpassport(resultSet.getInt("idpassport"));
				passportPojo.setIssuedate(resultSet.getString("issuedate"));
				passportPojo.setExpdate(resultSet.getString("expdate"));
				passportPojo.setPassportnumber(resultSet.getString("passportnumber"));
				passportPojo.setPid(resultSet.getInt("pid"));
				
				personPojo.setPassportPojo(passportPojo);
				arrayList.add(personPojo);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		return arrayList;
	
	}
	
}
