package fiuba2;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Carrera{
	private final String nombre;
	private final List<Materia> materias;

	public Carrera (String nombre, Map<String,Materia> materias){
		this.nombre = nombre;
		this.materias = new ArrayList<Materia>();

		for (String nombreMateria:materias.keySet()){
			this.materias.add(materias.get(nombreMateria));
		}
	}

	public String obtenerNombre(){
		return this.nombre;
	}
}