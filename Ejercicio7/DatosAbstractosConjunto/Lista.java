import java.util.ArrayList;

public class Lista implements Conjunto{
    //Otra que contenga una lista de objetos y devuelva true si el objeto esta en esa lista.
    private ArrayList<Object> list = new ArrayList<>();

    void AgregarObjLista(Object o){
        list.add(o);
    }

    @Override
    public boolean pertenece(Object o) {
        return list.contains(o);
    }
}
