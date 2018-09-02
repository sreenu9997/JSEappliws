package com.sreenu.Pojo;

import java.util.ArrayList;

public class PersonPojo {

	
	private int idperson;
	private String pname;
	private String qualification;
	private int age;
	private PassportPojo passportPojo;
	
	private ArrayList<PhonePojo> arrayphones;
	private ArrayList<CoursePojo> arrayCourses;
	
	
	public ArrayList<CoursePojo> getArrayCourses() {
		return arrayCourses;
	}
	public void setArrayCourses(ArrayList<CoursePojo> arrayCourses) {
		this.arrayCourses = arrayCourses;
	}
	public ArrayList<PhonePojo> getArrayphones() {
		return arrayphones;
	}
	public void setArrayphones(ArrayList<PhonePojo> arrayphones) {
		this.arrayphones = arrayphones;
	}
	public int getIdperson() {
		return idperson;
	}
	public String getPname() {
		return pname;
	}
	public String getQualification() {
		return qualification;
	}
	public int getAge() {
		return age;
	}
	public PassportPojo getPassportPojo() {
		return passportPojo;
	}
	public void setIdperson(int idperson) {
		this.idperson = idperson;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPassportPojo(PassportPojo passportPojo) {
		this.passportPojo = passportPojo;
	}
	
	
}
