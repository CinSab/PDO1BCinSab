import java.util.ArrayList;
import java.util.List;

public class TareaDeLists2 extends Proceso implements Tarea{
    List<String> arrr = new ArrayList<>();

    public TareaDeLists2(String nombre, List<String> arrr) {
        super(nombre);
        this.arrr = arrr;
    }

    @Override
    public void ejecutar() {
        for(String palabras : arrr){
            System.out.println("Los piratas hacen " + palabras);
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
