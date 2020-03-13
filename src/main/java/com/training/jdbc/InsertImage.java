package com.training.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertImage implements ConnectionDetails {

	public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
		Class.forName("org.postgresql.Driver");  
        Connection con = DriverManager.getConnection(
                url, user, password);
		PreparedStatement ps=con.prepareStatement("insert into IMGTABLE values(?,?)");  
		ps.setString(1,"sonoo");  
		  
		FileInputStream fin=new FileInputStream("d:\\jvm2.JPG");  
		ps.setBinaryStream(2,fin,fin.available());  
		int i=ps.executeUpdate();  
		System.out.println(i+" records affected");  
		          
		con.close();

	}

}
