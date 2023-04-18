package com.salazar.peter.lesson4;

import java.util.*;

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

	private HashMap<String, String> states;
	private String[] stateNames = {
			"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut",
			"Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa",
			"Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", 
			"Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", 
			"New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", 
			"Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", 
			"Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", 
			"Wisconsin", "Wyoming"
	};
	private String[] stateAbs = {
			"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", 
			"KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", 
			"NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", 
			"VA", "WA", "WV", "WI", "WY"
	};
	
	
	public static void main (String[] args) {
		StatesMap sm = new StatesMap();
		
		//sm.fillStates();
		//HashMap<String, String> smap = sm.getMap();
		
		TreeMap <String, String> smap = sm.revOrderByAbbrev();
		
		for (Map.Entry<String,String> entry : smap.entrySet()) {
			System.out.println(entry);
		}
	}
	
	private void fillStates() {
		// Populates the original states HashMap
		
		states = new HashMap<>(stateNames.length);
		
		for(int i = 0; i < stateNames.length; i++) {
			states.put(stateAbs[i], stateNames[i]);
		}
	}
	
	public TreeMap<String, String> orderByAbbrev() {
		// returns a treemap sorted by state abbreviations
		
		//Initializes HashMap if not already populated
		fillStates();
		
		// Populate new TreeMap (self-sorting)
		TreeMap<String, String> sorted = new TreeMap<>();
		sorted.putAll(states);
		
		return sorted;
		
	}
	
	public TreeMap<String, String> revOrderByAbbrev(){
		// returns a treemap sorted in reverse order of state abbreviations

		// Initialize HashMap
		fillStates();
		
		// Populate new TreeMap
		TreeMap <String, String> sorted = new TreeMap<>(Comparator.reverseOrder());
		sorted.putAll(states);
		
		return sorted;
	}
	
	public HashMap <String, String> getMap(){
		return states;
	}
}