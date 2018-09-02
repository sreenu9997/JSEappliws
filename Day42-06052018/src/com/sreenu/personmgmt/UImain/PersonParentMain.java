package com.sreenu.personmgmt.UImain;

import java.util.ArrayList;

import com.sreenu.personmgmt.dao.PersonParentDao;
import com.sreenu.personmgmt.pojo.PersonPojo;

public class PersonParentMain {

	public static void main(String[] args) {

		PersonParentDao personParentDao = new PersonParentDao();
		ArrayList<PersonPojo> persons = personParentDao.getPersonPojos();

		for (int i = 0; i < persons.size(); i++) {

			PersonPojo personparent = persons.get(i);
			PersonPojo parent = getParent(personparent.getParentid(), persons);

			personparent.setParent(parent);
			
			if (personparent != null)
				System.out.println(personparent.getIdperson() + "::" + personparent.getPname());
 
			if (parent != null)
				System.out.println(parent.getPname());
			System.out.println("==============================");
		}

	}

	public static PersonPojo getParent(int id, ArrayList<PersonPojo> persons) {
		PersonPojo person = null;
		for (int i = 0; i < persons.size(); i++) {

			if (persons.get(i).getIdperson() == id) {
				person = persons.get(i);
				break;
			}
		}
		return person;
	}
}
