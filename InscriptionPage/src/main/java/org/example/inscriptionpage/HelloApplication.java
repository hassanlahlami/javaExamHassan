package org.example.inscriptionpage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Charge le fichier FXML
            Parent root = FXMLLoader.load(getClass().getResource("/hotel-dashboard.fxml"));

            // Crée la scène
            Scene scene = new Scene(root, 1200, 800);

            // Configure la fenêtre principale
            primaryStage.setTitle("Hotel Dashboard");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}