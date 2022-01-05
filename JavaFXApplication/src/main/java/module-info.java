module com.example.javafxapplication {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;


    opens com.example.javafxapplication to javafx.fxml;
    exports com.example.javafxapplication;
}