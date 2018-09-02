package com.sreenu.relationshipsds;

public class Course {
	
	
	private String courseName;
	private String duration;
	private int fees;
	private Person[] person;
	
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public Person[] getPerson() {
		return person;
	}
	public void setPerson(Person[] person) {
		this.person = person;
	}
	
	
	
	
	

}
