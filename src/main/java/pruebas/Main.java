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
import java.util.Iterator;
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
        lista.addLast("4");
        lista.addLast("5");



        Iterator<String> it = lista.iterator();
        
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    
    }

}
