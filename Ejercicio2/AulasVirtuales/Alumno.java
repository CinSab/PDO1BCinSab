package personas;

public class Alumno extends Persona{
  private int codigoEstudiante;
  private float notaFinal;

 public Alumno(String nombre, int edad, int dni){
    super(nombre, edad, dni);
  }

    @Override
    public String toString(){
     return "Alumno: " + nombre  + " Edad: " + edad + " DNI " + dni;
    }

}
