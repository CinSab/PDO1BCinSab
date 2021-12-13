public class Pregunta {
  String ejemplo;
  int ejemplo;
  /*
  Sobrecargar si bien es para definir nuevo metodos, se usa mucho con los constructores para tener mas opciones de construccion, valga la redundancia.

  Sobrescribir un métodos
  con una nueva definición de ese mismo método, en otra clase.

  */

    public Pregunta(String ejemplo) {
        this.ejemplo = ejemplo;
    }

    public Pregunta(String ejemplo, int ejemploo) {
        this(ejemplo);
        this.ejemploo = ejemploo;
    }

    public void sobreEscribir() {
        System.out.println("sobreEscritura");
    }
}
