package Connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.lang.ClassNotFoundException;

public class DBUtil {
	final static String forNameUrl="com.mysql.cj.jdbc.Driver";
	final static String dBURL="jdbc:mysql://localhost:3306/ EP_Practical_18_01";
	final static String username="root";
	final static String password="Root";
	public static Connection DBConnection() throws SQLException,ClassNotFoundException  {
		Class.forName(forNameUrl);
		Connection con=DriverManager.getConnection(dBURL, username, password);
		return con;
	}
}
