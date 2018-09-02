package com.sreenu.classbwithmethods;

public class StudentTest {

	
	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.name = "Sreenu";
		stu.sub1 = 62;
		stu.sub2 = 56;
		stu.sub3 = 85;
		
		int tot = stu.totalMarks();
		System.out.println(tot);
		float avg = stu.averageMarks();	
		System.out.println(avg);
		
		String res = stu.result();
		System.out.println(res);
	}
}
