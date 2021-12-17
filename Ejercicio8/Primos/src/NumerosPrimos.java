import java.util.Map;
import java.util.TreeMap;

public class NumerosPrimos {
    public static Map<Integer, Boolean> primos = new TreeMap<>();
    public static boolean esPrimo(int n) {
        if (primos.containsKey(n)) {
            return true;
        }
        if (n == 0 || n == 1 || n == 4) {
            return false;
        }
        for (int x = 2; x < n / 2; x++) {

            if (n % x == 0)
                return false;
        }
        primos.put(n, true);
        return true;
    }
}
