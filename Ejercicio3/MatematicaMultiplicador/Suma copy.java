public class Suma extends HacedorDeCuenta{
    public Suma(int n){
        super(n);
    }

    @Override
    public int hacerCuenta(int n2) {
        return this.n + n2;
    }
}
