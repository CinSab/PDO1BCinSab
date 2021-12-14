package personas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("==================++++++++++++++++===============+++++++++++++++++==========");

            System.out.println("Ingrese la cantidad de alumnos que se anotaron: ");
            int cantAlumnos = in.nextInt();

            Docente bodoque = new Docente("Juan Carlos Bodoque", 34, 124543);
            List<Alumno> alumnos = new ArrayList<>();

            Materia materia1 = new Materia("Paradigmas", bodoque);
            materia1.setListaAlumnos(alumnos);
            materia1.agregarAlumno(cantAlumnos);
            materia1.datosMateria();
            System.out.println(materia1.listaCompleta());
        }
    }
