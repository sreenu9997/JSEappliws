package com.sreenu.maintest;

import com.sreenu.doctor.Doctor;
import com.sreenu.employee.Employee;
import com.sreenu.patient.Patient;
import com.sreenu.person.Person;

public class PatientDoctorEmployeeTest {
	
	public static void main(String[] args) {
		
		
		
		Employee employee = new Employee();
		employee.employeeID= 24;
		employee.salary = 25000;
		
		Person person = new Person();
		person.name = "Sanju";
		person.gender ="Male";
		person.age = 25;
		
		
		employee.person=person;
		
		
		
		System.out.println(employee.person.name);
		
		
		Doctor doctor = new Doctor();
		doctor.fees=500;
		doctor.specialization="MBBS";
		doctor.timings = "1-5";
		
		
		Person person2 = new Person();
		person2.name= "Sreenu";
		person2.gender="Male";
		person2.age = 26;
		doctor.person=person2;
		
		
		System.out.println(doctor.person.gender);
		
		Patient patient = new Patient();
		patient.complaints = "Skin";
		patient.treatmentdetails = "Ongoing";
		patient.medicine = "dolo-650";
		
		Person person3 =new  Person();
		person3.name = "Sree";
		person3.gender="Female";
		person3.age=20;
		
		patient.person=person3;
		System.out.println(patient.person.age);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
