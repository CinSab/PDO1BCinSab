package personas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Materia{
    private String nombre;
    private List<Alumno> listaAlumnos;
    private Docente docente;

    public Materia(String nombre){ this.nombre = nombre; }
    public Materia(String nombre, Docente docente){ this(nombre); this.docente = docente; System.out.println("holo"); }
    public String getNombre(){ return nombre; }
    public Docente getDocente(){ return docente; }
    public void setDocente(Docente docente){ this.docente = docente;}
    public void setListaAlumnos(List<Alumno> alumnos){ this.listaAlumnos = alumnos;}
    public List<Alumno> getListaAlumnos(){ return this.listaAlumnos;}

 public void datosMateria() {
         System.out.println("Materia: " + this.getNombre() + " \nDocente: " + docente.getNombre());
         System.out.println("Alumnos: ");
         for (Persona persona : listaAlumnos) {
             System.out.println(persona.toString());
         }
    }
    public List<Persona> listaCompleta(){
        List<Persona> todys = new ArrayList<>();
        todys.add(docente);
        for (int i = 0; i<listaAlumnos.size(); i++) {
            todys.add(listaAlumnos.get(i));
        }
        return todys;
    }
     public void agregarAlumno(int cantAlumnos, List<Alumno> alumnos){
            for (int i = 0; i < cantAlumnos; i++) {
                Random numGenerator = new Random();
                numGenerator.ints();
                int Num = (int)(Math.random() * 100);
                int dni = (int)(Math.random() * 1000);
                String name = ("nombreGenerico" + Num);
                Num = (int)(Math.random() * 100); // edad
                Alumno aux = new Alumno(name, Num, dni);

                alumnos.add(aux);
            }
        }

}
