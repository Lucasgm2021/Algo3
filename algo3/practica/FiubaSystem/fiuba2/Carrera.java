package fiuba2;

import java.util.List;
import java.util.ArrayList;

public class Carrera{
	private final String nombre;
	private final List<Materia> materias;

	public Carrera (String nombre, List<Materia> materias){
		this.nombre = nombre;
		this.materias = new ArrayList<Materia>();
		for (Materia materia:materias){
			this.materias.add(materia);
		}
	}

	public String obtenerNombre(){
		return this.nombre;
	}
}