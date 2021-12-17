import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args){

        String frase = "ay que dolor que pena";
        Set<String> oracion = Diccionario.oracion(frase);
        Diccionario diccionario = new Diccionario();
        Map<String,String> contenido = new HashMap<>();
        contenido.put("ay" , "ay es una onomatopeya");
        contenido.put("que" , "que de cosa");
        contenido.put("dolor" , "doloroso");
        contenido.put("pena" , "sinonimo de tristeza");

        Diccionario.dic(contenido,oracion);
    }
}
