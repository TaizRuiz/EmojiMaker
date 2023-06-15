/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.emojimaker;

import Classes.Emoji;
import Classes.Proyecto;
import TDASimplement.ArrayList;
import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;
import java.util.Set;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
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
   public static ArrayList<Proyecto>userProyects=App.usuarioSeleccionado.getProyectos();
   public static Proyecto proyectoSeleccionado=null;
    @FXML
    private VBox contenedorBotones;
    @FXML
    private Button addEmoji;
    @FXML
    private ScrollPane contenedorEmojis;
    @FXML
    private FlowPane contenedorProy;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.contenedorProy=new FlowPane();
        llenarContenedor();
    }    
    

    @FXML
    private void newEmoji(ActionEvent event) {
        try {
            FXMLLoader loader=new FXMLLoader(getClass().getResource("EmojiLienzo.fxml"));
            Parent p= loader.load();
            EmojiLienzoController controller=loader.getController();
            Scene s=new Scene(p,700,600);
            Stage st=new Stage();
           
            st.setScene(s);
            
            st.showAndWait();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

   
  

    public void llenarContenedor(){
       
        //deberia recorrer la lista de proyectos del usuario seleccionado y mostrarlos 
        //Al dar click a proyecto seleccionado deberia abrrse el controller del lienzo y editar ESE proyecto 

        }
     
    }

    

