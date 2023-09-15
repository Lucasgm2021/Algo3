package fiuba;

public class Materia {
	public String nombreMateria;
	public String creditosMateria;
	public Materia(String nombre, String creditos){
		nombreMateria = nombre;
		creditosMateria = creditos;
	}

	public String obtenerNombre(){
		return nombreMateria;
	}

	public String obtenerCreditos(){
		return creditosMateria;
	}
}