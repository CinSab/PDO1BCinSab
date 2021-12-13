public class Labrador extends Perro{

    public Labrador(String nombre, String especie) {
        super(nombre, especie);
        this.especie = "Labrador";
    }
    @Override
    public String  toString(){
        return "Holo, soy " + nombre + " mi especie es: " + especie +" " + hacerRuido();
    }
}
