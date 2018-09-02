package com.sreenu.userinterface;


import java.io.IOException;
import java.util.Scanner;

import com.sreenu.iopackage.StudentDetailsDataIO;
import com.sreenu.thirdclass.StudentDetails;

public class StudentDetailsUserInterface {

	
	public static void main(String[] args)  {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter name :");
		String name = scanner.nextLine();
		System.out.print("Please enter age :");
		int age = scanner.nextInt();
		System.out.print("Please enter qualification :");
		String qualification = scanner.nextLine();
		if(qualification.equals("")) {
			qualification = scanner.nextLine();
		}
		System.out.print("Please enter phone number :");
		int phoneNumber = scanner.nextInt();
		System.out.print("Please enter address :");
				String address = scanner.nextLine();
				if(address.equals("")) {
					address = scanner.nextLine();
				}
				
				
				StudentDetailsDataIO studentDetailsDataIO = new StudentDetailsDataIO();
				
				StudentDetails studentDetails = new StudentDetails();
				studentDetails.name = name;
				studentDetails.age = age;
				studentDetails.qualification =qualification;
				studentDetails.phoneNumber = phoneNumber;
				studentDetails.address =address;
						
				
				try {
					studentDetailsDataIO.saveStudentDetails(studentDetails);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				scanner.close();
				System.out.println("Done");
	}
}
