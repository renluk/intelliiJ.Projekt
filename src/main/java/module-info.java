module com.example.fxfuergithub {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxfuergithub to javafx.fxml;
    exports com.example.fxfuergithub;
}