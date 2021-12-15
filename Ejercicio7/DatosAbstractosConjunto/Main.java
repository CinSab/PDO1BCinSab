import java.util.List;

public class Main {
    public static void main(String[] args){
        Par numm = new Par(2);
        Par num = new Par(1);
        Integer nopar = 7;
        Integer par = 2;
        Long doble = 1233l;
        Lista lista = new Lista();
        lista.AgregarObjLista(numm);
        lista.AgregarObjLista(num);

        System.out.println(lista.pertenece(num));
        System.out.println(lista.pertenece(numm));
        System.out.println(lista.pertenece(doble));
        System.out.println(lista.pertenece(nopar));
        System.out.println(num.pertenece(nopar));
        System.out.println(numm.pertenece(par));
        System.out.println(numm.pertenece(nopar));

    }
}

