package com.sreenu.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.sreenu.Pojo.CityPojo;
public class RetrieveDatafromDBUsingAND {

	public static void main(String[] args) throws Exception {

		CityPojo cityPojo = new CityPojo();
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sreenu123", "root", "root");
		PreparedStatement preparedStatement = connection
				.prepareStatement("SELECT * FROM city WHERE idcity = 3 AND cityname = 'blr'");
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			cityPojo.setCitypincode(resultSet.getInt(1));
			cityPojo.setStreetname(resultSet.getString(2));
			cityPojo.setAreaname(resultSet.getString(3));
		}
		System.out.println(
				cityPojo.getCitypincode() + " :: " + cityPojo.getAreaname() + " :: " + cityPojo.getStreetname());
		connection.close();
	}

}
