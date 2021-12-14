package personas;

public class Docente extends Persona{
  public Docente(String nombre, int edad, int dni){
     super(nombre, edad, dni);
   }

    @Override
    public String toString() {
        return "Docente: " + super.getNombre();
    }
}
