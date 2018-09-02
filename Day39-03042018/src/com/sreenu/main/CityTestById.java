package com.sreenu.main;

import java.util.Scanner;

import com.sreenu.Pojo.CityPojo;
import com.sreenu.dao.CityDAO;

public class CityTestById {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the ID:: ");
		int id = scanner.nextInt();
		CityDAO cityDAO = new CityDAO();

		CityPojo city = cityDAO.getRecordsByID(id);

		System.out.println(city.getCitypincode() + ":" + city.getStreetname() + ":" + city.getAreaname());

	System.out.println("======================================");
	scanner.close();
	}

}
