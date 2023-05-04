package com.salazar.peter.lesson4;

import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;

/**************************************************
*<b>Title</b>: StatesMap
*<b>Project</b>: Intro to Programming, Week 4
*<b>Description: </b> Class demonstrating an ability to manipulate maps
*<b>Copyright:</b> Copyright (c) April 17, 2023
*<b>Company:</b> Silicon Mountain Technologies 
*@author Peter Salazar
*@version 1.0
*@since April 17, 2023
*@updates:
*************************************************/

public class StatesMap {

	// Code to the interface - initialize this as a Map
	private Map<String, String> statesThatMatter;	
	
	public static void main (String[] args) {
		boolean rev = true;
		StatesMap sm = new StatesMap(rev);
		sm.display();
	}
	
	/**
	 * Constructor - fills the class variable statesThatMatter 
	 * based on the order specified with "rev"
	 * @param rev
	 */
	public StatesMap(boolean rev) {
		this.fillStates(rev);
	}
	
	
		/**
		 * Instantiates the class variable as a TreeMap
		 * Populates with state data, in the order corresponding to the user input "rev"
		 * @param rev
		 */
	private void fillStates(boolean rev) {
		// Populates the states HashMap  based on whether we indicated forward or backward
		if (rev) statesThatMatter = new TreeMap<>(Comparator.reverseOrder());
		else statesThatMatter = new TreeMap<>();
		
		statesThatMatter.put("AZ",  "Arizona");
		statesThatMatter.put("CO", "Colorado");
		statesThatMatter.put("NV", "Nevada");
		statesThatMatter.put("NV", "Nevada");
		statesThatMatter.put("NM", "New Mexico");
		statesThatMatter.put("ID", "Idaho");
		statesThatMatter.put("MT", "Montana");
		statesThatMatter.put("WY", "Wyoming");
		statesThatMatter.put("CA", "California");
		statesThatMatter.put("WA", "Washington");
		statesThatMatter.put("OR", "Oregon");
	}
	
		/**
		 * Prints out the class variable statesThatMatter by element
		 */
	private void display() {
		for (Map.Entry<String, String> entry : statesThatMatter.entrySet()) {
			System.out.println(entry);
		}
		System.out.println("\n");
	}
}
