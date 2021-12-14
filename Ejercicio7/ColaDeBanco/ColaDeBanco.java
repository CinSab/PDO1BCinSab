import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;

public class ColaDeBanco{

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


    public Persona atender(){
      return colaDePersonas.poll();
    }

}
