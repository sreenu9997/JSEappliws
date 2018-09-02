package com.sreenu.methodcallmain;

import com.sreenu.methodcall.StudentDetails;
import com.sreenu.methodcalladress.Addresss;

public class MainTest {
public static void main(String[] args) {
	
	StudentDetails sd = new StudentDetails();
	sd.sName = "Sreenu";
	
	Addresss ad = new Addresss();
	ad.dno = "2356";
	ad.city = "kadapatown";
	ad.streetname="Onipenta";
	sd.address=ad;
	ad.pincode=516173;
	ad.district="Kadapa";
	String res = sd.address.getAddress();
	
	System.out.println(sd.sName + " "+res);
}
}
