package pl.lublin.java.lab9;

import java.sql.Connection;

public class TestMyDB {

    public static void main(String[] args) {

        MyDB db = new MyDB("localhost", 3306, "mydb");
        db.setUser("root");
        db.setPassword("Password2115");

        Connection conn = db.getConnection();

        if (conn != null){

            System.out.println("Połączenie z bazą danych nawiązane");

        }

        db.closeConnection();
        System.out.println("Połączenie z bazą zakończone");
    }

}
