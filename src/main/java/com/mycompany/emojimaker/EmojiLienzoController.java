/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.emojimaker;

import Classes.Emoji;
import TDASimplement.DCLList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ScrollPane;

/**
 * FXML Controller class
 *
 * @author USUARIO
 */

public class EmojiLienzoController implements Initializable {
    @FXML 
    
    private HBox conBtn_Menu;
    @FXML
    private Button btnPrev;
    @FXML
    private Button btnNext;
    @FXML
    private ComboBox comboBoxOpciones;
    @FXML
    private ScrollPane scrollPaneFeatures;
    @FXML
    private VBox contenedorBotones;
    @FXML
    private Button btnGuardar;
    @FXML
    private VBox lienzo;
    @FXML
    private AnchorPane emojiBlock;
    @FXML
    private ImageView emojiFace;
    @FXML
    private ImageView emojiBrows;
    @FXML
    private ImageView emojiEyes;
    @FXML
    private ImageView emojiMouth;
    @FXML
    private VBox featuresListContainers;
    @FXML
    private AnchorPane panelPrincipal;
    @FXML
    private HBox contenedorBotonesYLienzo;
    @FXML
    private Button btnExportar;
    @FXML
    private AnchorPane contenedorScroll;
    private DCLList<ImageView> ojos;
    private DCLList<ImageView> bocas;
    private DCLList<ImageView> caras;
    private DCLList<ImageView> cejas;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      ojos=new DCLList<>();
      bocas=new DCLList<>();
      caras=new DCLList<>();
      cejas=new DCLList<>();
        ImagePathsToTxt("eyes");
        ImagePathsToTxt("accessories");
        ImagePathsToTxt("faces");
        ImagePathsToTxt("mouth");
        ImagePathsToTxt("eyebrows");
        llenarLists();
        System.out.println(ojos.size());
        
        
      
    }
    //metodo que llena los double linkedlist
    public void llenarLists(){
        try(BufferedReader br=new BufferedReader(new FileReader("src\\main\\java\\imagenes\\eyes.txt")) ){
            String linea;
            while ((linea=br.readLine())!=null){
         
            Image img=new Image(linea);
            ImageView iv=new ImageView(img);
            this.ojos.addLast(iv); 
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try(BufferedReader br=new BufferedReader(new FileReader("src\\main\\java\\imagenes\\eyebrows.txt")) ){
            String linea;
            while ((linea=br.readLine())!=null){
         
            Image img=new Image(linea);
            ImageView iv=new ImageView(img);
            this.cejas.addLast(iv); 
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try(BufferedReader br=new BufferedReader(new FileReader("src\\main\\java\\imagenes\\mouth.txt")) ){
            String linea;
            while ((linea=br.readLine())!=null){
         
            Image img=new Image(linea);
            ImageView iv=new ImageView(img);
            this.bocas.addLast(iv); 
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try(BufferedReader br=new BufferedReader(new FileReader("src\\main\\java\\imagenes\\faces.txt")) ){
            String linea;
            while ((linea=br.readLine())!=null){
         
            Image img=new Image(linea);
            ImageView iv=new ImageView(img);
            this.caras.addLast(iv); 
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("se llenaron");
    }
    //metodo que escribe archivos de texto con todas las rutas de las imagenes 
    public void ImagePathsToTxt(String folderName) {
   
        String folderPath = "src\\main\\java\\imagenes\\"+folderName; // Specify the path to the folder
        String outputPath = "src\\main\\java\\imagenes\\"+folderName+".txt"; // Specify the path for the output text file

        try {
            // Create a Path object representing the folder
            Path folder = Paths.get(folderPath);

            // Create a BufferedWriter to write to the output text file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));

            // Iterate over the files in the folder
            Files.walk(folder)
                    .filter(Files::isRegularFile) // Only include regular files, excluding directories
                    .forEach(file -> {
                        try {
                            writer.write(file.toString()); // Write the file path to the text file
                            writer.newLine(); // Move to the next line
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });

            writer.close(); // Close the writer

            System.out.println("Image paths written to " + outputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }  
    //metodo que convierte el contenedor del emoji en imagen
   public static Image convertAnchorPaneToImage(AnchorPane anchorPane) {
    WritableImage snapshot = anchorPane.snapshot(new SnapshotParameters(), null);
    BufferedImage bufferedImage = SwingFXUtils.fromFXImage(snapshot, null);
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    try {
        ImageIO.write(bufferedImage, "png", outputStream);
        byte[] imageData = outputStream.toByteArray();
        ByteArrayInputStream inputStream = new ByteArrayInputStream(imageData);
    return new Image(inputStream);
    } catch (IOException e) {
        e.printStackTrace();
    }
    return null;
}

    public ImageView getEmojiFace() {
        return emojiFace;
    }

    public void setEmojiFace(ImageView emojiFace) {
        this.emojiFace = emojiFace;
    }

    public ImageView getEmojiBrows() {
        return emojiBrows;
    }

    public void setEmojiBrows(ImageView emojiBrows) {
        this.emojiBrows = emojiBrows;
    }

    public ImageView getEmojiEyes() {
        return emojiEyes;
    }

    public void setEmojiEyes(ImageView emojiEyes) {
        this.emojiEyes = emojiEyes;
    }

    public ImageView getEmojiMouth() {
        return emojiMouth;
    }

    public void setEmojiMouth(ImageView emojiMouth) {
        this.emojiMouth = emojiMouth;
    }

   
   
}
