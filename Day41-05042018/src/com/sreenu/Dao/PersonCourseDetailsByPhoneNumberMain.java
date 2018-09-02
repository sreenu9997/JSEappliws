package com.sreenu.Dao;

import java.util.ArrayList;
import java.util.Scanner;

import com.sreenu.Pojo.CoursePojo;
import com.sreenu.Pojo.PersonPojo;

public class PersonCourseDetailsByPhoneNumberMain {

	
	public static void main(String[] args) {
		
		
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter PhoneNumber : ");
	
	int phoneNumber = scanner.nextInt();
	PersonCourseDetailsByPhoneNumberDao personCourseDetailsByPhoneNumberDao = new PersonCourseDetailsByPhoneNumberDao();
	PersonPojo personPojo = personCourseDetailsByPhoneNumberDao.getPersonCourseDetailsByphoneNumber(phoneNumber);
	
	System.out.println(personPojo.getPname() +" : : "+ personPojo.getQualification());
	ArrayList<CoursePojo> courseList = personPojo.getArrayCourses();
for(int i=0; i<courseList.size(); i++) {
	System.out.println(courseList.get(i).getCname()+" : : "+ courseList.get(i).getDuration());
}
	scanner.close();
	}

}

