package fiubaCRM;

public class Persona {
	String nombre;
	String dni;

	public Persona(String nombre,String dni) {
		this.nombre=nombre;
		this.dni = dni;
	} 

	public String obtenerNombre(){
		return this.nombre;
	}

	public String obtenerDni(){
		return this.dni;
	}

}