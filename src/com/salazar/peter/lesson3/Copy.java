/**
 * 
 */
package com.salazar.peter.lesson3;

import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
/**************************************************
*<b>Title</b>: Copy 
*<b>Project</b>: ip_exercises
*<b>Description: </b> Demonstrating file streams
*<b>Copyright:</b> Copyright (c) May 4, 2023
*<b>Company:</b> Silicon Mountain Technologies 
*@author Peter Salazar
*@version 1.0
*@since May 4, 2023
*@updates:
*************************************************/
public class Copy {

	public static void main(String[] args) throws IOException {
		
		File inputFile = new File("farrago.txt");
		File outputFile = new File("outagain.txt");
		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);
		
		int c;
		while((c = in.read()) != -1) {
			System.out.println((char)Character.toUpperCase(c));
			out.write(c);
		}
		in.close();
		out.close();
	}
}
