public class FuncionesObjetos {
    private String saludo;

    public static void hola() {
        int n = 7;
        System.out.println(n);
        hola2(n);
    }
    public static void hola2(int k){
        System.out.println(k);
        if(k > 0){
            hola2(k - 1);
        }
    }
    public static void arrayRecargado(){
        int[] excedido = new int[]{1,2};
        System.out.println(excedido[3]);
    }

    public static void stackK(){
        FuncionesObjetos FO1 = new FuncionesObjetos();
        FO1.saludo = "Ola ke ace";
        stackK();
    }
}
