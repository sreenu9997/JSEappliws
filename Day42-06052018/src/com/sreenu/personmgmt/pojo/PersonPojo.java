package com.sreenu.personmgmt.pojo;

public class PersonPojo {

	
	private int idperson;
	private String  pname;
	private String qualification;
	private int age;
	private int parentid;
	private PersonPojo parent;
	
	public PersonPojo getParent() {
		return parent;
	}
	public void setParent(PersonPojo parent) {
		this.parent = parent;
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
	public int getParentid() {
		return parentid;
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
	public void setParentid(int parentid) {
		this.parentid = parentid;
	}
	
}
