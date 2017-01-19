package ch.opine;

import static spark.Spark.*;

public class Server {
	 public static void main(String[] args) {
	        get("/info", (req, res) -> "Opine Server");
	    }
}
