package com.simcore;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("Welcome to SimCore!");

        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 1000, 700);

        stage.setTitle("SimCore | Simulation Engine");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
