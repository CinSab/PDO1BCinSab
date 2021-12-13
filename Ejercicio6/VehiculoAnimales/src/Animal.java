import java.util.ArrayList;

abstract class Animal {
   protected String nombre,especie;

    public String getNombre() {
        return nombre;
    }
    Animal(String especie, String nombre){
        this.especie = especie;
        this.nombre = nombre;
    }

    abstract String describir();

    public static String dameAcuaticos(ArrayList<Animal> animals){
        int nada = 0, noNada = 0;
        for(int i = 0; i < animals.size(); i++){
            if(animals.get(i) instanceof Acuatico){
                System.out.println(animals.get(i).getNombre() + " este nada!");
                nada++;
            }else{
                System.out.println(animals.get(i).getNombre() + " este NO nada!");
                noNada++;
            }
        }
        return "Nadan: " + nada + ". No nadan " + noNada;
    }

    public static String showAnimales(ArrayList<Animal> animals){
        for(int i = 0; i < animals.size(); i++){
            if(animals.get(i) instanceof Volador){
                System.out.println(((Volador) animals.get(i)).volar() +" " + animals.get(i).getNombre());
            }else if(animals.get(i) instanceof Acuatico){
                System.out.println(((Acuatico) animals.get(i)).nadar() + " " +animals.get(i).getNombre());
            }else{
                System.out.println(animals.get(i).describir());
            }
        }
        return "Show de animales end.";
    }
}
