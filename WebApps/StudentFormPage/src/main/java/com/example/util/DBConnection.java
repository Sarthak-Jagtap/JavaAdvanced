package com.example.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	private SQLCreds obj = new SQLCreds("student_db");

	public Connection createDBConnection() {

		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(obj.getUrl(), obj.getUser(), obj.getPassword());

		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}
}