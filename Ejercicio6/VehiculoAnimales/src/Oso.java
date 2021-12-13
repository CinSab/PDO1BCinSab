public class Oso extends Animal{
    Oso(String especie, String nombre){
        super("Oso",nombre);
    }
    @Override
    String describir() {
        return "Soy "+ nombre +" No vuelo, y en realidad nado pero no tanto como para implementar la interface(?)";
    }
}
