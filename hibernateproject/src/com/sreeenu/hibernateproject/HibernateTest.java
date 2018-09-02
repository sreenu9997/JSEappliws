package com.sreeenu.hibernateproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class HibernateTest {

	public static void main(String[] args) {
		
		
		Configuration cfg = new AnnotationConfiguration().configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		StudentPojo student = (StudentPojo) session.get(StudentPojo.class, 1);
		System.out.println(student.getSno());
		System.out.println(student.getName());
		System.out.println(student.getMarks());
		
		session.close();
		sf.close();

	}

}
