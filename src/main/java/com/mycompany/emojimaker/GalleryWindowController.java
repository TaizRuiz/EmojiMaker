/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.emojimaker;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USUARIO
 */
public class GalleryWindowController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private VBox contenedorBotones;
    @FXML
    private Button addEmoji;
    @FXML
    private ScrollPane contenedorEmojis;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    

    @FXML
    private void newEmoji(ActionEvent event) {
        System.out.println("Proyecto");
    }
    
}
