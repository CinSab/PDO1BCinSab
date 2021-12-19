package Animales;

public class Perro extends Animal {

    public Perro(String nombre){
        super(nombre);
        this.especie = "Perro";
    }

    @Override
    String hacerRuido(){
        return "raf";
    };

    @Override
    public String  toString(){
        return "Holo, soy " + nombre + " mi especie es: " + especie+" " + hacerRuido();
    }

}
