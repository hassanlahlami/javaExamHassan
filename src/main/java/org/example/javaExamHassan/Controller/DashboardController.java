package org.example.javaExamHassan.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.example.javaExamHassan.DAO.MembreDAO;
import org.example.javaExamHassan.DAO.MembreDAOImpl;
import org.example.javaExamHassan.Model.Membre;

import java.sql.SQLException;

public class DashboardController {
    @FXML
    private TextField Email;

    @FXML
    private Button Inserer;

    @FXML
    private TextField Nom;

    @FXML
    private TextField Phone;

    @FXML
    private TextField Prenom;
    @FXML
    void OnClickInserer() throws SQLException, ClassNotFoundException {
        if(Email.getText().equals("") || Nom.getText().equals("") || Phone.getText().equals("") || Prenom.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the fields");
            alert.showAndWait();

        }
        else {
            boolean test=true;
            String errorlog=new String();
            if(!Nom.getText().matches("[a-zA-Z]+")){
                errorlog=errorlog+"\nNom invalid";
                test=false;
            }
            if(!Prenom.getText().matches("[a-zA-Z]+")){
                errorlog=errorlog+"\nPrenom invalid";
                test=false;
            }
            if(!Phone.getText().matches("[0-9]+")){
                errorlog=errorlog+"\nPhone invalid";
                test=false;
            }
            if(!Email.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,10}$")){
                errorlog=errorlog+"\nEmail invalid";
                test=false;
            }
            if(!test){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText(errorlog);
                alert.showAndWait();
            }
            else {
                MembreDAO m=new MembreDAOImpl();
                String identifiant= Integer.toString((Integer.parseInt(m.getLastMemberId()) + 1));
                Membre membre=new Membre(identifiant,Nom.getText(),Prenom.getText(),Email.getText(),Phone.getText());
                m.inserer(membre);
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Success");
                alert.setHeaderText(null);
                alert.setContentText("Membre inserted successfully");
                alert.showAndWait();
                Nom.setText("");
                Phone.setText("");
                Email.setText("");
                Prenom.setText("");
            }


        }
    }
}