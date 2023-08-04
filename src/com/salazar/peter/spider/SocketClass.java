/**
 * 
 */
package com.salazar.peter.spider;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.Socket;
import java.io.DataOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**************************************************
*<b>Title</b>: SocketClass 
*<b>Project</b>: Intro to Programmint Spider project preface
*<b>Description: </b> Class to grab default file from a server and print to console
*<b>Copyright:</b> Copyright (c) Aug 2, 2023
*<b>Company:</b> Silicon Mountain Technologies 
*@author Peter Salazar
*@version 1.0
*@since Aug 2, 2023
*@updates:
*************************************************/

public class SocketClass {

	public static void main(String[] args) {
		SocketClass sc = new SocketClass(); 
		String res = sc.getDefaultWebpage("localhost", 80);
		System.out.println(res); 
	}
	/**
	 * 
		 * Description
		 * @param String host: the host server to access
		 * @param int portNumber: the portNumber to access on the server
		 * @return a String with the concatenated contents of default webpage html 
	 * @throws UnknownHostException 
	 */
	public String getDefaultWebpage(String host, int portNumber) {
		// Init stringbuilder for accumulating webpage html contents
		StringBuilder html = new StringBuilder(); 
		// Set up logger for registering messages
		Logger logger = Logger.getLogger(SocketClass.class.getName()); 
		// Try with resources to create connection to server indicated
		try(Socket echoSocket = new Socket(host, portNumber)){
			// Create output stream for sending data out from this socket
			DataOutputStream out = new DataOutputStream(echoSocket.getOutputStream()); 
			// Create input Stream for receiving data on this socket
			BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
			// Send initial get request to the host server 
			String byteString = "GET / HTTP/1.1\r\nHost: "+host+"\r\n\r\n"; 
			out.writeBytes(byteString); 
			// Initialize temp variable to hold each line
			String inLine; 
			// Iterate over the incoming file
			while(((inLine = in.readLine()) != null)) {
				html.append(inLine); 
			}
		} catch (Exception e) {
			logger.log(Level.INFO, "Unable to connect to server %s, port %d".formatted(host, portNumber), e);
		}
		return html.toString();
	}
	
//	public static void main (String[] args) {
//		String server = "127.0.0.1";
//		String path = "/";
//		SimpleSocketClientExample SSCE = new SimpleSocketClientExample(); 
//		SSCE.printWebpage(server, path); 
//	}
//	
//	public void printWebpage(String server, String path) {
//		try {
//			
//
//			// Connect to the server
//			Socket socket = new Socket(server, 80); 
//			
//			// Create input and output streams
//			PrintStream out = new PrintStream(socket.getOutputStream()); 
//			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			
//			out.print("GET "+path+" HTTP/1.1\r\n");
//			out.print("Host: "+server+"\r\n");
//			out.print("\r\n");
//			
//			// Read in data from the server until it's done
//			String line = in.readLine(); 
//			while (line != null) {
//				System.out.println(line);
//				line = in.readLine(); 
//			}
//			
//			// Close streams
//			in.close(); 
//			out.close(); 
//			socket.close(); 
//
//		} catch (Exception e) {
//			e.printStackTrace(); 
//		}
//	}
}
