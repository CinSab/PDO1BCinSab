import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception{
        try {
           aVer();
        }catch (Exception e){
            //throw new Exception("No funka");
            System.out.println("No funka pero no rompe :P");
        }
        try {
            int[] outOfArray = new int[]{1,2};
            System.out.println(outOfArray[3]);
        }catch (ArrayIndexOutOfBoundsException e){
           // throw new ArrayIndexOutOfBoundsException("No funka");
             System.out.println("No funka pero no rompe :P");
        }
        outOfMana(null);
    }
    static int aVer(){
        return 0/ 0;
    }
     static String outOfMana(String value){
                try {
                    value == null;
                }catch (Exception e){
                    throw new NullPointerException("Le dicen error dee noob(?)");
                }
            }

    //TP 9:
    public void OutOfMemoryError() {
        int j = 1;
        try {
            List<Integer> nums = new ArrayList<>();
            while (true) {
                nums.add(j);
                j = j * 100;
            }
        } catch (OutOfMemoryError e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}

    /*
    * Runtime exceptions

Crear un código que tire una excepción de NullPointerException
Crear un código que tire una excepción de ArrayIndexOutOfBoundsException.

Usar try catch para atrapar esas excepciones,
imprima el mensaje de la excepción, y que el programa termine bien

    * */

