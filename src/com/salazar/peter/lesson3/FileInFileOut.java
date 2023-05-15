/**
 * 
 */
package com.salazar.peter.lesson3;

import java.io.IOException;
import java.io.File;
import java.io.BufferedReader;
import java.io.PrintWriter;
/**************************************************
*<b>Title</b>: FileInFileOut 
*<b>Project</b>: ip_exercises
*<b>Description: </b> Class with methods that read in a file and write out a file
*<b>Copyright:</b> Copyright (c) May 11, 2023
*<b>Company:</b> Silicon Mountain Technologies 
*@author Peter Salazar
*@version 1.0
*@since May 11, 2023
*@updates:
*************************************************/
public class FileInFileOut {

	File root;

	/**
	 * @param filePath indicating the file we start with
	 */
	public FileInFileOut(File root) {
		super();
		this.root = root;
	} 
	
	/**
	 * 
	 	* Read in a line of a file from an input BufferedReader
	 	* @return A String corresponding to the line just read
	 */
	public String readIn(BufferedReader reader) throws IOException {
		return reader.readLine(); 
	}
	
	/**
	 * 
		 * Write out the line of a file via provided reader
		 * @param String line: the line to be written
		 * 		  PrintWriter writer: the writer to be used - already hooked to destination 
	 */
	public void writeOut(String line, PrintWriter writer) throws IOException {
		writer.println(line); 
	}
	
}
