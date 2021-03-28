package org.utilis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Example extends BaseClass {

	static String value;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	String db = toDataBase("select first_name from employees where first_name='David'", 1);
	System.out.println(db);
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "4609");
	
	String s= "select akid from school ";
	PreparedStatement p = con.prepareStatement(s);
	ResultSet rs = p.executeQuery();
	
	ResultSetMetaData md = rs.getMetaData();
	int cc = md.getColumnCount();
	boolean a=true;
	while (rs.next()) {
		
		String v1 = rs.getString(1);
		System.out.println("without"+v1);
		if (a=true) {
			value = rs.getString(1);
			System.out.println("if");
		}
		else {
			for (int i = 0; i < cc; i++) {
				System.out.println("else");
				value = rs.getString(i);
				
			}
		}
		System.out.println(value);
	}
	}

	
}
