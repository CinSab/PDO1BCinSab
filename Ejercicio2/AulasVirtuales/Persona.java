package personas;

public class Persona{
  protected  String nombre;
  protected  int edad;
  protected  int dni;


  //public void setNombre(String nombre){ this.nombre = nombre; }

  public Persona(String nombre, int edad, int dni){
     this.nombre = nombre;
     this.edad = edad;
     this.dni = dni;
   }
  public String getNombre(){ return nombre; }
  public int getEdad(){ return edad; }
  public int getDni(){ return dni; }

    @Override
    public String toString(){
      return nombre + " " + edad + " " +dni;
  }
}
