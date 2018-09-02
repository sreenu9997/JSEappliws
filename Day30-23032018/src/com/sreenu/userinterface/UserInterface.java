package com.sreenu.userinterface;

import java.util.Scanner;

import com.sreenu.iopackage.StudentDataIo;

public class UserInterface {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
				System.out.print("Please Enter Name : ");
		String name = scanner.nextLine();
		
		System.out.print("Please Enter age : ");
		int age = scanner.nextInt();
		
		System.out.print("Please enter qualification : ");
		String qualification = scanner.nextLine();
		
		if(qualification.equals("")) {
			qualification = scanner.nextLine();
		}
		
		
		StudentDataIo studentDataIo = new StudentDataIo();
				studentDataIo.saveStudentdata(name, age, qualification);
		
		scanner.close();
		System.out.println("Done");
	}
	
}
