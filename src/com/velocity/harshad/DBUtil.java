package com.velocity.harshad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	public static  Connection getConnection()  throws ClassNotFoundException, SQLException {
		//Load driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/javaquiz?characterEncoding=latin1";
		//establish the connection
		Connection con = DriverManager.getConnection(url, "root", "root");
		
		return con;
	}

}
