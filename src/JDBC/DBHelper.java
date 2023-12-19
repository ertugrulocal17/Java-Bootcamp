package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
    private static String username = "postgres";
    private static String password = "Ertugrul1215+";
    private static String DB_URL = "jdbc:postgresql://localhost/agency";

    public Connection getConnection(){
        try {
            return DriverManager.getConnection(DB_URL,username,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void showErrorMessage(SQLException sqlException){
        System.out.println("Error: " + sqlException.getMessage());
        System.out.println("Code: " + sqlException.getErrorCode());
    }
}
