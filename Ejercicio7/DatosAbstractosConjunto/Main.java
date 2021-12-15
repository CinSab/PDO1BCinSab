import java.util.List;

public class Main {
    public void main(String[] args){
        Par numm = new Par(2);
        Par num = new Par(1);
        Par nopar = new Par(7);
        Lista lista = new Lista();
        lista.AgregarObjLista(numm);
        lista.AgregarObjLista(num);

        System.out.println(lista.pertenece(num));
        System.out.println(lista.pertenece(numm));
        System.out.println(lista.pertenece(nopar));
        System.out.println(num.pertenece(num));
        System.out.println(numm.pertenece(numm));

    }
}
