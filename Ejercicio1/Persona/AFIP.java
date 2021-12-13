public class Afip{
	String nombre;
	String apellido;
	Date nacimiento;
	int edad;
	boolean activo;
	String nacionalidad;
	int ID;

	boolean planSocial;
	boolean avtivoLaboralmente;
	String profesion;
	boolean estudios;
	String estadoCivil;
	float aportes;

	isActivo(); //(Lo pensé en combinarlo con lo laboral pero creo que queda mejor que se refiere a si está muerta la persona).

	tipoDeTrabajo(); //(Si activoLaboralmente es true, definir si es en blanco o monotributista)
	tipoDePlan(); //(Si planSocial es true, agregar cuales)
	consultarPlanes();
	tipoDeEstadoCivil();
	verHistorialDeAportes();

}
