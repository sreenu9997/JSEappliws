package com.sreenu.UI;

import java.util.ArrayList;
import java.util.Scanner;

import com.sreenu.Dao.PersonPassportDao;
import com.sreenu.Pojo.PersonPojo;

public class PersonMainTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Eneter course name : ");
		String cname = scanner.nextLine();
		
		PersonPassportDao personPassportDao = new PersonPassportDao();
		ArrayList< PersonPojo> list = personPassportDao.getPersonPassportDetailsByCourseName(cname);
		for(int i = 0; i<list.size(); i++) {
			
		
			System.out.println(list.get(i).getPname()+" :: "+list.get(i).getQualification()+" :: "+list.get(i).getPassportPojo().getExpdate()+" :: "+list.get(i).getPassportPojo().getIssuedate());
		}
		scanner.close();
	}

}
