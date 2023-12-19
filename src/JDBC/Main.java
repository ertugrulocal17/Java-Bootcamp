package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {


    public static void main(String[] args) {
        Connection connection = null;
        DBHelper dbHelper = new DBHelper();
        connection = dbHelper.getConnection();
        // ... Already know it...
    }
}
