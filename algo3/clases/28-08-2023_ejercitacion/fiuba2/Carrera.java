package fiuba2;

import java.util.List;
import java.util.ArrayList;

public class Carrera{
	private final String nombre;
	private final List<Materia> materias;

	public Carrera (String nombre, List<Materia> materias){
		this.nombre = nombre;
		materiasAprobadas = new ArrayList<Materia>();
		materiasPorAprobar = new ArrayList<Materia>();

		for (Materia materia:materias){
			materias.add(materia);
		}
	}

	public String obtenerNombre(){
		return this.nombre;
	}
}