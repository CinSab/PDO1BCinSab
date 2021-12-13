import FabricaAutos.Auto;

public class FabricaDeAuto {
    String modelo, marca;
    final int ANIO = 2021;

    public FabricaDeAuto(String marca){
        this.marca = marca;
    }

    public Auto fabricarAuto(String modelo) {
        Auto auto = new Auto(this.marca, modelo, ANIO);
        return auto;
    }
    public String dataAuto(Auto auto){
        return auto.toString();
    }

}