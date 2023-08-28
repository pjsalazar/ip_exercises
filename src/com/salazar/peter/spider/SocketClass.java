/**
 * 
 */
package com.salazar.peter.spider;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.net.URL; 

import java.time.LocalDateTime;

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
		
		String host1 = "127.0.0.1"; 
		String host2 = "smt-stage.qa.siliconmtn.com"; 
		String host3 = "www.google.com"; 
		String host4 = "siliconmtn.com"; 
		
//		String res = sc.getDefaultWebpage(host1, 80); 
//		System.out.println(res); 
		
		String res = sc.getWebpageSSL(host2, 443);
		System.out.println(res); 
		
	}
	/**
	 * 
		 * Description
		 * @param String host: the host server to access
		 * @param int portNumber: the portNumber to access on the server
		 * @return a String with the concatenated contents of default webpage html 
	 */
	public String getDefaultWebpage(String host, int port) {
		// Init stringbuilder for accumulating webpage html contents
		StringBuilder html = new StringBuilder(); 
		// Set up logger for registering messages
		Logger logger = Logger.getLogger(SocketClass.class.getName()); 
		// Try with resources to create connection to server indicated
		try(Socket echoSocket = new Socket(host, port)){
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
				html.append(inLine + "\n");
			}

		} catch (Exception e) {
			logger.log(Level.INFO, "Unable to connect to server %s, port %d".formatted(host, port), e);
		}
		return html.toString();
	}
	
	/**
	 * 
		 * Description
		 * @param String host: the host server to access
		 * @param int portNumber: the portNumber to access on the server
		 * @return a String with the concatenated contents of default webpage html 
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public String getWebpageSSL(String host, int port) {
		StringBuilder html = new StringBuilder(); 

		Logger logger = Logger.getLogger(SocketClass.class.getName()); 

		try {
			SSLSocketFactory sslsocketfactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
			SSLSocket sslsocket = (SSLSocket) sslsocketfactory.createSocket(host, port);
			
			BufferedReader in = new BufferedReader(new InputStreamReader(sslsocket.getInputStream()));
			DataOutputStream out = new DataOutputStream(sslsocket.getOutputStream()); 
//			InputStream in = sslsocket.getInputStream();
//			OutputStream out = sslsocket.getOutputStream();

			System.out.println("Secured connection performed successfully");

			String byteString = "GET / HTTP/1.1\r\nHost: "+host+"\r\n\r\n"; 
			out.writeBytes(byteString); 			
			String inLine; 

			while(((inLine = in.readLine()) != null)) {
				html.append(inLine + "\n");
			}
			
		} catch(UnknownHostException uhe) {
			logger.log(Level.INFO, "Unknown Host", uhe);
		} catch(IOException ioe) {
			logger.log(Level.INFO, "IO Exception encountered", ioe);
		}


		return html.toString(); 
	}
	
}
