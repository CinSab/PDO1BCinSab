public class Main {
    public static void main(String[] args){
        System.out.println(NumerosPrimos.esPrimo(7));
        System.out.println(NumerosPrimos.esPrimo(6));
        System.out.println(NumerosPrimos.esPrimo(567));
        System.out.println(NumerosPrimos.esPrimo(9));
        System.out.println(NumerosPrimos.esPrimo(2));
        System.out.println(NumerosPrimos.primos);
    }
    /*
    * Primos
Hacer una clase NumerosPrimos con un método esPrimo(n) que devuelve true si el número es primo.

Queremos optimizar esta clase para que no haga el mismo cálculo más de una vez.
*  Usar un mapa para guardar el resultado de cada número que se pregunte,
*  para luego poder devolver el valor del mapa en vez de calcularlo nuevamente.
* Como queremos que esta búsqueda sea lo más rápida posible, qué debemos usar? TreeMap o HashMap?

Agregar un método primosConocidos() que devuelve un conjunto de los números primos que ya conocimos (es decir, ya calculamos en esPrimo(n) ). El conjunto debe estar ordenado de menor a mayor.
*/

}
