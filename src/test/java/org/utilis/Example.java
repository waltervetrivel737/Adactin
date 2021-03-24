package org.utilis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Example {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	
	
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "4609");

		String s = "select* from employees";
		PreparedStatement p = con.prepareStatement(s);
		ResultSet rs = p.executeQuery();

		ResultSetMetaData md = rs.getMetaData();
		int cc = md.getColumnCount();

		while (rs.next()) {
			
			for (int i = 1; i < cc; i++) {
				rs.getString(i);
				System.out.println(i);
			}

		}

	}

}
