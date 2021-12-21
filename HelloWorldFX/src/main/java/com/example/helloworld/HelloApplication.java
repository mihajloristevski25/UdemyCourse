package com.example.helloworld;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        GridPane fxmlLoader = new GridPane();
//        fxmlLoader.setAlignment(Pos.CENTER);
//        fxmlLoader.setVgap(10);
//        fxmlLoader.setHgap(10);
//
//        Label greeting = new Label("Welcome to JavaFX!");
//        greeting.setTextFill(Color.GREEN);
//        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));
//        fxmlLoader.getChildren().add(greeting);

        stage.setTitle("Hello JavaFX!");
        stage.setScene(new Scene(fxmlLoader.load(), 1500, 240));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}