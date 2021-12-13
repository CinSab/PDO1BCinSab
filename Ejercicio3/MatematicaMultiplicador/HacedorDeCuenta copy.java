abstract class HacedorDeCuenta {
    /*
    Hacer una clase abstracta HacedorDeCuenta que se construya
    con un número n y un método abstracto hacerCuenta(n2)
    que toma un int y devuelve un int, aplicando la cuenta de n con n2.
    Hacer varias subclases como Multiplicador, Sumador, Exponenciador.
    Por ejemplo hacerCuenta(n2) de Multiplicador devuelve n * n2
    */
   protected int n;

    public HacedorDeCuenta(int n) {
        this.n = n;
    }

    abstract int hacerCuenta(int n2);

}
