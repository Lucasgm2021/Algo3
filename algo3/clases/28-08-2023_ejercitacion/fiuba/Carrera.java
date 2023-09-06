package fiuba;

import java.util.ArrayList;

public class Carrera {
	public String nombreCarrera;
	public ArrayList<Materia> materiasAprobadas;
	public ArrayList<Materia> materiasPorAprobar;

	public Carrera(String nombre){
		nombreCarrera = nombre;
		materiasAprobadas = new ArrayList<Materia>();
		materiasPorAprobar = new ArrayList<Materia>();

		ArrayList<String> nombresMaterias = new ArrayList<String>();
		nombresMaterias.add("Algo1");
		nombresMaterias.add("AMII");
		nombresMaterias.add("Fisica I");
		nombresMaterias.add("Algebra II");
		nombresMaterias.add("Algo2");
		nombresMaterias.add("Algo3");


		ArrayList<String> creditosMaterias = new ArrayList<String>(); 
		creditosMaterias.add("6");
		creditosMaterias.add("8");
		creditosMaterias.add("8");
		creditosMaterias.add("8");
		creditosMaterias.add("6");
		creditosMaterias.add("6");

		for (int i = 0;i<nombresMaterias.size();i++){
			Materia materia = new Materia(nombresMaterias.get(i),creditosMaterias.get(i));
			materiasPorAprobar.add(materia);
		}
	}


	public String obtenerNombreCarrera(){
		return nombreCarrera;
	}

	public void mostrarMateriasAprobadas(){
		if (materiasAprobadas.size()==0){
			System.out.println("No hay materias aprobadas aun.");
			return;
		}
		System.out.println("Hay " + materiasAprobadas.size() + " materias aprobadas.");
		for (Materia materia:materiasAprobadas){
			System.out.println("Materia aprobada: " + materia.obtenerNombre() + ", " + materia.obtenerCreditos() + " creditos.");
		}
	}

	public void mostrarMateriasPorAprobar(){
		if (materiasPorAprobar.size()==0){
			System.out.println("No hay materias por aprobar :)");
			return;
		}
		int i = 1;
		for (Materia materia:materiasPorAprobar){
			System.out.println(i + " - materia por aprobar: " + materia.obtenerNombre() + ", " + materia.obtenerCreditos() + " creditos.");
			i = i+1; 
		}
	}

	public int numMateriasPorAprobar(){
		return materiasPorAprobar.size();
	}

	public void marcarAprobada(int numMateria){
		System.out.println("Listado de materias por aprobar: ");
		System.out.println(materiasPorAprobar);
		Materia materia =  materiasPorAprobar.get(numMateria);
		String nombreMateria = materia.obtenerNombre();
		materiasPorAprobar.remove(numMateria);
		materiasAprobadas.add(materia);
		System.out.println("La materia " + nombreMateria + " fue marcada como aprobada correctamente.");
	}
}