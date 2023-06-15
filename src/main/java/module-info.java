module pl.lublin.java.lab9 {
    requires javafx.controls;
    requires javafx.fxml;
    requires mysql.connector.j;
    requires java.sql;


    opens pl.lublin.java.lab9 to javafx.fxml;
    exports pl.lublin.java.lab9;
}