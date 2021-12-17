import java.util.*;

public class Diccionario{
    public static Set<String> oracion(String oracion) {
        String[] separado = oracion.split(" ");
        return new HashSet<>(Arrays.asList(separado));
    }

    public static void dic(Map<String, String> dic, Set<String> lis) {
        for (String iter : lis) {
            if (dic.containsKey(iter)) {
                System.out.println("La definicion de " + iter + " es: " + dic.get(iter));
            }
        }
    }
}
