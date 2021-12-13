public class Cirujano extends Medico{
   String especialidadCirugia;

	 Cirujano(String name, int dni, String hospital, String especialidad,long matricula, String especialidadCirugia){
		 super(name, dni, hospital, especialidad);
		 this.matricula = matricula;
		 this.especialidadCirugia = especialidadCirugia;
	 }
}
