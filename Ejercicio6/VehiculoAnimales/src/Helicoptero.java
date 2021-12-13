public class Helicoptero extends Vehiculo implements Volador {

    public Helicoptero(String vehiculo){
        super("Helicoptero");
    }
    @Override
    public String volar() {
        return " Estoy volando rakata";
    }
    public String toString(){
        return " Es un " + this.vehiculo + this.volar();
    }
}
