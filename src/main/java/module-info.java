module com.company.freightroutingnn {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.company.freightroutingnn to javafx.fxml;
    exports com.company.freightroutingnn;
}