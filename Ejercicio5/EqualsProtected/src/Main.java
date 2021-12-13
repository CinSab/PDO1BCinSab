import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList();

        System.out.println("Ingrese cuantas personas queres anotar: ");
        int cantP = in.nextInt();

        personas.add(new Persona("cin",true,1234));
        personas.add(new Persona("camila",true,1234));
        personas.add(new Persona("camila",true,1234));
        personas.add(new Persona("camila",true,1234));
        personas.add(new Persona("camila",true,1234));
        personas.add(new Persona("camila",true,1234));
        personas.add(new Persona("camila",false,1234));

        /*for(int i = 0 ; i < cantP; i++){
            in.nextLine();
            System.out.println("Ingrese Nombre: ");
            String nom = in.nextLine();
            System.out.println("Ingrese DNI: ");
            int dni = in.nextInt();
            System.out.println("Ingrese sexo: (true = Femenino / false = Masculino)");
            boolean sex = in.nextBoolean();

            Persona newP = new Persona(nom,sex,dni);
            personas.add(newP);
        }*/

        for(int i = 0; i < (personas.size()-1); i++){
            System.out.println(personas.get(i).equals(personas.get(i+1)));
             if(personas.get(i).equals(personas.get(i+1)))
                System.out.println(personas.get(i) + " y " +personas.get(i+1) + " comparten sexo y dni");
        }
        for(int i = 0; i < personas.size(); i++){
                System.out.println(personas.get(i));
        }
      /*  Persona cd1 = new Persona();
        cd1.setSexo(true);
        cd1.setDni(123123131);
        cd1.setNombre("Carlos");

        Persona cd2 = new Persona();
        cd2.setSexo(true);
        cd2.setDni(123123131);
        cd2.setNombre("Pepe");

        Persona cd3 = new Persona();
        cd3.setSexo(true);
        cd3.setDni(124131);
        cd3.setNombre("Cadfss");

        Persona cd4 = new Persona();
        cd4.setSexo(true);
        cd4.setDni(123123131);
        cd4.setNombre("Cddlos");

        System.out.println(cd2.equals(cd1));
        System.out.println(cd3.equals(cd4));*/
    }
}
