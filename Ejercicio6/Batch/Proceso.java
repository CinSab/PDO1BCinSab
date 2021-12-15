 import java.util.List;

    abstract public class Proceso{
        protected String name;

        public Proceso(String nombre) {
            this.name = nombre;
        }

        public static void procesarBatch(List<Tarea> tarea) {
            for (Tarea tareaa : tarea) {
                System.out.println("Ejecutando la Tarea " + tareaa.getName());
                tareaa.ejecutar();
            }
        }
}
