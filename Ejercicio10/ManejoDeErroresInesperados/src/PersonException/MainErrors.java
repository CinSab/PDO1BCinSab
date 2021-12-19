package PersonException;
import Persona.Persona;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.sort;

public class MainErrors extends PersonaException{
    List<Persona> personaList = new ArrayList<>();

    public void verLista(){
        Collections.sort(personaList);
        for(Persona p : personaList){
           System.out.println(p);
        }
    }

    public static Persona crearPersona(int dni, String nombre, int edad) throws Exception{
        if(dni <= 0 || edad <=  0){
            throw new IllegalArgumentException("ingresaste caca y rompiste el codigo");
        }else if(nombre == null){
            throw  new IllegalArgumentException("ingresaste caca y rompiste el codigo");
        }else{
            return new Persona(dni, nombre, edad);
        }
    }

    public void agregarPersona(Persona person) throws Exception{
        if(personaList.contains(person)){
           // System.out.println(person.toString() + " ya existe");
            throw new PersonaYaExisteException(person.toString() + " Ya existe");
        }else if(person.getEdad() < 18){
           // System.out.println(person.getEdad() + " es menor");
            throw new PersonaMenorException(person.getEdad() + " es menor");
        }else{
            personaList.add(person);
        }
    }
}
