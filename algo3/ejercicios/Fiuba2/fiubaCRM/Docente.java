package fiubaCRM;

public class Docente extends Persona{
	String legajo; 
	public Docente(String nombre,String dni, String legajo){
		super(nombre,dni);
		this.legajo = legajo;
	}
	public String obtenerLegajo(){
		return this.legajo;
	}
}