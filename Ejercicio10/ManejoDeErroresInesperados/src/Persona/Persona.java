package Persona;

import java.util.Objects;

public class Persona implements Comparable{
    private int edad;
    private int dni;
    private String nombre;

    public int getEdad(){
        return edad;
    }

    public Persona(int dni, String nombre, int edad){
            this.dni = dni;
            this.nombre = nombre;
            this.edad = edad;
    }

    @Override
    public String toString(){
        return"Nombre: "+nombre+" DNI: "+dni+" Edad: "+edad;
    }

    @Override
    public boolean equals(Object o) {
        Persona persona = (Persona) o;
        return dni == persona.dni;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public int compareTo(Object o) {
        Persona per = (Persona) o;
        if(dni > per.dni){
            return 1;
        }else if(dni < per.dni){
            return -1;
        }else{
            return 0;
        }
    }

}
