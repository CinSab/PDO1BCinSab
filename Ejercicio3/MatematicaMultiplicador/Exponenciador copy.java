public class Exponenciador extends HacedorDeCuenta{
    public Exponenciador(int n){
        super(n);
    }
    @Override
    public int hacerCuenta(int n2) {
        return this.n^n2;
    }
}
