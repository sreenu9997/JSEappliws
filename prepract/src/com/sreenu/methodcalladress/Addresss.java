package com.sreenu.methodcalladress;

public class Addresss {
	
	public String dno;
	public String streetname;
	public String city;
	public String district;
	public int pincode;
	

public String getAddress() {
	
	String result= dno +" "+ streetname +" "+ city +" "+ district +" "+ pincode;
	
	return result;
	
}
}