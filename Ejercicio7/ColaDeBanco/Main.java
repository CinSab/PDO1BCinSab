import java.util.Random;

public class Main {
    public static void main(String[] args){
        ColaDeBanco colaDeBanco = new ColaDeBanco();
        colaDeBanco.generadorDePersonas(5);
        System.out.println(colaDeBanco.colaDePersonas);
        System.out.println(colaDeBanco.atender());
        System.out.println(colaDeBanco.colaDePersonas);
    }
}
