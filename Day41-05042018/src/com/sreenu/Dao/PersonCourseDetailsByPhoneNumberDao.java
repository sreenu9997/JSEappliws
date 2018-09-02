package com.sreenu.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sreenu.Pojo.CoursePojo;
import com.sreenu.Pojo.PersonPojo;

public class PersonCourseDetailsByPhoneNumberDao {

	public PersonPojo getPersonCourseDetailsByphoneNumber(int phonenumber) {

		PersonPojo personPojo = new PersonPojo();

		ArrayList<CoursePojo> courselist = new ArrayList<>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3366/onemany", "root", "root");
			PreparedStatement preparedStatement = connection.prepareStatement(
					"select * from person p join person_course pc " + " on pc.pid = p.idperson join course c "
							+ " on c.idcourse = pc.cid join phone ph on ph.pid = p.idperson where ph.phonenumber = ? ");
			preparedStatement.setInt(1, phonenumber);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				personPojo.setPname(resultSet.getString("pname"));
				personPojo.setQualification(resultSet.getString("qualification"));

				CoursePojo coursePojo = new CoursePojo();
				coursePojo.setCname(resultSet.getString("cname"));
				coursePojo.setDuration(resultSet.getString("duration"));

				courselist.add(coursePojo);

			}
			personPojo.setArrayCourses(courselist);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return personPojo;

	}

}
