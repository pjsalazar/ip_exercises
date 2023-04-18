package com.salazar.peter.lesson4;

/**************************************************
*<b>Title</b>: Person
*<b>Project</b>: Intro to Programming, Week 4
*<b>Description: </b> Contains a arrtibutes related to a particular individual (ID, first name, last name)
*<b>Copyright:</b> Copyright (c) April 17, 2023
*<b>Company:</b> Silicon Mountain Technologies 
*@author Peter Salazar
*@version 1.0
*@since April 17, 2023
*@updates:
*************************************************/

public class Person {

	private int personID;
	private String firstName;
	private String lastName;
	
	public void setID(int id) {
		personID = id;
	}
	
	public void setFirstName(String fn) {
		firstName = fn;
	}
	
	public void setLastName(String ln) {
		lastName = ln;
	}
	
	public int getID() {
		return personID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
}
