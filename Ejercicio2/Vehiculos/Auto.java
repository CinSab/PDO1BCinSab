public class Auto extends Vehiculo{
   int puertas;
   String tipo; //(Electrico, nafta, gas)

   public int getPuertas(){return puertas;}
   public void setPuertas(int puertas){this.puertas = puertas;}
   public String getTipo(){return tipo;}
   public void setTipo(String tipo){this.tipo = tipo;}
}
public class Moto extends Vehiculo{
   int cilindrada;


   public int getCilindrada(){return cilindrada;}
   public void setCilindrada(int cilindrada){this.cilindrada = cilindrada;}

}
