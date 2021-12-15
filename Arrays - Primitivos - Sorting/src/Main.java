import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        /*Lista de strings

Crear una lista de Strings usando ArrayList como implementación.
Agregar varios nombres de personas.
Iterar la lista con el for clásico for (int i =0 …)
Iterar la lista con el for de colecciones for (String nombre: …)
Cambiar varios valores usando indice con set(…)
Usar la función remove(indice) para borrar un elemento de la lista por posición.
Agregar un elemento repetido, usar la función remove(nombre) para borrar un elemento que está repetido.
 Ver que sólo removió la primera ocurrencia.
Usar el método contains(nombre) para ver que un elemento sigue estando.
Crear la función borrarTodos(lista, nombre) que usando el método remove y
el método contains borre todas las apariciones de ese nombre
En la definición de la lista, cambiar ArrayList por LinkedList y ver que todo sigue funcionando.
******
Tipos primitivos

Crear listas de ints, longs, floats, doubles, booleans y chars
Arrays y sorting

Crear un array de ints con varios valores.
Usar java.util.Arrays.sort(array) y ver que ordena el array.
Usar java.util.Arrays.asList(array) y transformar el array en una lista

Crear una lista de números desordenada
Usar java.util.Collections.sort(lista) para ordenar la lista
Usar el metodo lista.toArray() para convertir de lista a array.
*/
        LinkedList<Long> longos = new LinkedList<>();
        LinkedList<Float> flotadores = new LinkedList<>();
        LinkedList<Double> doubles = new LinkedList<>();
        LinkedList<Boolean> buleanos = new LinkedList<>();
        LinkedList<Character> personajes = new LinkedList<>();

        ArrayDeInts.arrayInt();
        ArrayDeInts.arrayIntList();
        //ArrayList<String> nombres = new ArrayList();
        LinkedList<String> nombres = new LinkedList<>();
        nombres.add("cristina");
        nombres.add("roberta");
        nombres.add("Manuel");
        nombres.add("Carlos");
        nombres.add("Fernanda");

        System.out.println("Lista original");

        for(int i = 0; i < nombres.size(); i++){
            System.out.println(nombres.get(i));
        }
        nombres.set(3, "Florencia");
        System.out.println("***Modificando un valor***");

        for (String names : nombres) {
            System.out.println(names);
        }
        nombres.remove(3);
        System.out.println("***Eliminando un valor***");

        for (String names : nombres) {
            System.out.println(names);
        }
        nombres.add("Carlos");
        nombres.add("Carlos");
        nombres.add("Carlos");
        System.out.println("***Agregando dos iguales***");
        for (String names : nombres) {
            System.out.println(names);
        }
        System.out.println("***Removiendo el repetido***");
        nombres.remove("Carlos");
        for (String names : nombres) {
            System.out.println(names);
        }
        System.out.println(nombres.contains("Carlos"));
        borrarTodosString(nombres,"Carlos");
        //-------- int
        //ArrayList<Integer> numeros = new ArrayList();
        LinkedList<Integer> numeros = new LinkedList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        System.out.println("Lista original");

        for(int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
        numeros.set(3, 90);
        System.out.println("***Modificando un valor***");

        for (Integer number : numeros) {
            System.out.println(number);
        }
        numeros.remove(3);
        System.out.println("***Eliminando un valor***");

        for (Integer number : numeros) {
            System.out.println(number);
        }
        numeros.add(77);
        numeros.add(77);
        numeros.add(77);
        System.out.println("***Agregando dos iguales***");
        for (Integer number : numeros) {
            System.out.println(number);
        }
        System.out.println("***Removiendo el repetido***");
        numeros.remove(Integer.valueOf(77));
        for (Integer number : numeros) {
            System.out.println(number);
        }
        System.out.println(numeros.contains(77));
        borrarTodosInt(numeros,Integer.valueOf(77));
    }
   // public static void borrarTodos(ArrayList<String> lista, String name){
   public static void borrarTodosString(LinkedList<String> lista, String name){
        for(int i = 0; i < lista.size(); i ++) {
            if(lista.contains(name)){
                lista.remove(name);
            }
            System.out.println(lista);
        }
    }
    public static void borrarTodosInt(LinkedList<Integer> lista, int n){
        for(int i = 0; i < lista.size(); i ++) {
            if(lista.contains(n)){
                lista.remove(Integer.valueOf(n));
            }
            System.out.println(lista);
        }
    }
}
