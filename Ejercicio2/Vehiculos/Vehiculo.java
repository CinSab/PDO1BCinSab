public class Vehiculo {
   String name;
   int ruedas;
   String marca;
   float combustible;

   public String getName(){return name;}
   public void setName(String name){this.name = name;}
   public int getRuedas(){return ruedas;}
   public void setRuedas(int ruedas){this.ruedas = ruedas;}
   public String getMarca() {
       return marca;
   }
   public void setMarca(String marca) {
       this.marca = marca;
   }
   public float getCombustible(){return combustible;}
   public void setCombustible(float combustible){this.combustible = combustible;}

   public void consultarCombustible(){
       System.out.println("Tenes disponible: " + this.getCombustible());
   }
   public void acelerar(){
       this.combustible -= 10f;
       consultarCombustible();
   }

   public void agregarCombustible(float combustible){
       this.combustible += combustible;
       consultarCombustible();
   }

}
