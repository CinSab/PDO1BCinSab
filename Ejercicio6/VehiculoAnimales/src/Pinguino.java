public class Pinguino extends Animal implements Acuatico{
    Pinguino(String especie, String nombre){
        super("Pinguino",nombre);
    }

    @Override
    public String nadar() {
        return "Nadaremos en el mar el mar";
    }

    @Override
    String describir() {
        return "Soy el animal mas triste del mundo";
    }
}
