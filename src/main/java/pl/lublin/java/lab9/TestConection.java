package pl.lublin.java.lab9;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class TestConection {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String serverName = "localhost";
        String database = "mydb";
        Number portNumber = 3306;

        Connection conn = null;

        Properties connectionProps = new Properties();

        connectionProps.put("user", "root");
        connectionProps.put("password", "Password2115");
        connectionProps.put("serverTimezone", "Europe/Warsaw");

        conn = DriverManager.getConnection("jdbc:mysql://" + serverName + ":" + portNumber + "/" + database, connectionProps);

        System.out.println("Connected to database");





    }

}
