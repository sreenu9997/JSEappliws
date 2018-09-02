package com.sreenu.userinterface;

import java.util.Scanner;


import com.sreenu.iopackage.StudentDetailsIOsetget;
import com.sreenu.thirdclass.StudentDetailsgetset;

public class StudentUserInterfacegetset {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter name : ");
		String name = scanner.nextLine();
		System.out.print("Please enter age : ");
		int age = scanner.nextInt();
		System.out.print("Please enter qualification : ");
		String qualification = scanner.nextLine();
		if(qualification.equals("")){
			qualification = scanner.nextLine();
		}
		
		System.out.print("Please enter phone :");
		int phoneNumber = scanner.nextInt();
		System.out.print("Please enter address : ");
		String address = scanner.nextLine();
		if(address.equals("")) {
			address = scanner.nextLine();
		}
		
		StudentDetailsIOsetget studentDetailsIOsetget = new StudentDetailsIOsetget();
		
		StudentDetailsgetset studentDetailsgetset = new StudentDetailsgetset();
		studentDetailsgetset.setName(name);
		studentDetailsgetset.setAge(age);
		studentDetailsgetset.setQualification(qualification);
		studentDetailsgetset.setPhoneNumber(phoneNumber);
		studentDetailsgetset.setAddress(address);
		
		studentDetailsIOsetget.savestudentdetails(studentDetailsgetset);
		
		scanner.close();
		System.out.println("done");
	}

}
