package com.sreenu.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sreenu.Pojo.CityPojo;

public class RetrieveDatafromDBUsingIN {

	public static void main(String[] args) throws Exception {
		List<CityPojo> lists = new ArrayList<>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sreenu123", "root", "root");
		PreparedStatement preparedStatement = connection
				.prepareStatement("SELECT * FROM city WHERE idcity IN (2,3,4)");
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			CityPojo cityPojos = new CityPojo();
			cityPojos.setCitypincode(resultSet.getInt(1));
			cityPojos.setStreetname(resultSet.getString(2));
			cityPojos.setAreaname(resultSet.getString(3));
			lists.add(cityPojos);
		}

		for(int i=0; i<lists.size();i++) {
			
			CityPojo cityPojo = lists.get(i);
		System.out.println(
				cityPojo.getCitypincode() + " :: " + cityPojo.getAreaname() + " :: " + cityPojo.getStreetname());
			}
		connection.close();
	}
}
