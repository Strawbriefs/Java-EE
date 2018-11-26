package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static Connection con=null;
	public static Connection getConnection() throws ClassNotFoundException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	try {
		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "0703");
	}catch(SQLException e){
		e.printStackTrace();
	}
	return con;
	}
}
