/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDASimplement;

/**
 *
 * @author melis
 */
class NodeDCLL<E> {
    
    E content;
    NodeDCLL<E> previous;
    NodeDCLL<E> next;
    
    public NodeDCLL(E content){
        this.content = content;
        previous = null;
        next = null;
    }

    public E getContent() {
        return content;
    }

    public void setContent(E content) {
        this.content = content;
    }

    public NodeDCLL<E> getPrevious() {
        return previous;
    }

    public void setPrevious(NodeDCLL<E> previous) {
        this.previous = previous;
    }

    public NodeDCLL<E> getNext() {
        return next;
    }

    public void setNext(NodeDCLL<E> next) {
        this.next = next;
    }
    
    
}
