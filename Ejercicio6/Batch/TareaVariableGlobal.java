public class TareaVariableGlobal extends Proceso implements Tarea{
    String varGlobal = "globo";

    TareaVariableGlobal(String name){
        super(name);
    }
    public void ejecutar() {
        varGlobal = "GLOBO";
        System.out.println(varGlobal);
    }

    @Override
    public String getName() {
        return name;
    }
}
