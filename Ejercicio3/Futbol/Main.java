
import java.util.Scanner;

public class Main {
       public static void main(String[] args){

           Scanner in = new Scanner(System.in);

           Futbolista[] futbolistas = newFutbolista[3];

           for(int i = 0; i < futbolistas.length; i++){
               System.out.println("Ingresa Nombre del futbolista: ");
               String name = in.nextLine();
               System.out.println("Ingresa Equipo del futbolista: ");
               String team = in.nextLine();

               futbolistas[i] = new Futbolista(name, team);

           }
           for(int i = 0; i < 3; i++) {
               futbolistas[0].anotarGol();
           }

           for(int i = 0; i < 5; i++) {
               futbolistas[1].anotarGol();
           }

           Futbolista.maxGoleador(futbolistas);

           for(int i = 0; i < 6; i++) {
               futbolistas[2].anotarGol();
           }

           Futbolista.maxGoleador(futbolistas);
       }
}
