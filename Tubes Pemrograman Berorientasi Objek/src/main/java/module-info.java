module com.example.tsssss {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tsssss to javafx.fxml;
    exports com.example.tsssss;
}