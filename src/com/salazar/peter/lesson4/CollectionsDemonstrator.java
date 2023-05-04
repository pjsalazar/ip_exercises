package com.salazar.peter.lesson4;

/**************************************************
*<b>Title</b>: CollectionsDemonstrator
*<b>Project</b>: Intro to Programming, Week 4
*<b>Description: </b> Class demonstrating operations on collections
*<b>Copyright:</b> Copyright (c) April 17, 2023
*<b>Company:</b> Silicon Mountain Technologies 
*@author Peter Salazar
*@version 1.0
*@since April 17, 2023
*@updates:
*************************************************/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;


public class CollectionsDemonstrator {
	
	private List<Person> personList;
	
	public static void main (String[] args) {
		CollectionsDemonstrator cd = new CollectionsDemonstrator();
		cd.runProcess();
	}
	
	// This is your "controller method" - don't do things besides call other methods
	public void runProcess() {
		createPersonList();
		shufflePersonList();
		displayPersonList();
		
		String[] stringArr = {"one", "two"};
		List <String> stringList = convertStringArr(stringArr);
		System.out.println(stringList + ":" + stringList.getClass());
	}
	
	public void createPersonList() {
		// Populates personList with individuals
		personList = new ArrayList<Person>();
		
		personList.add(new Person(UUID.randomUUID(), "Michael", "Jordan"));
		personList.add(new Person(UUID.randomUUID(), "Fat", "Lever"));
		personList.add(new Person(UUID.randomUUID(), "Pete", "Maravich"));			
	}
	
	public void shufflePersonList() {
		Collections.shuffle(personList);
	}
	
	public void displayPersonList() {
		for (Person p : personList) {
			System.out.println(p.getFirstName() + p.getLastName() + p.getPersonId().toString());
		}
	}
	
	public List<String> convertStringArr(String[] arr){
		return Arrays.asList(arr);
	}
	
	
	
	
}
