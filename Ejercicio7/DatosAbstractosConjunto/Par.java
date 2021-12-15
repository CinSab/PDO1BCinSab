public class Par implements Conjunto{
    private int num1;
    Par(int num1){
        this.num1 = num1;
    }

    boolean isPar(int num){
        return (num % 2) == 0;
    }

    @Override
    public boolean pertenece(Object o) {
       return o instanceof Integer && isPar(num1);
    }
    // Una que devuelve true si el objeto es un numero (usando instanceof Integer) y es un numero par.

}
