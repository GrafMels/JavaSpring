module com.dmdev.spring {
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.context;


    opens com.dmdev.spring.service to javafx.fxml;
    exports com.dmdev.spring.service;
}