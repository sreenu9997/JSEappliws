package com.sreenu.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.sreenu.Pojo.CityPojo;
import com.sreenu.dao.CityDAO;

public class CityMainTeststartend {

	

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the StartID ::");
	int sid = scanner.nextInt();
	System.out.print("enter the EndID ::");
	int eid = scanner.nextInt();
		CityDAO cityDAO = new CityDAO(); 

		
		ArrayList<CityPojo> list =  cityDAO.getAllDataByIDs(sid, eid);
		for (int i = 0; i < list.size(); i++) {
			
		/*	CityPojo ciPojo = list.get(i);
System.out.println(ciPojo.getCitypincode()+ ":" + ciPojo.getStreetname()+ ":" + ciPojo.getAreaname());*/
		
			System.out.println(list.get(i).getCitypincode() + ":" + list.get(i).getStreetname() + ":" + list.get(i).getAreaname());

		}
scanner.close();
	}

	
}
