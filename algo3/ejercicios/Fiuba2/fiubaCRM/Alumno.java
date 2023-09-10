package fiubaCRM;

public class Alumno extends Persona{
	String padron; 
	public Alumno(String nombre,String dni, String padron){
		super(nombre,dni);
		this.padron = padron;
	}
	public String obtenerPadron(){
		return this.padron;
	}

}