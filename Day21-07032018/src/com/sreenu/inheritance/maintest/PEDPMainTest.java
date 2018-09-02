package com.sreenu.inheritance.maintest;

import com.sreenu.inheritance.employee.Employee;

public class PEDPMainTest {

	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.name = "Sreenu";
		employee.age = 26;
		employee.employeID= 22;
		employee.gender="ale";
		employee.salary=5600;
		System.out.println(employee.name+" "+employee.gender+" "+employee.age+" "+employee.salary);
	}
}
