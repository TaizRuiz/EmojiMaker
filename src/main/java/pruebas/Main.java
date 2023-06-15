/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

import TDASimplement.DCLList;

/**
 *
 * @author noeli
 */
public class Main {
    public static void main(String[] args) {
        DCLList<String> lista = new DCLList();
        
        lista.addLast("primero");
        lista.addLast("segundo");
        lista.addLast("tercero");
        lista.addLast("cuarto");
        lista.addLast("quinto");
        
        System.out.println(lista);
        
        
        lista.remove("tercero");
        System.out.println(lista);
        
        
        
    }
}
