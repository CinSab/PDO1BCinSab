import java.util.Queue;

public class Persona {
   private int edad;
   private long dni;
   private String nombre;

    public Persona( String nombre,long dni, int edad){
        this.dni = dni;
        this.edad = edad;
        this.nombre = nombre;

    }
    public int getEdad(){return edad;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return dni == persona.dni;
    }

    @Override
    public String toString(){
        return dni + " " + nombre + " " + edad;
    }
}
