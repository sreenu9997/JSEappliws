package com.sreenu.UI;

import java.util.ArrayList;
import java.util.Scanner;

import com.sreenu.Dao.PersonPhoneDetailsBypassportNumberDao;
import com.sreenu.Pojo.PersonPojo;
import com.sreenu.Pojo.PhonePojo;

public class PersonPhoneDetailsByPassportNumberMain {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter PassportNumber : ");
		String passportnumber = scanner.nextLine();
		
		PersonPhoneDetailsBypassportNumberDao personPhoneDetailsBypassportNumberDao = new PersonPhoneDetailsBypassportNumberDao();
		PersonPojo person = personPhoneDetailsBypassportNumberDao.getPersonPhoneDetailsBypassportNumber(passportnumber);
		System.out.println("===================== Person Details ================");
		System.out.println(person.getPname());
		System.out.println(person.getQualification());
		System.out.println(person.getAge());
		System.out.println("===================== PassPort Details ================");
		System.out.println(person.getPassportPojo().getExpdate());
		System.out.println(person.getPassportPojo().getIssuedate());
		System.out.println(person.getPassportPojo().getPassportnumber());
		ArrayList<PhonePojo> phoneList = person.getArrayphones();
		System.out.println("===================== Phone Details ================");
		for(int i=0; i< phoneList.size() ; i++) {
			
		System.out.println(phoneList.get(i).getPhonenumber()+" :: "+phoneList.get(i).getNetwork());
		}
		scanner.close();
	}
}
