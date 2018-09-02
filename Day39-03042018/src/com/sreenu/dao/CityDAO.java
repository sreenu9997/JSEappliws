package com.sreenu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.sreenu.Pojo.CityPojo;

public class CityDAO {
	public CityPojo getRecordsByID(int id) throws Exception{
		
		CityPojo cityPojo = new CityPojo();
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sreenu123", "root", "root");
		PreparedStatement preparedStatement = connection.prepareStatement("select * from city where idcity=?");
		preparedStatement.setInt(1,id);
		ResultSet resultSet = preparedStatement.executeQuery();
	while(resultSet.next()){
	cityPojo.setCitypincode(resultSet.getInt(1));
	cityPojo.setStreetname(resultSet.getString(2));
	cityPojo.setAreaname(resultSet.getString(3));
	
	}
	return cityPojo;
}
	
	public CityPojo getRecordsByName(String name) throws Exception{
		
		
		CityPojo cityPojo = new CityPojo();
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sreenu123", "root", "root");
		PreparedStatement preparedStatement = connection.prepareStatement("select * from city where cityname=?");
		preparedStatement.setString(1,name);
		ResultSet resultSet = preparedStatement.executeQuery();
	while(resultSet.next()){
	cityPojo.setCitypincode(resultSet.getInt(1));
	cityPojo.setStreetname(resultSet.getString(2));
	cityPojo.setAreaname(resultSet.getString(3));
	
	
	}
	return cityPojo;
}
	public ArrayList<CityPojo> getRecordsByNames(String name) throws Exception{
		
		ArrayList<CityPojo> arrayList = new ArrayList<CityPojo>();
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sreenu123", "root", "root");
		PreparedStatement preparedStatement = connection.prepareStatement("select * from city where cityname=?");
		preparedStatement.setString(1,name);
		ResultSet resultSet = preparedStatement.executeQuery();
	while(resultSet.next()){
		CityPojo cityPojo = new CityPojo();
	cityPojo.setCitypincode(resultSet.getInt(1));
	cityPojo.setStreetname(resultSet.getString(2));
	cityPojo.setAreaname(resultSet.getString(3));
	arrayList.add(cityPojo);
	
	}
	return arrayList;
}
		
	public ArrayList<CityPojo> getAllDataByIDs(int startid, int endId) throws Exception{
		
ArrayList<CityPojo> arrayList11 = new ArrayList<CityPojo>();
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sreenu123", "root", "root");
		PreparedStatement preparedStatement = connection.prepareStatement("select * from city where idcity > ? and idcity < ? ");
		preparedStatement.setInt(1, startid);
		preparedStatement.setInt(2, endId);
		ResultSet resultSet = preparedStatement.executeQuery();
	while(resultSet.next()){
		CityPojo cityPojo = new CityPojo();
	cityPojo.setCitypincode(resultSet.getInt(1));
	cityPojo.setStreetname(resultSet.getString(2));
	cityPojo.setAreaname(resultSet.getString(3));
	arrayList11.add(cityPojo);
	
	}
	return arrayList11;
	}

	
	public CityPojo getRecordsByNameLike(String name) throws Exception {

		CityPojo cityPojo = new CityPojo();
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sreenu123", "root", "root");
		PreparedStatement preparedStatement = connection.prepareStatement("select * from city where cityname like ?");
		preparedStatement.setString(1,name+"%");
		ResultSet resultSet = preparedStatement.executeQuery();
	while(resultSet.next()){
	cityPojo.setCitypincode(resultSet.getInt(1));
	cityPojo.setStreetname(resultSet.getString(2));
	cityPojo.setAreaname(resultSet.getString(3));
			}
	return cityPojo;
		}
	}
