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
	
		/**
		 * Controller method
		 */
	public void runProcess() {
		createPersonList();
		shufflePersonList();
		displayPersonList();
		
		String[] stringArr = {"one", "two"};
		List <String> stringList = convertStringArr(stringArr);
		System.out.println(stringList + ":" + stringList.getClass());
	}
	
		/**
		 * Instantiates and populates the class variable personList
		 */
	public void createPersonList() {
		personList = new ArrayList<Person>();
		
		personList.add(new Person(UUID.randomUUID(), "Michael", "Jordan"));
		personList.add(new Person(UUID.randomUUID(), "Fat", "Lever"));
		personList.add(new Person(UUID.randomUUID(), "Pete", "Maravich"));			
	}
	
		/**
		 * Shuffles class variable personList in-place
		 */
	public void shufflePersonList() {
		Collections.shuffle(personList);
	}
	
		/**
		 * Prints out the elements of personList
		 */
	public void displayPersonList() {
		for (Person p : personList) {
			System.out.println(p.getFirstName() + p.getLastName() + p.getPersonId().toString());
		}
	}
	
		/**
		 * Converts an array of Strings into a List
		 * @param An array of Strings
		 * @return An List containing the same elements
		 */
	public List<String> convertStringArr(String[] arr){
		return Arrays.asList(arr);
	}
	
	
	
	
}
