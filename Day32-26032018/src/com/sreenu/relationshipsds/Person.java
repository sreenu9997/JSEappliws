package com.sreenu.relationshipsds;

public class Person {
	
	private String name;
	private int age;
	private String qualification;
	private Passport passPort;
	private Phone[] phone;
	private Course[] course;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public Passport getPassPort() {
		return passPort;
	}
	public void setPassPort(Passport passPort) {
		this.passPort = passPort;
	}
	public Phone[] getPhone() {
		return phone;
	}
	public void setPhone(Phone[] phone) {
		this.phone = phone;
	}
	public Course[] getCourse() {
		return course;
	}
	public void setCourse(Course[] courses) {
		this.course = courses;
	}
	
	

}
