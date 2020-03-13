package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExample implements ConnectionDetails {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("org.postgresql.Driver");  
        Connection con = DriverManager.getConnection(
                url, user, password);
       Statement stmt=con.createStatement();  
		  
       //int result=stmt.executeUpdate("insert into demo_emp values(3,'Irfan',50000)");  
	// int result=stmt.executeUpdate("update demo_emp set salary=10000 where id=3 ");  
		//int result=stmt.executeUpdate("delete from demo_emp where id=3");  
		//System.out.println(result+" records affected");  
       
       ResultSet rs=stmt.executeQuery("select * from demo_emp");  
       while(rs.next()){
    	   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
    	 //  System.out.println(rs.getString(1));
       }
		con.close();  
	}

}
