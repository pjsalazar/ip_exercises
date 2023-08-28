/**
 * 
 */
package com.salazar.peter.spider;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket; 
/**************************************************
*<b>Title</b>: SimpleSocketClientExample 
*<b>Project</b>: 
*<b>Description: </b> 
*<b>Copyright:</b> Copyright (c) Aug 3, 2023
*<b>Company:</b> Silicon Mountain Technologies 
*@author Peter Salazar
*@version 1.0
*@since Aug 3, 2023
*@updates:
*************************************************/
public class SimpleSocketClientExample {
	 
	
	public static void main (String[] args) {
		String server = "127.0.0.1";
//		String server = "smt-stage.qa.siliconmtn.com";
		String path = "/";
		SimpleSocketClientExample SSCE = new SimpleSocketClientExample(); 
		SSCE.printWebpage(server, path); 
	}
	
	public void printWebpage(String server, String path) {
		try {
			

			// Connect to the server
			Socket socket = new Socket(server, 80); 
			
			// Create input and output streams
			PrintStream out = new PrintStream(socket.getOutputStream()); 
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			out.print("GET "+path+" HTTP/1.1\r\n");
			out.print("Host: "+server+"\r\n");
			out.print("\r\n");
			
			// Read in data from the server until it's done
			String line = in.readLine(); 
			while (line != null) {
				System.out.println(line);
				line = in.readLine(); 
			}
			
			// Close streams
			in.close(); 
			out.close(); 
			socket.close(); 

		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}
}
