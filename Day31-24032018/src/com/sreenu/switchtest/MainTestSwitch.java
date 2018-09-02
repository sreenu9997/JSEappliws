package com.sreenu.switchtest;

import java.io.IOException;
import java.util.Scanner;


import com.sreenu.switchLogic.StudentDS;
import com.sreenu.switchOptions.Optins;
import com.sreenu.switchtestPojo.StudentData;


public class MainTestSwitch {
	
	public static void main(String[] args) throws IOException {
	
		/*System.out.println("  Menu  ");
		System.out.println("1. Add Data ");
		System.out.println("2. Get data ");
		System.out.println("3. Exit ");
		
		System.out.print("Enter Your Choice ::");
		*/
		Optins.getOptions();
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
while(number != 3) {
	
		if(number==1) {
			
			System.out.print("Please enter name : ");
			String name = scanner.nextLine();
			if(name.equals("")){
				name = scanner.nextLine();
			}
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
			
			StudentDS studentDS = new StudentDS();
			
			StudentData studentData = new StudentData();
			studentData.setName(name);
			studentData.setAge(age);
			studentData.setQualification(qualification);
			studentData.setPhoneNumber(phoneNumber);
		//studentData.setAddress(address);
			
			studentDS.saveData(studentData);
			
		
			System.out.println("Student Details Added Successfully");

		}
		if(number==2) {
					
			StudentDS studentDS2 = new StudentDS();
			studentDS2.readData();
			
			System.out.println("Data Reading completed Successfully");
					
		}
		Optins.getOptions();
		/*System.out.print("  Menu  ");
		System.out.print("1. Add Data ");
		System.out.print("2. Get data ");
		System.out.print("3. Exit ");
		
		System.out.print("Enter Your Choice ::");*/
		number = scanner.nextInt();
}
scanner.close();
System.out.println("Exit");
	}
	}
