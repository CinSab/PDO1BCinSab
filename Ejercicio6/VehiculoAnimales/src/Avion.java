public class Avion extends Vehiculo implements Volador{
   Avion (String vehiculo){
       super("Avion");
   }

    @Override
    public String toString(){
        return " Es una " + this.vehiculo + this.volar();
    }

    @Override
    public String volar() {
        return " Estoy volando prrr";
    }
}
