import java.util.Deque;
import java.util.LinkedList;
//import java.util.Queue;
import java.util.Random;

public class ColaDeBanco{
    /*
   Cola del banco
Hacer una clase ColaDelBanco que representa una cola del banco y tiene una Queue usando LinkedList.

Crear una clase Persona con dni, nombre, edad. Si dos personas tiene el mismo dni, es la misma persona.

Debe tener los siguientes métodos:
 - toString() muestra todas las personas en la cola
 - agregar(persona) que si la persona no está en la cola, la agrega.
 - atender(persona) que devuelve la persona de la cabecera de la cola y la elimina de la cola

Luego, queremos que las personas mayores de 60 tengan prioridad para ser atendidas.
Modificar la clase para usar Deque y que el metodo agregar, agregue las personas mayores de 60 al principio de la cola.
     */
  // public Queue<Persona> colaDePersonas = new LinkedList<>();
    public Deque<Persona> colaDePersonas = new LinkedList<>();

    public void agregar(Persona persona) {
        if (colaDePersonas.isEmpty()) {
            colaDePersonas.add(persona);
            System.out.println("Se suma la primera persona a la cola");
        } else if (!colaDePersonas.contains(persona)) {
            if (persona.getEdad() >= 60){
                colaDePersonas.addFirst(persona);
                System.out.println("Se suma persona mayor a la cola");
            }else {
                colaDePersonas.add(persona);
                System.out.println("Se suma persona a la cola");
            }
        }else{
            System.out.println("Esta en la cola");
        }
    }

    public void generadorDePersonas(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Random numGenerator = new Random();
            numGenerator.ints();
            int Num = (int)(Math.random() * 100);
            int dni = (int)(Math.random() * 1000);
            //  System.out.println(" Persona " + i);
            String name = ("nombreGenerico" + Num);
            //System.out.print("Nombre: " + matricula);
            //int marca = 40404040 + numGenerator2;
            //  System.out.print(" DNI: " + marca);
           // int modelo = 1 + numGenerator3;
            // System.out.print(" Edad: " +modelo);
            Num = (int)(Math.random() * 100); // edad
            //Persona aux = new Persona(matricula, marca, modelo);
            Persona aux = new Persona(name, dni, Num);

            this.agregar(aux);
        }
    }

    public void atender(){
       System.out.println(colaDePersonas.element());
        colaDePersonas.remove();
    }

}
