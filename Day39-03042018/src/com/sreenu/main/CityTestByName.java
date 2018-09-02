package com.sreenu.main;

import java.util.Scanner;

import com.sreenu.Pojo.CityPojo;
import com.sreenu.dao.CityDAO;

public class CityTestByName {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the name;::");
		String name = scanner.next();
		CityDAO cityDAO = new CityDAO();

		CityPojo city = cityDAO.getRecordsByName(name);

		System.out.println(city.getCitypincode() + ":" + city.getStreetname() + ":" + city.getAreaname());
		System.out.println("======================================");
		scanner.close();
	}

}
