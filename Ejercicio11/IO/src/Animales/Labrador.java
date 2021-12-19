package Animales;

public class Labrador extends Perro{

    public Labrador(String nombre) {
        super(nombre);
        this.especie = "Labrador";
    }
    @Override
    public String  toString(){
        return "Holo, soy " + nombre + " mi especie es: " + especie +" " + hacerRuido();
    }
}
