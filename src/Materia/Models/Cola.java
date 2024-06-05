package Materia.Models;

import java.util.NoSuchElementException;

public class Cola {
    private Node first;
    private Node last;

    public Cola(){
        this.first = null;
        this.last = null;
    }


    //metodo agregar un nodo a la cola 
    public void addNode (int valor){
        Node nuevoNodo = new Node(valor);
        if (isEmpty()) {
            first = nuevoNodo;
            last = nuevoNodo;

            
        }else{
            last.next = nuevoNodo;
            last = nuevoNodo;
        }

    }

    //metodo para eliminar
    public int remove(){
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");
        }
        int value = first.value;
        first = first.next;
        if (first == null) {
            last = null;

        }   
        return value;     
    }
    
    //metodo para sacar primero de la cola 
    public int peek(){
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");
        }
        return first.value;
    }

    public boolean isEmpty(){
        return first == null;
    }

}
