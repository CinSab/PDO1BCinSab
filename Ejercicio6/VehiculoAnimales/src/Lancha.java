public class Lancha extends Vehiculo implements Acuatico{
    public Lancha(String vehiculo) {
        super("Lancha");
    }

    @Override
    public String nadar() {
        return " Nado como lancho";
    }

    @Override
    public String toString(){
        return " Es una " + this.vehiculo + this.nadar();
    }
}
