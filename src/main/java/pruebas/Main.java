/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

import TDASimplement.DCLList;

import com.mycompany.emojimaker.EmojiLienzoController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import javafx.scene.image.Image;

/**
 *
 * @author noeli
 */
public class Main {
    
    
    public static void main(String[] args) throws MalformedURLException, FileNotFoundException {
        DCLList<String> lista = new DCLList();
        lista.addLast("1");
        lista.addLast("2");
        lista.addLast("3");
        System.out.println(lista.size());
        
        /*
        PRUEBA DE CARGAR IMAGENES DEL DIRECTORIO 
        */
        
        File directorio = new File("C:\\Users\\melis\\Downloads\\Proyecto_PrimeraEvaluacion_EstructurasDeDatos_PAO1_2023\\images\\mouth");
        ArrayList<File> imagenes = cargar(directorio);
        System.out.println("hol");
        //esas files pasarla a image
        
        for(File file: imagenes){
            
            System.out.println(crearImagen(file));
            //pasar a imagen
        }

    
    }
    public static ArrayList<File> cargar(File directorio){
        
        File[] arregloImagenes = directorio.listFiles();
        
        ArrayList<File> imagenes = new ArrayList<>();
        
        for(File foto: arregloImagenes){
            imagenes.add(foto);
        }
        
        return imagenes;
     }
    
    public static Image crearImagen(File img) throws FileNotFoundException{

        Image image = new Image(new FileInputStream(img));  
        return image;
    }
}
