package com.sreenu.claswithmethod;

public class StudentTest {

	
	public static void main(String[] args) {
		
		StudentClass sclass = new StudentClass();
		sclass.marks1 = 60;
		sclass.marks2 = 85;
		sclass.marks3 = 90;
		
		int res = sclass.total();
		System.out.println(res);
		
		int avgr = sclass.avg();
		System.out.println(avgr);
		
		String result = sclass.getStatus();
		System.out.println(result);
	}
}
