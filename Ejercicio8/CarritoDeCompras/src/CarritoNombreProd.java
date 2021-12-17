import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CarritoNombreProd extends CarritoDeCompras {
    public Map<Producto, Integer> listaProd2 = new TreeMap<>(new Comparator<Producto>() {
        @Override
        public int compare(Producto prod1, Producto prod2) {
            return prod1.getNombre().compareTo(prod2.getNombre());
        }
    });

    @Override
    public void agregarProd(Producto prod, Integer cant) {
        listaProd2.put(prod, cant);
    }

    @Override
    public void verLista() {
        for (Map.Entry<Producto, Integer> listaProds : listaProd2.entrySet()) {
            System.out.println(listaProds.toString());
        }
    }
}
