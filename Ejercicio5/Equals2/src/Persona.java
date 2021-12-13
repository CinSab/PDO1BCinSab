import java.util.Objects;

public class Persona {
        private String nombre;
        private String sexo;
        private int dni;

        public Persona(String nombre, boolean sexo, int dni){
                this.dni = dni;
                this.sexo = declararSexo(sexo);
                this.nombre = nombre;
        }
        private String declararSexo(boolean sexo){
                if(!sexo)return "M";
                else return "F";
        }

       /* public String getNombre() {return nombre;}
        public int getDni() { return dni; }
        public boolean isSexo() {return sexo;}*/

        @Override
        public String toString(){
                return "Nombre " + nombre + " dni " + dni + " sexo " + sexo ;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Persona persona = (Persona) o;
                return sexo == persona.sexo && dni == persona.dni;
        }
}
