import java.util.ArrayList;

abstract class Animal {
    /*
Animales

Hacer una clase abstracta Animal con un atributo nombre y un atributo especie. Debe tener un constructor que tome el nombre y la especie, un método abstracto hacerRuido() y un método concreto describir().

Hacer varias subclases (Ejemplo Perro, Gato, Pato) que se construyan sólo con el nombre y usen la misma especie para todas instancias de esa clase. Por ejemplo, todos los objetos de clase Perro tienen la especie “perro”.

Todas las clases deben implementar el método hacerRuido() y sobreescribir el método describir() de tal manera que llame al método de la superclase y luego agregue más información.

Hacer una subclase de algún animal. Por ejemplo Labrador o Chihuahua. Sobreescribir el método describir()

Verificar que no se puede crear una instancia de Animal.
Crear varias instancias de distintos animales.
Hacer un método estático escucharTodos que tome un array de Animal y llame al método hacerRuido() de todos los animales.
* */
    String nombre;
    String especie;

    public Animal(String nombre, String especie){
        this.especie = especie;
        this.nombre = nombre;
    }

    abstract String hacerRuido();

    @Override
    public String toString(){
        return "Holo, soy " + nombre + " mi especie es: " + especie;
    }

    public static ArrayList escucharTodys(ArrayList<Animal> animals){
        ArrayList<String> ruidos = new ArrayList<>();
        for(int i = 0; i < animals.size(); i++){
          //System.out.println(animals.get(i).hacerRuido() + " ");
            ruidos.add(animals.get(i).hacerRuido());
        }
        return ruidos;
    }
}

