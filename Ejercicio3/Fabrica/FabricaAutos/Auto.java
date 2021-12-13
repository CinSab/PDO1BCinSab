package FabricaAutos;
public class Auto{
    /*
        Crear una clase Auto en un paquete autos con atributos marca, modelo, año y que se construya con esos tres atributos.

        Luego cambiar el constructor, hacerlo de acceso de paquete. Verificar que no se pueda construir desde el main.

        Crear una clase FabricaDeAuto en el mismo paquete que se construya con una marca. Debe tener:

        Un atributo estático año para guardar el año en el que estamos (igual para todas las fábricas)
        Un método fabricarAuto(modelo) que crea un auto de esa marca, modelo en el año actual.
        Si el año no está seteado, debe imprimir un mensaje de error y devolver null
    */

   String marca, modelo;
   int anio;

    public Auto(String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    public String toString(){
        return marca + " " + this.modelo + " " + anio + ".";
    }

}
