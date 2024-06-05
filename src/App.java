import Materia.Models.Cola;
import Materia.Models.ColaGenerica;
import Materia.Models.Pantalla;
import Materia.Pilas.Pila;
import Materia.Pilas.PilaGenerica;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        Pila pila = new Pila();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);
        
        System.out.println("Elemento en la cima de la pila es: "+pila.peek());
        System.out.println("elemento eliminado de la pila es: "+pila.pop()); 
        
        System.out.println("Elemento en la cima de la pila es: "+pila.peek());

        System.out.println();


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

        //IMPLEMENTACION DE COLA GENERICA TIPO PANTALLA
        ColaGenerica<Pantalla> queueGeneric = new ColaGenerica<>();

        queueGeneric.addNode(new Pantalla("Home Page", "/home/"));
        queueGeneric.addNode(new Pantalla("Menu Page", "/home/menu/"));
        queueGeneric.addNode(new Pantalla("Settings", "/home/menu/settings"));
        System.out.println("La cola tiene: "+queueGeneric.size()+"Elementos");

        System.out.println("Estoy en la pantalla:\n\t -->"+queueGeneric.peek().getNombre());
        System.out.println("Pantalla destruida\n\t -->"+queueGeneric.remove().getNombre());
        System.out.println("Estoy en la pantalla\n\t -->"+queueGeneric.peek().getNombre());
        System.out.println("Pantalla destruida\n\t -->"+queueGeneric.remove().getNombre());
        System.out.println("Estoy en la pantalla\n\t -->"+queueGeneric.peek().getNombre());










    }
}
