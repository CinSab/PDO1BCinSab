import java.util.*;
public class Main {
    public static void main(String[] args){
        /*Vehículos

Crear una clase abstracta Vehiculo y subclases Auto, Avion, Helicoptero, Lancha.

Crear una interfaz Volador con un método volar(). Avion y Helicoptero implementan Volador.

Crear instancias de todas las clases.
Crear una variable de tipo Vehiculo, asignarle las instancias de todas las clases.
Crear una variable de tipo Volador, intentar castear la variable vehiculo a Volador.
 Ver que en los casos que no es volador, tira error. Agregar un chequeo con instanceof.

Crear una función esVolador(vehiculo) que toma un vehiculo y devuelve true si es una instancia de Volador.

Crear una función hacerVolar(vehiculo) que toma un vehículo y si es volador lo hace volar, y si no imprime “este vehiculo no vuela”*/
        ArrayList<Vehiculo> vehiculo = new ArrayList<>();

        Avion avion1 = new Avion("");
        avion1.volar();

        vehiculo.add(avion1);

        Helicoptero heli1 = new Helicoptero("");
        heli1.volar();

        vehiculo.add(heli1);

        Lancha lancha1 = new Lancha("");

        vehiculo.add(lancha1);

        Auto auto1 = new Auto("");

        vehiculo.add(auto1);


        for(Object o : vehiculo){
            System.out.println(o.toString());
        }
        System.out.println(auto1 instanceof Volador);
       // System.out.println(lancha1.esVolador(vehiculo));
        System.out.println(Vehiculo.esVolador(vehiculo));
        System.out.println("**********************");
      /*  for(int i = 0; i < vehiculo.size(); i++){
            System.out.println(vehiculo.get(i).toString());
        }*/
   /* Animales

    Crear una clase abstracta Animal con un método getNombre() y un método abstracto describir()
    Crear la interfaz Acuatico con el metodo nadar()
    Crear algunas subclases de Animal que implementen Acuatico
    Crear algunas subclases de Animal que no implementen Acuatico
    Crear algunas subclases de Animal que implementen Volador (del ejercicio anterior).

    Hacer una función dameAcuaticos(animales) que dado una lista de Animal,
    devolver una lista de Acuatico con todos los animales que implementan Acuatico (usando instanceof)

    Hacer una función showDeAnimales(animales) que toma una lista de Animal y a todos los Acuatico los hace nadar,
     a todos los Volador los hace volar y al resto imprime “NOMBRE no hace nada”
*/
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Pato("","Lu-"));
        animals.add(new Aguila("","Libertad"));
        animals.add(new Oso("","Pardo"));
        animals.add(new Oso("","Polar"));
        animals.add(new Oso("","Panda"));
        animals.add(new Pinguino("","Gunter"));

        for(Animal a : animals){
           // System.out.println(a.getNombre());
            System.out.println(a.describir());
        }

        System.out.println(Animal.dameAcuaticos(animals));
        System.out.println("*******SHOW DE ANIMALES******");
        System.out.println(Animal.showAnimales(animals));
    }
}
