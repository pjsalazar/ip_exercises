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

import java.util.*;

public class CollectionsDemonstrator {

	private List<Person> personList;
	
	public static void main (String[] args) {
		CollectionsDemonstrator cd = new CollectionsDemonstrator();
		cd.runProcess();
		
	}
	
	public void runProcess() {
		setPersonList();
		shufflePersonList();
		//List<Person> pl = getPersonList();
		for (Person p : personList) {
			System.out.println(p.getID() + "," + p.getLastName() + "," + p.getFirstName());
		}
		
		String[] stringArr = {"one", "two"};
		List <String> stringList = convertStringArr(stringArr);
		System.out.println(stringList + ":" + stringList.getClass());
	}
	
	public void setPersonList() {
		// Populates personList with individuals
		Person[] players = new Person[3];
		
		players[0] = new Person();
		players[0].setID(23);
		players[0].setFirstName("Michael");
		players[0].setLastName("Jordan");
		
		players[1] = new Person();
		players[1].setID(15);
		players[1].setFirstName("Nikola");
		players[1].setLastName("Jokic");
		
		players[2] = new Person();
		players[2].setID(34);
		players[2].setFirstName("Giannis");
		players[2].setLastName("Antetokounmpo");
		
		personList = new ArrayList<Person>();
		for (Person p: players) {
			personList.add(p);
		}
	}
	
	public void shufflePersonList() {
		Collections.shuffle(personList);
	}
	
	public List<Person> getPersonList(){
		return personList;
	}
	
	public List<String> convertStringArr(String[] arr){
		return Arrays.asList(arr);
	}
	
	
	
	
}
