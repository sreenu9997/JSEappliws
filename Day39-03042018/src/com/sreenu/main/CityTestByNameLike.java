package com.sreenu.main;

import java.util.Scanner;

import com.sreenu.Pojo.CityPojo;
import com.sreenu.dao.CityDAO;

public class CityTestByNameLike {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the name :: ");
		String name = scanner.next();
		CityDAO cityDAO = new CityDAO();

		CityPojo city = cityDAO.getRecordsByNameLike(name);

		System.out.println(city.getCitypincode() + ":" + city.getStreetname() + ":" + city.getAreaname());
		System.out.println("======================================");
		scanner.close();
	}

}
