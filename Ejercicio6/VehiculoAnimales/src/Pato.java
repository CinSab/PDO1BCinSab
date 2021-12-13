public class Pato extends Animal implements Acuatico, Volador{
    Pato(String especie, String nombre){
        super("Pato",nombre);
    }
    @Override
    public String nadar() {
        return "Me deslizo por la superficie del agua(?)";
    }

    @Override
    public String volar() {
        return "Estoy volando, cuack";
    }

    @Override
    public String describir() {
        return "Soy el Pato Lu-";
    }
}
