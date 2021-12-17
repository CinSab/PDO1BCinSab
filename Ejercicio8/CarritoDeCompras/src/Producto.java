import java.util.Objects;

public class Producto implements Comparable{
    private int id;
    private String nombre;
    /*Carrito de compras
Usar un mapa para representar un carrito de compras, con una asociación
 de Producto -> cantidad. Producto es una clase que tiene id producto y nombre.
  Implementar equals y hashCode.
Luego cambiar a TreeMap e implementando Comparable que compare id de producto.
 Verificar que los productos están ordenados según el id de producto.
*/

    Producto(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {return nombre;}

    @Override
    public boolean equals(Object o) {
        Producto producto = (Producto) o;
        return id == producto.id && nombre.equals(producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }

    @Override
    public String toString() {
        return "Producto: " +
                "id " + id +
                ", prod. '" + nombre + '\'' +
                ' ';
    }

    @Override
    public int compareTo(Object o) {
        Producto prod = (Producto) o;
        if(this.id > prod.id){
            return 1;
        }else if(this.id < prod.id){
            return -1;
        }else
        return 0;
    }
}
