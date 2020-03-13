package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultSetMetaDataEx implements ConnectionDetails{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("org.postgresql.Driver");  
        Connection con = DriverManager.getConnection(
                url, user, password);
		PreparedStatement ps=con.prepareStatement("select * from demo_emp");  
		ResultSet rs=ps.executeQuery();  
		ResultSetMetaData rsmd=rs.getMetaData();  
		  
		System.out.println("Total columns: "+rsmd.getColumnCount());  
		System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
		System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));
		System.out.println("Column Name of 2st column: "+rsmd.getColumnName(2));  
		System.out.println("Column Type Name of 2st column: "+rsmd.getColumnTypeName(2));
		System.out.println("Column Name of 2st column: "+rsmd.getColumnName(3));  
		System.out.println("Column Type Name of 2st column: "+rsmd.getColumnTypeName(3));

	}

}
