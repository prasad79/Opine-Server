/*******************************************************************************
 *     OpineServer - The server for the Opine project.
 *
 *
 * 	Author:
 * 	Prasad Pulikal
 *******************************************************************************/

package com.enefce.opine.server;

import static spark.Spark.*;



public class OpineServer {
	 public static void main(String[] args) {
			
			port(getHerokuAssignedPort());
	        get("/info", (req, res) -> "Opine Server");
	        System.out.println("Server Started");
	    }
	 
	 public static void stopServer() {
		 stop();
	 }
	 
	 static int getHerokuAssignedPort() {
	        ProcessBuilder processBuilder = new ProcessBuilder();
	        if (processBuilder.environment().get("PORT") != null) {
	            return Integer.parseInt(processBuilder.environment().get("PORT"));
	        }
	        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
	    }
}
