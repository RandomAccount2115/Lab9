package pl.lublin.java.lab9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyDB {

    private String address;
    private Number port;
    private String databaseName;

    private String user;
    private String password;

    private Connection conn;

    MyDB(String address, Number port, String databaseName){

        this.address = address;
        this.port = port;
        this.databaseName = databaseName;

    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password){
        this.password = password;
    }

    private void connect(){

        Properties connectionProps = new Properties();
        connectionProps.put("user", user);
        connectionProps.put("password", password);
        connectionProps.put("serverTimezone", "Europe/Warsaw");

        String jdbcString = "jdbc:mysql://" + address + ":" + port + "/" + databaseName;

        try {
            conn = DriverManager.getConnection(jdbcString, connectionProps);
        }
        catch (SQLException e){
            System.out.println("Błąd połączenia z bazą" + jdbcString);
            System.out.println("Komunikat błędu:" + e.getMessage());
            conn = null;
        }

        System.out.println("Conected to database " + databaseName);



    }

    public Connection getConnection(){

        if (conn == null){
            connect();
        }

        return conn;

    }

    public void closeConnection(){

        if (conn != null){

            try{
                conn.close();
            }
            catch (SQLException e){
                System.out.println("Błąd przy zamykaniu połączenia" + e.getMessage());
            }
            conn = null;
        }

    }
}
