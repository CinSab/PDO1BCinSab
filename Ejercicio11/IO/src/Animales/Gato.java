package Animales;

public class Gato extends Animal {

    public Gato(String nombre){
        super(nombre);
        this.especie = "Gato";
    }

    @Override
    String hacerRuido(){
        return "Miu";
    }
    @Override
    public String  toString(){
        return "Holo, soy " + nombre + " mi especie es: " + especie+" " + hacerRuido();
    }
}
