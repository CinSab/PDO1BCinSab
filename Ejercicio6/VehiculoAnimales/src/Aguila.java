public class Aguila extends Animal implements Volador{
    Aguila(String especie, String nombre){
        super("Aguila",nombre);
    }
    @Override
    public String volar() {
        return "Mas que volar, planeo(?)";
    }

    @Override
    String describir() {
        return "Soy el Aguila de la libertad";
    }
}
