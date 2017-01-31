package com.enefce.opine.server.config;

public class ServerConfig {

	
	private String serverName;
	private String serverIP;
	private String serverContactName;

	private String sqlUsername;
	private String sqlPassword;
	private String sqlHostname;
	private int sqlPort;
	private String sqlDatabase;
	
	
	/**
	 * @return the serverName
	 */
	public String getServerName() {
		return serverName;
	}
	/**
	 * @param serverName the serverName to set
	 */
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	/**
	 * @return the serverIP
	 */
	public String getServerIP() {
		return serverIP;
	}
	/**
	 * @param serverIP the serverIP to set
	 */
	public void setServerIP(String serverIP) {
		this.serverIP = serverIP;
	}
	/**
	 * @return the serverContactName
	 */
	public String getServerContactName() {
		return serverContactName;
	}
	/**
	 * @param serverContactName the serverContactName to set
	 */
	public void setServerContactName(String serverContactName) {
		this.serverContactName = serverContactName;
	}
	/**
	 * @return the sqlUsername
	 */
	public String getSqlUsername() {
		return sqlUsername;
	}
	/**
	 * @param sqlUsername the sqlUsername to set
	 */
	public void setSqlUsername(String sqlUsername) {
		this.sqlUsername = sqlUsername;
	}
	/**
	 * @return the sqlPassword
	 */
	public String getSqlPassword() {
		return sqlPassword;
	}
	/**
	 * @param sqlPassword the sqlPassword to set
	 */
	public void setSqlPassword(String sqlPassword) {
		this.sqlPassword = sqlPassword;
	}
	/**
	 * @return the sqlHostname
	 */
	public String getSqlHostname() {
		return sqlHostname;
	}
	/**
	 * @param sqlHostname the sqlHostname to set
	 */
	public void setSqlHostname(String sqlHostname) {
		this.sqlHostname = sqlHostname;
	}
	/**
	 * @return the sqlPort
	 */
	public int getSqlPort() {
		return sqlPort;
	}
	/**
	 * @param sqlPort the sqlPort to set
	 */
	public void setSqlPort(int sqlPort) {
		this.sqlPort = sqlPort;
	}
	/**
	 * @return the sqlDatabase
	 */
	public String getSqlDatabase() {
		return sqlDatabase;
	}
	/**
	 * @param sqlDatabase the sqlDatabase to set
	 */
	public void setSqlDatabase(String sqlDatabase) {
		this.sqlDatabase = sqlDatabase;
	}
	
	public void printServerDetails () {
		System.out.println("Server Name "+serverName);
	}
	
}
