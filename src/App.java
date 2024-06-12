import java.util.Stack;

import Materia.Ejercicio_01_sign.ValidarSignos;
import Materia.Ejercicio_02_sorting.Sorting;
import Materia.Ejercicio_03_linkedLists.LinkedListEjr;
import Materia.ListasEnlazadas.ListasEnlazadas;
import Materia.Models.Cola;
import Materia.Models.ColaGenerica;
import Materia.Models.Pantalla;
import Materia.Pilas.Pila;
import Materia.Pilas.PilaGenerica;

public class App {
    public static void main(String[] args) throws Exception {

        Pila pila = new Pila();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);
        
        System.out.println("Elemento en la cima de la pila es: "+pila.peek());
        System.out.println("elemento eliminado de la pila es: "+pila.pop()); 
        
        System.out.println("Elemento en la cima de la pila es: "+pila.peek());

        System.out.println();
        System.out.println("------------------------------------");



        //Implementacion de pila generica 

        PilaGenerica<Pantalla> pilaPantallas = new PilaGenerica<>();
        pilaPantallas.push(new Pantalla("Home Page", "/home/"));
        pilaPantallas.push(new Pantalla("Menu Page", "/home/menu/"));
        pilaPantallas.push(new Pantalla("Settings Page", "/home/menu/settings"));

        System.out.println("Estoy en la pantalla:\n\t -->"+pilaPantallas.peek().getNombre());
        System.out.println("Destruir pantalla\n\t -->"+pilaPantallas.pop().getNombre());
        System.out.println("Estoy en la pantalla\n\t -->"+pilaPantallas.peek().getNombre());
        pilaPantallas.push(new Pantalla("User Page", "home/menu/user"));
        System.out.println("Estoy en la pantalla:\n\t -->"+pilaPantallas.peek().getNombre());
        
        System.out.println("");
        System.out.println("------------------------------------");



        // IMPLEENTACION DE COLA 
        Cola queue = new Cola();
        //Anadir elementos a la cola 
        queue.addNode(10);
        queue.addNode(20);
        queue.addNode(30);

        //Mostrar el elmento en el frente 
        System.out.println("Elemento en el frente "+queue.peek()); //10

        //Retirar elementos de la cola
        System.out.println("Elemento retirado: "+queue.remove());//10
        System.out.println("Elemento en el frente "+queue.peek());//10

        System.out.println("Elemento retirado: "+queue.remove());//20
        System.out.println("Elemento en el frente "+queue.peek());//10

        //verificar si la cola esta vacia

        System.out.println("Cola Vacia? "+(queue.isEmpty() ? "Si" : "No"));// false

        System.out.println("");
        System.out.println("------------------------------------");


        //IMPLEMENTACION DE COLA GENERICA TIPO PANTALLA
        ColaGenerica<Pantalla> queueGeneric = new ColaGenerica<>();

        queueGeneric.addNode(new Pantalla("Home Page", "/home/"));
        queueGeneric.addNode(new Pantalla("Menu Page", "/home/menu/"));
        queueGeneric.addNode(new Pantalla("Settings", "/home/menu/settings"));
        System.out.println("La cola tiene: "+queueGeneric.size()+" Elementos");

        System.out.println("Estoy en la pantalla:\n\t -->"+queueGeneric.peek().getNombre());
        System.out.println("Pantalla destruida\n\t -->"+queueGeneric.remove().getNombre());
        System.out.println("Estoy en la pantalla\n\t -->"+queueGeneric.peek().getNombre());
        System.out.println("Pantalla destruida\n\t -->"+queueGeneric.remove().getNombre());
        System.out.println("Estoy en la pantalla\n\t -->"+queueGeneric.peek().getNombre());

        System.out.println("");
        System.out.println("------------------------------------");


        ValidarSignos validar = new ValidarSignos();
        System.out.println(validar.esValido("([]){}")); 
        System.out.println(validar.esValido("({)})"));  
        System.out.println("");
        System.out.println("------------------------------------");

        Stack<Integer> stack = new Stack<>();
        stack.push(7);
        stack.push(4);
        stack.push(1);
        stack.push(0);
        
        Sorting ordenamiento = new Sorting();
        ordenamiento.ordenar(stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop() +" ");
            
        }
        System.out.println("------------------------------------");
        
    //   stack.push(2);


        Sorting sorter = new Sorting();
        sorter.ordenar(stack);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        ListasEnlazadas lista = new ListasEnlazadas();
        lista.addNode( 1);
        lista.addNode( 4);
        lista.addNode( 3);
        lista.addNode( 6);
        System.out.println();
        lista.deleteNode( 1);
        lista.print();
        lista.deleteNode( 3);
        lista.print();
        System.out.println("------------------------------------");


        LinkedListEjr linkedList = new LinkedListEjr();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(6);

        System.out.println(linkedList.getByPos(1));


        
        










    }
}
