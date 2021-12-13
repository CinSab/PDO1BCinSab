package Veterinario;

public class Veterinario {
   public static void main(String[] args){

       Alimento aliCarni = new Alimento();
       aliCarni.setEspecie("Carnivoro");
       aliCarni.setPeso(5.0f);

       Alimento aliHervi = new Alimento();
       aliHervi.setEspecie("Hervivoro");
       aliHervi.setPeso(2.3f);

       Alimento aliOmni = new Alimento();
       aliOmni.setEspecie("Omnivoro");
       aliOmni.setPeso(6.0f);

       Animal perro = new Animal();
       perro.name = "Carlos";
       perro.especie = "Omnivoro";
       perro.peso = 5.0f;
       perro.animal = "perro";
       perro.rugir(perro.animal);
       perro.describir();
       perro.comer(aliOmni);
       perro.describir();

       Animal gato = new Animal();
       gato.name = "Carlos";
       gato.especie = "Carnivoro";
       gato.peso = 3.2f;
       gato.animal = "gato";
       gato.rugir(gato.animal);
       gato.describir();
       gato.comer(aliCarni);
       gato.describir();

       Animal coballo = new Animal();
       coballo.setName("Carlos");
       coballo.setEspecie("Hervivoro");
       coballo.setPeso(0.2f);
       coballo.setAnimal("leon");
       coballo.rugir(coballo.animal);
       coballo.describir();
       coballo.comer(aliOmni);
       coballo.describir();

       Animal cebra = new Animal();
       cebra.name = "Carlos";
       cebra.especie = "Hervivoro";
       cebra.peso = 0.2f;
       cebra.animal = "cebra";
       cebra.rugir(cebra.animal);
       cebra.describir();
       cebra.comer(aliOmni);
       cebra.describir();


   }
}
