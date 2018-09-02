package com.sreenu.relationshipsds;

import org.omg.CORBA.PERSIST_STORE;

public class MainTestRelation {

	public static void main(String[] args) {
		
		
		/*
		Person person1 = new Person();
		
		Person[] persons = new Person[3];
		persons[0]=person1;
		
		Passport passport = new Passport();
		passport.setExpDate("22/04/2019");
		passport.setIssueDate("22/04/2014");
		passport.setPassportNumber(65897);
		passport.setPerson(persons[1]);
		
		
		Course course1 = new Course();
		courses.setCourseName("JAVA");
		courses.setDuration("3Months");
		courses.setFees(30000);
		courses.setPerson(persons[0]);
		
		
		
		Phone phone1 = new Phone();
		phone1.setConnection("Airtel");
		phone1.setNumber(985698);
		phone1.setPerson(persons);
		
		
		person1.setName("Sreenu");
		person1.setPassPort(passport);
		person1.setAge(26);;
		person1.setQualification("MCA");
		person1.setCourse(courses);
		
		
		
		
		
		
		
		
		
		
		System.out.println(persons[1].getAge());
		
		*/
		
		
		
		
		
		
		
		
		
		
		Person person1 = new Person();
		Person[] persons= new Person[3];
		persons[0]=person1;
		
		
		//===============One Passport Object =============
		
		Passport passPort = new Passport();
		passPort.setExpDate("22/03/2015");
		passPort.setIssueDate("22/03/2012");
		passPort.setPassportNumber(2256589);
		passPort.setPerson(person1);
		
		
		
		//============== Three Phone Objects ===================
		
		Phone phone1 = new Phone();
		phone1.setConnection("Idea");
		phone1.setNumber(236589);
		phone1.setPerson(persons);
		
		
		Phone phone2 = new Phone();
		phone2.setConnection("JIO");
		phone2.setNumber(65897);
		phone2.setPerson(persons);
		
		
		Phone phone3 = new Phone();
		phone3.setNumber(56487);
		phone3.setConnection("VF");
		phone3.setPerson(persons);
		
		//=============initializing Phone[] ==========
		
		
		Phone [] phones = new Phone[3];
		phones[0]=phone1;
		phones[1]=phone2;
		phones[2]=phone3;
		
		//============ Three Course Objects==========
		
		
		Course course1 = new Course();
		course1.setCourseName("JAVA");
		course1.setDuration("3Months");
		course1.setFees(5000);
		course1.setPerson(persons);
		
		Course course2 = new Course();
		course2.setCourseName("Hibernate");
		course2.setDuration("3Months");
		course2.setFees(5000);
		course2.setPerson(persons);
		
		

		Course course3 = new Course();
		course3.setCourseName("Spring");
		course3.setDuration("3Months");
		course3.setFees(5000);
		course3.setPerson(persons);
		
		
		
		Course [] courses = new Course[3];
		courses[0] = course1;
		courses[1] = course2;
		courses[2] = course3;
		
		
		person1.setName("Sreenu");
		person1.setAge(25);
		person1.setPassPort(passPort);
		person1.setCourse(courses);
		person1.setPhone(phones);
		
		Course[] courses2 = person1.getCourse();
		for(int i=0;i<courses2.length; i++) {
			System.out.println(courses2[i].getCourseName()+" :: "+ person1.getName());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}		
	
}
