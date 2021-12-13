package Veterinario;

public class Animal {
   String name;
   String especie;
   String animal;
   float peso;

   public String getName(){return name;}

   public void setName(String name){this.name = name;}

   public String getEspecie(){return especie;}

   public void setEspecie(String especie){this.especie = especie;}

   public String getAnimal(){return animal;}

   public void setAnimal(String animal){this.animal = animal;}

   public float getPeso(){return peso;}

   public void setPeso(float peso){this.peso = peso;}

   public void describir(){
       System.out.println("Soy: " + this.getName() + ", " + this.getAnimal() + " y peso: " + this.getPeso());
   }

   public void rugir(String animal){
       if(this.animal == "perro"){
           System.out.println(" waf waf");
       }else if(this.animal == "gato"){
           System.out.println(" miaaaaaauf");
       }else if(this.animal == "leon"){
           System.out.println(" rooooaaaar");
       }else{
           System.out.println(" ruido generico");
       }
   }
   public void comer(Alimento alimento){
       if(alimento.especie == "Carnivoro"){
           this.peso +=  alimento.peso;
       }else if(alimento.especie == "Hervivoro") {
           this.peso += alimento.peso;
       }else if(alimento.especie == "Omnivoro"){
           this.peso += alimento.peso;
       }else{
           System.out.println("No es compatible la comida con la especie");
       }
   }
}
