import PersonException.*;
import Persona.Persona;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        List<Integer> liiii = new ArrayList<>();
        liiii.add(5);
        liiii.add(6);
        liiii.add(7);
        liiii.add(10);
       // System.out.println(listaFeliz(liiii));


        MainErrors listita = new MainErrors();
    try{
        //MainErrors.crearPersona(-3, "hola", 32424);
        listita.agregarPersona(MainErrors.crearPersona(55, "hola", 18));
        listita.agregarPersona(MainErrors.crearPersona(585, "hola", 18));
        listita.agregarPersona(MainErrors.crearPersona(575, "hola", 18));
        //listita.agregarPersona(MainErrors.crearPersona(55, "hola", 18));
        //  listita.agregarPersona(MainErrors.crearPersona(55, "hola", 16));
        listita.verLista();
    }catch (Exception e){
        System.out.println(e.getMessage());
    }

       /* Manejo de casos inesperados

 Realizar una función que tome una lista de números positivos y devuelva el primer elemento mayor a 10.
 ¿Cómo manejaría el caso que no haya números mayores a 10?
Realizar una función que tome un nombre, una edad, y un numero de DNI y devuelva un objeto Persona.
Cómo manejaría el caso en que los valores sean incorrectos?
(Por ejemplo nombre null o “”, edad negativa, DNI <= 0)
*/

    }
    public static Integer listaFeliz(List<Integer> lista) throws Exception {
        int res = -1;
        for (int i : lista) {
            if (i > 10 && (res == -1)) {
                res = i;
            }
        }
        if (res == -1)
            throw new InputMismatchException("No existen nums mayores a 10");
        return res;

    }
}
