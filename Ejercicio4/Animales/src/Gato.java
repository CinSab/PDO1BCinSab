public class Gato extends Animal{

    public Gato(String nombre, String especie){
        super(nombre, "Gato");
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
