import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random numGenerator = new Random();
        numGenerator.ints();
        int Num = (int)(Math.random() * 100);
        ColaDeBanco colaDeBanco = new ColaDeBanco();
        colaDeBanco.generadorDePersonas(Num);
        System.out.println(colaDeBanco.colaDePersonas);
        colaDeBanco.atender();
        System.out.println(colaDeBanco.colaDePersonas);
    }
}
