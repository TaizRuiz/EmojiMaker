/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDASimplement;

/**
 *
 * @author USUARIO
 */
public class DCLList<E> implements List<E>{
    
    private NodeDCLL<E> last;
    
    public DCLList(){
        last = null;
    }

    @Override
    public boolean addLast(E element) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public E get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean remove(E element) {
        //deberia existir
        //tendriamos que ir iterando uno a uno e ir comparando
        NodeDCLL<E> nodo = new NodeDCLL<>(element);
        
        NodeDCLL<E> nodoViajero = last;
        
        //ver el size y ahi ir iterando
        for(int i = 0;i < size() ;i++){
            
            //va pasando cada elemento a ver si es igual y se remueve
            if(nodoViajero.equals(nodo)){
                //setea el siguiente del anterior
                nodo.getPrevious().setNext(nodo.getNext());
                //setea el anterior del siguiente
                nodo.getNext().setPrevious(nodo.getPrevious());
                return true;
            }
            
            nodoViajero = nodoViajero.getNext();
        }
        return false;
    }
    
}
