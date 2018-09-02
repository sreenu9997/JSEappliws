package com.sreenu.Daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sreenu.pojos.PersonPojoCP;

public class PersonDao {

	
	public ArrayList<PersonPojoCP> getPersonDetailsByCourseName(String name){
		
		ArrayList<PersonPojoCP> arrayList = new ArrayList<>();
	 try {
		Class.forName("com.mysql.jdbc.Driver");
	
	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3366/onemany", "root", "root");
	 PreparedStatement preparedStatement = connection.prepareStatement("select p.idperson, p.pname, p.qualification, p.age from person p , person_course pc, course c where p.idperson = pc.pid and pc.cid = c.idcourse and cname = ? ");
	 preparedStatement.setString(1, name);	
	 ResultSet resultSet = preparedStatement.executeQuery();
	 while(resultSet.next()) {
		 PersonPojoCP personPojoCP = new PersonPojoCP();
		 personPojoCP.setId(resultSet.getInt("idperson"));
		 personPojoCP.setName(resultSet.getString("pname"));
		 personPojoCP.setAge(resultSet.getInt("age"));
		 personPojoCP.setQuaqualification(resultSet.getString("qualification"));
		 arrayList.add(personPojoCP);
	 }
	 
	 } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return arrayList;
	}
	
	
}
