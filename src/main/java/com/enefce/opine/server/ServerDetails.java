package com.enefce.opine.server;

import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public final class ServerDetails {

	private static final Logger LOGGER = Logger.getLogger(ServerDetails.class.getName());
	private static final ServerDetails INSTANCE = new ServerDetails();
	private String version;

	private ServerDetails() {
		ResourceBundle rb;
		try {
			rb = ResourceBundle.getBundle("project.properties");
			version = rb.getString("version");
		} catch (MissingResourceException e) {
			LOGGER.warning(
					"Resource bundle 'project.properties' was not found.");
		}
	}

	public static String getVersion() {
		return INSTANCE.version;
	}
}
