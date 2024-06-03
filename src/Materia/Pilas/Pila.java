package Materia.Pilas;

import java.util.EmptyStackException;

import Materia.Models.Node;

public class Pila {
    private Node top;

    public Pila(){
        top = null;
        
    }
//Push: Agregar elemento a la pila

    public void push(int value){
        Node nuevoNode= new Node(value);
        nuevoNode.next = top;
        top = nuevoNode;

    }    

    public int pop(){

        if (top == null) {

            System.out.println("La pila esta vacia");
            //return 0;
            throw new EmptyStackException();
            
        }else{
            int value = top.value;
            top= top.next;

            return value;
        }
    }

    public int peek(){
        if (top == null) {

            System.out.println("La pila esta vacia");
            return 0;
        }
        return top.value;
    }

    public boolean isEmpty(){

        return top == null;

    }
}
