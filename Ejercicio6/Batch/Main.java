import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        /*Tareas

Crear la interfaz Tarea con un método ejecutar() y un método getNombre().
Crear una función procesarBatch(tareas) que toma una lista de tareas y las ejecuta,
 antes imprimiendo el nombre de la tarea a ejecutar.
Crear varias clases que implementan Tarea :
Una clase que se cree con un string y al ejecutarse imprima el string
Varias clases que se creen con una lista y ejecute operaciones sobre el array (inline).
Una clase que modifique alguna variable global

Ejecutar las tareas y verificar que hicieron lo que se espera.
*/
        String hola = "HolaMundo";
        ArrayList<Tarea> tareas = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        List<String> arrr = new ArrayList<>();
        arrr.add("arrr");
        arrr.add("arrrr");

        tareas.add(new TareaVariableGlobal("Globo?"));
        tareas.add(new TareitaUno("tareita1","Tareita"));
        tareas.add(new TareaConLista("Lista Numeeross",nums));
        tareas.add(new TareaDeLists2("Array",arrr));


        Proceso.procesarBatch(tareas);



    }
}

