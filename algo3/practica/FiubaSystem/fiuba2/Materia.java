package fiuba2;

public class Materia{
	private final String nombre;
	private final String creditos;

	public Materia (String nombre,String creditos){
		this.nombre =nombre;
		this.creditos=creditos;
	}

	public String obtenerNombre(){
		return this.nombre;
	}
}