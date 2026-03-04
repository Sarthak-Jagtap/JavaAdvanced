package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private SQLCreds creds = new SQLCreds("productDB");

	public Connection createDBConnection() {
		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(creds.getUrl(), creds.getUrl(), creds.getPassword());
		} catch (SQLException s) {
			System.out.println("Exception Occurred While creating connection");
		} catch(ClassNotFoundException e) {
			System.out.println("SQL Class Not Found");
		}

		return conn;
	}

}
