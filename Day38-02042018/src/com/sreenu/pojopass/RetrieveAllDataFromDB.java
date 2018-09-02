package com.sreenu.pojopass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class RetrieveAllDataFromDB {
	public static void main(String[] args) throws Exception {
		System.out.println("=========== All records retrieving =============");
		// retrieving all records
		ArrayList<ProductPojo> array = RetrieveAllDataFromDB.getALLProducts();
		int count = 1;
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i).getId() + " :: " + array.get(i).getName() + " :: " + array.get(i).getCity());
			System.out.println(count + " Record ");
			count++;
		}	}
	public static ArrayList<ProductPojo> getALLProducts() throws Exception {
		ArrayList<ProductPojo> arrayList = new ArrayList<>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sreenu123", "root", "root");
		PreparedStatement preparedStatement = connection.prepareStatement("select * from product");
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			ProductPojo productPojo = new ProductPojo();
			productPojo.setId(resultSet.getInt("idproduct"));
			productPojo.setName(resultSet.getString("productname"));
			productPojo.setCity(resultSet.getString("productcity"));
			arrayList.add(productPojo);
		}
		return arrayList;
	} }