public class TareitaUno extends Proceso implements Tarea{
    private String algo;

    @Override
    public void ejecutar() {
        System.out.println(algo);
    }

    @Override
    public String getName() {
        return name;
    }
    public TareitaUno(String name, String algo) {
            super(name);
            this.algo = algo;
        }

    }

