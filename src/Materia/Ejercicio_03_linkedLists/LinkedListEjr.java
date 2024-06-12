package Materia.Ejercicio_03_linkedLists;

public class LinkedListEjr {
    private static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Constructor para inicializar la lista vacía
    public LinkedListEjr() {
        this.head = null;
    }

    // Método para agregar elementos a la lista
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public int getByPos(int posicion) {

        // Verificar si la lista está vacía o la posición es negativa
        if (head == null || posicion < 0) {
            return -1; 
        }
    
        Node primerPuntero = head;
        Node segundoPuntero = head;
    
        // Mover el primer puntero 'posicion' nodos adelante
        for (int i = 0; i < posicion; i++) {
            if (primerPuntero == null) {
                return -1; // no existe posicion
            }
            primerPuntero = primerPuntero.next;
        }
    
        while (primerPuntero != null && primerPuntero.next != null) {
            primerPuntero = primerPuntero.next;
            segundoPuntero = segundoPuntero.next;
        }
    
        // Si el primer puntero es null, significa que la posición era  el tamaño de la lista
        if (primerPuntero == null) {
            return -1; // Posición no existe
        }
    
        return segundoPuntero.data;
    }
    
}
