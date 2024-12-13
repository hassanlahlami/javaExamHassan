package org.example.inscriptionpage.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class InscriptionController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}