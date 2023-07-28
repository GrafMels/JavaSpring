module com.example.ex001 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.exFirst to javafx.fxml;
    exports com.example.exFirst;
}