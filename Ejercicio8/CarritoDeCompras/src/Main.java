import java.beans.IntrospectionException;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        CarritoDeCompras listaProd = new CarritoDeCompras();
        listaProd.agregarProd(new Producto(90,"Alfajor"), 23);
        listaProd.agregarProd(new Producto(1,"Leche"), 234);
        listaProd.agregarProd(new Producto(56,"Manteca"), 87654);
        listaProd.agregarProd(new Producto(3,"Queso"), 67);
        listaProd.agregarProd(new Producto(3465,"Pan"), 99);
        listaProd.agregarProd(new Producto(90,"Alfajor"), 123);
        listaProd.agregarProd(new Producto(3,"Queso"), 67);
        listaProd.verLista();

        System.out.println("------");

        CarritoDeCompras listaProd2 = new CarritoNombreProd();
        listaProd2.agregarProd(new Producto(90,"Alfajor"), 23);
        listaProd2.agregarProd(new Producto(1,"Leche"), 234);
        listaProd2.agregarProd(new Producto(56,"Manteca"), 87654);
        listaProd2.agregarProd(new Producto(3,"Queso"), 67);
        listaProd2.agregarProd(new Producto(3465,"Pan"), 99);
        listaProd2.agregarProd(new Producto(90,"Alfajor"), 123);
        listaProd2.agregarProd(new Producto(3,"Queso"), 67);
        listaProd2.verLista();

    }
}
