public class Main {
   public static void main(String[] args) {

       Auto auto1 = new Auto();
       auto1.setMarca("Fiat");
       auto1.setName("Toro Volcano");
       auto1.setTipo("nafta");
       auto1.setPuertas(5);
       auto1.setRuedas(4);
       auto1.setCombustible(50f);

       Moto moto1 = new Moto();
       moto1.setMarca("Zanella");
       moto1.setName("rx 150");
       moto1.setCilindrada(150);
       moto1.setRuedas(2);
       moto1.setCombustible(30f);

       auto1.consultarCombustible();
       auto1.acelerar();
       auto1.agregarCombustible(50.2f);

   }
}
