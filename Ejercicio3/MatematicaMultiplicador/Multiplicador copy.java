public class Multiplicador extends HacedorDeCuenta{
    //private int n;

    public Multiplicador(int n){
        super(n);
   }

    @Override
    public int hacerCuenta(int n2) {
        return this.n * n2;
    }

    /*public int multiplicar(int n2){
        return this.number * n2;
    }
   /*Crear una clase Multiplicador que se cree tomando un número n de parámetro y tenga un método
    multiplicar(int n2) que devuelva n x n2.
    Crear una función dameMultiplicador(n)
    en la clase Matemática que cree una instancia de Multiplicador y la devuelva.
    */

}
