package com.sreenu.joinsMain;

import java.util.Scanner;

import com.sreenu.joins.PersonPojo;
import com.sreenu.joinsDao.JoinsDao;

public class GetPersonDetailsandPassPortDetailsusingPassPortnumberMainClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Passport Number : ");
		String passportnumber = scanner.next();

		JoinsDao joinsDao = new JoinsDao();
		PersonPojo pojo = joinsDao.get_Person_Passport_By_PPTNumber_ONE_To_ONE(passportnumber);

		System.out.println(pojo.getPname() + ":" + pojo.getQualification());
		scanner.close();

		
	}

}
