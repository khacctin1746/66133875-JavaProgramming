module com.khacctin.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.khacctin.javafxdemo to javafx.fxml;
    exports com.khacctin.javafxdemo;
}