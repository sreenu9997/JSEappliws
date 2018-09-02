package com.sreenu.persontest;

import java.util.Scanner;

import com.sreenu.person.Person;
import com.sreenu.personimplclasses.Employee;
import com.sreenu.personimplclasses.Student;

public class MainTest {

	
	public static void main(String[] args) {
		
		Person person= null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Choice");
		System.out.println("1. Student");
		System.out.println("2. Employee");
		System.out.println("3. Exit");
		System.out.println("==================");
		
		String str = "exit";
		String str1 ="student";
		String str2 = "employee";
		String string = scanner.next();
		
		while(!string.contains(str)) {
			
			
			if(string.contains(str1)) {
				person = new Student();
			}
			else if(string.contains(str2)) {
				person = new Employee();
				
			}
			person.gotoWork();
			System.out.println("==================");
			System.out.println("==================");
			System.out.println("Enter your Choice");
			System.out.println("1. Student");
			System.out.println("2. Employee");
			System.out.println("3. Exit");
			System.out.println("==================");
			
			string = scanner.next();
			
		}
		scanner.close();
	}
}
