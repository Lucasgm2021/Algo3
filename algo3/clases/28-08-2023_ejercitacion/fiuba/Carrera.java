import java.util.ArrayList;

public class Carrera {
	public String nombreCarrera;
	public ArrayList<Materia> materiasAprobadas;
	public ArrayList<Materia> materiasPorAprobar;

	public Carrera(String nombre){
		nombreCarrera = nombre;
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
			System.out.println(materia);
		}
	}
}