/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDASimplement;

/**
 *
 * @author USUARIO
 * @param <E>
 */
public class DCLList<E> implements List<E>{
    
    private NodeDCLL<E> last;
    
    public DCLList(){
        last = null;
    }

    @Override
    public boolean addLast(E element) {
        
        // hola
        
        return true;
    }
    

    @Override
    public int size() {
        //contador
        int contador = 0;
        
        //si esta vacio
        if(last == null){
            return contador;
        }
        
        //caso general
        NodeDCLL<E> nodoViajero = last;
        contador ++;
        
        //aqui va un equals en la condicion o puede ser nodoViajero != last ???
        for(nodoViajero = nodoViajero.getNext(); !nodoViajero.equals(last); nodoViajero = nodoViajero.getNext()){
            contador ++;
        }
        
        return contador;
    }

    @Override
    public E get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean remove(E element) {
        
        //tendriamos que ir iterando uno a uno e ir comparando
        NodeDCLL<E> nodo = new NodeDCLL<>(element);
        
        NodeDCLL<E> nodoViajero = last;
        
        //ver el size e ir iterando
        for(int i = 0;i < size() ;i++){
            
            //va pasando cada elemento a ver si es igual y se remueve
            if(nodoViajero.equals(nodo)){
                //setea el siguiente del anterior
                nodoViajero.getPrevious().setNext(nodoViajero.getNext());
                //setea el anterior del siguiente
                nodoViajero.getNext().setPrevious(nodoViajero.getPrevious());
                
                //en caso de que sea el ultimo
                if(nodoViajero.equals(last)){
                    last = nodoViajero.getPrevious();
                }
               
                return true;
            }
            
            nodoViajero = nodoViajero.getNext();
        }
        return false;
    }
    
}
