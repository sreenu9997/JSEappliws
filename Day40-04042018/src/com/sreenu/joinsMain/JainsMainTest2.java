package com.sreenu.joinsMain;

import java.util.ArrayList;
import java.util.Scanner;

import com.sreenu.Daos.PersonDao;
import com.sreenu.pojos.PersonPojoCP;

public class JainsMainTest2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter course name : ");
		String name = scanner.nextLine();
		
		PersonDao personDao = new PersonDao();
		ArrayList<PersonPojoCP> list = personDao.getPersonDetailsByCourseName(name);
	for(int i=0; i<list.size(); i++) {
	System.out.println(list.get(i).getId()+" :: "+list.get(i).getName()+" :: "+list.get(i).getAge()+" :: "+list.get(i).getQuaqualification());
		System.out.println("===========");
	}
scanner.close();	
	}

}
