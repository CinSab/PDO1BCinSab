import java.util.List;

    public class TareaConLista extends Proceso implements Tarea {
        private List<Integer> nuums;

        public TareaConLista(String name, List<Integer> nuums) {
            super(name);
            this.nuums = nuums;
        }

        @Override
        public void ejecutar() {
            for (Integer nums : nuums) {
                System.out.println("numreooooos : " + nums);
            }
        }

        @Override
        public String getName() {
            return name;
        }
    }