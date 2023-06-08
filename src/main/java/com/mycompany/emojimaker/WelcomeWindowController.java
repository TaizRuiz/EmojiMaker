package com.mycompany.emojimaker;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class WelcomeWindowController {

    @FXML
    private VBox panelWelcome;
    @FXML
    private Label welcomeLabel;
    @FXML
    private Button welcomeButton;

    public void initialize(URL url, ResourceBundle rb) {
       
    }  

    @FXML
    private void imprimir(ActionEvent event) throws IOException {
        App.setRoot("galleryWindow");
    }
   
    
}
