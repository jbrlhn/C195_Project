package utils;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;


public class DBConnection {

    // JDBC URL parts

    private static final String protocol = "jdbc";
    private static final String vendorName = ":mysql:";
    private static final String ipAddress = "//wgudb.ucertify.com/WJ05kZj";

    // JDBC URL
    private static final String jdbcURL = protocol + vendorName + ipAddress;

    // Driver Interface reference
    private static final String MYYSQLJDBCDriver = "com.mysql.jdbc.Driver";
    private static Connection conn = null;


    private static final String username = "U05kZj";
    private static String password = "53688532765";

    public static Connection startConnection() {

        try {
            Class.forName(MYYSQLJDBCDriver);
            conn = (Connection)DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Connection successful");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch(SQLException s)
        {
            System.out.println(s.getMessage());
        }

        return conn;
    }


}