import com.sun.org.apache.bcel.internal.generic.ATHROW;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Perro("Carlos","Cebra"));
        animals.add(new Perro("Nekro","Cebra"));
        animals.add(new Labrador("Labraperro","Labrador"));
        animals.add(new Gato("Kitty","Cebra"));

        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }

        ArrayList<Animal> ruidos = Animal.escucharTodys(animals);
        try{
            for(int i = 0; i < ruidos.size();i++){
                System.out.println(ruidos.get(i));
            }
       }catch (Exception e){
            System.out.println("caca");
        }
        //System.out.println(Animal.escucharTodys(animals));


      /*
        Animal[] animals = new Animal[3];
        Perro p1 = new Perro("Leopoldo","");
        p1.describir();
        animals[0] = p1;

        Labrador p2 = new Labrador("Labraperrro","Labrador");
        p2.describir();
        animals[1] = p2;

        Gato g1 = new Gato("Leopolda","");
        g1.describir();
        animals[2] = g1;

        Animal.escucharTodys(animals);*/

    }
}
