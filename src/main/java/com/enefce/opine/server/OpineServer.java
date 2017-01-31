/*******************************************************************************
 *     OpineServer - The server for the Opine project.
 *
 *
 * 	Author:
 * 	Prasad Pulikal
 *******************************************************************************/

package com.enefce.opine.server;

import static spark.Spark.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.enefce.opine.server.config.ServerConfig;


public class OpineServer {
	 public static void main(String[] args) {
		 
		 
		 ApplicationContext context = new ClassPathXmlApplicationContext(
					"Config.xml");

			ServerConfig obj = (ServerConfig) context.getBean("Config");
			obj.printServerDetails();
		 
		 
//		    OpineRequestHandlingServer prhServer = new OpineRequestHandlingServer(config.getServerThreads() + 5,
//					sqlFfactory);
//			Thread reqServerThread = new Thread(prhServer);
//			reqServerThread.start();
//
//			OpineWebSocketServer pWebSocketServer = new OpineWebSocketServer(8446, prhServer);
//			pWebSocketServer.start();
//
//			// Start server
//			OpineConcurrentServer server = new OpineConcurrentServer(8445, pWebSocketServer, 5, factory);
//			Thread serverThread = new Thread(server);
//			serverThread.start();
			
			
			//
	        get("/info", (req, res) -> "Opine Server");
	    }
	 
	 public static void stopServer() {
		 stop();
	 }
}
