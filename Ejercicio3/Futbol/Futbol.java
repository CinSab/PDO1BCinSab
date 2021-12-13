public class Futbolista { //Futbolista jeje
   private String name;
   private String equipo;
   private int cantGoles;

   public Futbolista(String name, String equipo) {
       this.name = name;
       this.equipo = equipo;
   }

   public int getCantGoles() {return cantGoles;}
   public String getEquipo() {return equipo;}
   public String getName() {return name;}

   public void anotarGol() {this.cantGoles++;}


   public static void maxGoleador(Futbolista[] futbolista) {
       int mayor = 0;
       for(int i = 0; i < futbolista.length; i++) {
           if(futbolista[i].getCantGoles() > mayor){
               mayor = futbolista[i].getCantGoles();
           }
       }
       for(int i = 0; i < futbolista.length; i++) {
           if(futbolista[i].getCantGoles() == mayor){
               System.out.println("El que mejor va es: "  + futbolista[i].getName()+ " Con " + futbolista[i].getCantGoles() + " goles.");
           }
       }
   }
}
