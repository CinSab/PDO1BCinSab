import java.util.ArrayList;

abstract class Vehiculo {
   protected String vehiculo;

    public Vehiculo(String vehiculo){
        this.vehiculo = vehiculo;
    }
    @Override
    public String toString() {
        return "";
    }

    public static String esVolador(ArrayList<Vehiculo> vehiculos){
        int vuela = 0, noVuela = 0;
        for(int i = 0; i < vehiculos.size(); i++){
            if(vehiculos.get(i) instanceof Volador){
                System.out.println(vehiculos.get(i) + " este vuela!");
                vuela++;
            }else{
                System.out.println(vehiculos.get(i) + " este NO vuela!");
                noVuela++;
            }
        }
        return "Vuelan: " + vuela + " No vuelan " + noVuela;
    }
/* Vehículos

    Crear una clase abstracta Vehiculo y subclases Auto, Avion, Helicoptero, Lancha.
    Crear una interfaz Volador con un método volar(). Avion y Helicoptero implementan Volador.
    Crear instancias de todas las clases.
    Crear una variable de tipo Vehiculo, asignarle las instancias de todas las clases.
    Crear una variable de tipo Volador, intentar castear la variable vehiculo a Volador. Ver que en los casos que no es volador, tira error. Agregar un chequeo con instanceof.
    Crear una función esVolador(vehiculo) que toma un vehiculo y devuelve true si es una instancia de Volador.
    Crear una función hacerVolar(vehiculo) que toma un vehículo y si es volador lo hace volar, y si no imprime “este vehiculo no vuela”*/
}
