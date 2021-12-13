public class Medico extends ProfSalud{
   String especialidad;
   long matricula;

   Medico(String name, int dni, String hospital, String especialidad,long matricula){
		 super(name, dni, hospital);
		 this.especialidad = especialidad;
	 }

}
