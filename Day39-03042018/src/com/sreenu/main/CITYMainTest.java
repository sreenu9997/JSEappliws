package com.sreenu.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.sreenu.Pojo.CityPojo;
import com.sreenu.dao.CityDAO;

public class CITYMainTest {

	
	
	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the name;::");
		String name = scanner.next();
		CityDAO cityDAO = new CityDAO();

		CityPojo city = cityDAO.getRecordsByName(name);

		System.out.println(city.getCitypincode() + ":" + city.getStreetname() + ":" + city.getAreaname());
		System.out.println("======================================");
		CityDAO cityDAO1 = new CityDAO();

		ArrayList<CityPojo> list = cityDAO1.getRecordsByNames(name);
		for (int i = 0; i < list.size(); i++) {
			
		/*	CityPojo ciPojo = list.get(i);
System.out.println(ciPojo.getCitypincode()+ ":" + ciPojo.getStreetname()+ ":" + ciPojo.getAreaname());*/
		
			System.out.println(list.get(i).getCitypincode() + ":" + list.get(i).getStreetname() + ":" + list.get(i).getAreaname());

		}
scanner.close();
	}

}
