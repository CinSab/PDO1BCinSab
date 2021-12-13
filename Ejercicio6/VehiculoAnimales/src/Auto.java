public class Auto extends Vehiculo{
    public Auto(String vehiculo) {
        super("Auto");
    }

    @Override
    public String toString(){
        return " Es un " + this.vehiculo;
    }
}
