import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CarritoDeCompras{
    //public Map<Producto, Integer> listaProd = new LinkedHashMap<>();
    public Map<Producto, Integer> listaProd = new TreeMap<>();

    /**
     *       Scanner in = new Scanner(System.in);
     *     Integer autoIncrement = 0;
     *     System.out.println("Ingresar cantidad de productos: ");
     *     Integer cantProd = in.nextInt();
     *        in.nextLine();
     *     for(Integer i = 0; i < cantProd; i++){
     *         System.out.println("Ingresar producto: ");
     *         String nomProd = in.nextLine();
     *         autoIncrement++;
     *         Producto prod = new Producto(autoIncrement, nomProd);
     *         System.out.println("Ingresar cantidad del producto ingresado: ");
     *         Integer cantDelProd = in.nextInt();
     *         CarritoDeCompras.listaProd.put(prod, cantDelProd);
     *         in.nextLine();
     *      }
     *         System.out.println(CarritoDeCompras.listaProd);
     *     }
     */
    public void agregarProd(Producto prod, Integer cant){
        listaProd.put(prod, cant);
    }
    public void verLista() {
        for (Map.Entry<Producto, Integer> listaProds : listaProd.entrySet()) {
            System.out.println(listaProds.toString());
        }
    }
}
