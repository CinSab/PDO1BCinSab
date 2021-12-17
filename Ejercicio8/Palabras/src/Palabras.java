import java.util.*;
public class Palabras {
    /*Palabras
Dado un string, el método split(separador) lo divide en partes separadas por el separador. Por ejemplo:

"hola como estas".split(" ") devuelve el array ["hola", "como", "estas"]

Hacer una función que dado una oración de palabras separadas por espacios,
 devuelva todas las palabras que aparecen en la oración, de tal manera que aparezcan una sola vez.

Cambiar la implementación para que el conjunto de las palabras sea ordenado.

Cambiar la función para que devuelva no solo las palabras,
sino las palabras asociadas a la cantidad de veces que aparece esa palabra en la oración.

 */
        public static Set<String> palabras(String oracion) {
            String[] sep = oracion.split(" ");
            return new HashSet<>(Arrays.asList(sep));
        }

        public static Set<String> palabrasOrdenadas(String oracion) {
            String[] sep = oracion.split(" ");
            return new TreeSet<>(Arrays.asList(sep));
        }

        public static Map<String, Integer> palabrasxNum(String oracion) {
            String[] sep = oracion.split(" ");
            Map<String, Integer> numerado = new TreeMap<>();
            for (String s : sep) {
                numerado.put(s, numerado.getOrDefault(s, 0) + 1);
            }
            return numerado;
        }


}

