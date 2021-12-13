public class Perro extends Animal{

    public Perro(String nombre, String especie){
        super(nombre, "Perro");
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
