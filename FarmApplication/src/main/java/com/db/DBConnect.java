package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	private static Connection conn;

	public static Connection getConn() {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/farma", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

}
