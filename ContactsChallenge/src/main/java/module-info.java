module com.example.contactschallenge {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens com.example.contactschallenge to javafx.fxml;
    opens datamodel;
    exports com.example.contactschallenge;
}