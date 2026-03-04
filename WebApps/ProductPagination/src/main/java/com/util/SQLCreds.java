package com.util;

final public class SQLCreds {
	private String url = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String password = "#Sarthak@76342";
	
	public SQLCreds(String dbName) {
		this.url = url + dbName;
	}

	public String getUrl() {
		return url;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}
	
	
}
