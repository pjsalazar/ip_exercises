package com.salazar.peter.lesson4;

import java.util.UUID;

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

// Implement serializable whenever we have a "Java Bean"
// That is, members are private, getters/setters, default constructor, etc
public class Person {

	// Java object "UUID" that maintains universality - DON'T USE AN INT
	private UUID personId;
	private String firstName;
	private String lastName;
	
	/**
	 * @param personId
	 * @param firstName
	 * @param lastName
	 */
	public Person(UUID personId, String firstName, String lastName) {
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * @return the personId
	 */
	public UUID getPersonId() {
		return personId;
	}

	/**
	 * @param personId the personId to set
	 */
	public void setPersonId(UUID personId) {
		this.personId = personId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
