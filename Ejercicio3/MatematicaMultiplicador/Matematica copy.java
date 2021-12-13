public class Matematica {

   /* public static int sumar(int num1, int num2){
        return num1 + num2;
    }

    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }*/

    public static int dameMultiplicar(int num1, int num2){
        Multiplicador multi = new Multiplicador(num1);
            return multi.hacerCuenta(num2);
    }
    public static int dameSumar(int num1, int num2){
        Suma suma = new Suma(num1);
        return suma.hacerCuenta(num2);
    }
    public static int dameExponente(int num1, int num2){
        Exponenciador expo = new Exponenciador(num1);
        return expo.hacerCuenta(num2);
    }

}
