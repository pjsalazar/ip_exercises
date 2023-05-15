/**
 * 
 */
package com.salazar.peter.lesson3;

import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter; 
import java.io.BufferedReader;
import java.io.PrintWriter;
/**************************************************
*<b>Title</b>: UppercaseConverter 
*<b>Project</b>: ip_exercises
*<b>Description: </b> Class that reads a text file, converts to uppercase, and outputs file
*<b>Copyright:</b> Copyright (c) May 4, 2023
*<b>Company:</b> Silicon Mountain Technologies 
*@author Peter Salazar
*@version 1.0
*@since May 4, 2023
*@updates:
*************************************************/
public class UppercaseConverter {
	
	public static void main (String[] args) throws IOException {
		UppercaseConverter uc = new UppercaseConverter();
		uc.process(new File("cuicatl.txt"), new File("uppercase.txt"));
	}
	

	/**
	 * 
		 * Controller method for reading a file and writing the capitalized output to a file 
		 * Via the FileInFileOut object
		 * @param File in: file to read from, File out: file to write to
	 */
	private void process(File in, File out) throws IOException {
		
		// Initialize fifo object w/ root folder
		FileInFileOut fifo = new FileInFileOut(in); 
		
		// Set up try-with-resources to close reader and writer
		try(BufferedReader reader = new BufferedReader(new FileReader(in));
			PrintWriter writer = new PrintWriter(new FileWriter(out))){
			
			String line = null; 
			while ((line = fifo.readIn(reader)) != null) {
				line = line.toUpperCase();
				fifo.writeOut(line, writer);
			}
		}
		
		
	}
}
