package com.training.jdbc;

import java.math.BigDecimal;
import java.sql.*;

public class RowInsert  implements ConnectionDetails{
	private static final String SQL_INSERT = "INSERT INTO demo_emp VALUES (?,?,?)";

    public static void main(String[] args) throws ClassNotFoundException {

    	Class.forName("org.postgresql.Driver");  
        try (Connection conn = DriverManager.getConnection(
                url, user, password);
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT)) {

            preparedStatement.setInt(1, 4);
            preparedStatement.setString(2, "vishnu");
            preparedStatement.setBigDecimal(3, new BigDecimal(799.88));
            

            int row = preparedStatement.executeUpdate();
            
            // rows affected
            System.out.println(row); //1

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
