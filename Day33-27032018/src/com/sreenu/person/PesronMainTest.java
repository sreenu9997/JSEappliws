package com.sreenu.person;

public class PesronMainTest {
	public static void main(String[] args) {
		
	Person person1 = new Person();
	person1.setName("person1");
	person1.setAge(26);
	person1.setQualification("MCA");
	person1.setPhoneNumber(6658);
	person1.setParent(null);
	
	
	
	
	Person person2 = new Person();
	person2.setName("person2");
	person2.setAge(26);
	person2.setQualification("MCA");	
	//person2.setPhoneNumber(6589587);
	person2.setParent(person1);
	
	
	
	Person person3 = new Person();
	person3.setName("person3");
	person3.setAge(26);
	person3.setQualification("MCA");
	//person3.setPhoneNumber(6589587);
	person3.setParent(person2);
	
	
	Person person4 = new Person();
	person4.setName("person4");
	person4.setAge(26);
	person4.setQualification("MCA");
	//person4.setPhoneNumber(6589587);
	person4.setParent(person3);
	
	
	Person person5 = new Person();
	person5.setName("person5");
	person5.setAge(26);
	person5.setQualification("MCA");
	//person5.setPhoneNumber(6589587);
	
	person5.setParent(person4);
	
	
	
	Person person6 = new Person();
	person6.setName("person6");
	person6.setAge(26);
	person6.setQualification("MCA");
	//person6.setPhoneNumber(6589587);
	person6.setParent(person5);
	
	
	int pdata = getPhoneData(person6);
	System.out.println(pdata);
	
	}
	
	public static int getPhoneData(Person person){
		if(person == null){
		return 0;
		}
		int phone = person.getPhoneNumber();
		if(phone ==0){
		phone = getPhoneData(person.getParent());

		}

		return phone;
		}
	// Explanation
	//
	//
	//

/*	public static int getData(Person person) {
		
		int phone1 = person.getPhoneNumber();
			while(phone1 ==0){
				person = person.getParent();
					if(person == null){
						break;
					}
					phone1 = person.getPhoneNumber();
			}
		return phone1;
		}
*/	
	
/*public static int getPhonedata(Person parent) {
		int phone = parent.getPhoneNumber();
		if(phone==0) {
			parent = parent.getParent();
			phone = parent.getPhoneNumber();
		}
		
	
	return phone;
	}
*/
	
}
