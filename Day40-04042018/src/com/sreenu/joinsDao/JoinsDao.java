package com.sreenu.joinsDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sreenu.joins.PersonPojo;

public class JoinsDao {

	public PersonPojo getDetailsByName(String name) {
		PersonPojo personPojo = new PersonPojo();
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3366/onemany", "root", "root");
			PreparedStatement preparedStatement = connection.prepareStatement(
					"select p.pname, p.qualification from passport pt, person p where pt.pid = p.idperson and pt.passportnumber= ? ");
			preparedStatement.setString(1, name);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {

				personPojo.setPname(resultSet.getString("pname"));
				personPojo.setQualification(resultSet.getString("qualification"));

			}
			resultSet.close();
			preparedStatement.close();
			connection.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
		return personPojo;
	}

	public PersonPojo get_Person_Passport_By_PPTNumber_ONE_To_ONE(String passportnumber) {
		
		PersonPojo personPojo = new PersonPojo();
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3366/onemany", "root", "root");
			PreparedStatement preparedStatement = connection.prepareStatement(
					"select * from passport pt, person p where pt.pid = p.idperson and pt.passportnumber= ? ");
			preparedStatement.setString(1, passportnumber);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				personPojo.setIdperson(resultSet.getByte("idperson"));

				personPojo.setPname(resultSet.getString("pname"));
				personPojo.setQualification(resultSet.getString("qualification"));

			}
			resultSet.close();
			preparedStatement.close();
			connection.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
		return personPojo;
	}

}
