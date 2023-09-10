package fiuba2;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class SystemFiuba {
	Map<String, Materia> materias;
	Map<String, Usuario> usuarios;
	List<Carrera> carreras;

	public SystemFiuba(){
		materias = new HashMap<String, Materia> ();
		usuarios= new HashMap<String, Usuario> ();
		carreras = new ArrayList<Carrera>();
		var usuario = new Usuario("Lucas","106830");

		var algo1 = new Materia("Algoritmos y programacion I","6");
		var analisisII = new Materia("Analisis Matematico II","8");
		var fisicaI = new Materia("Fisica I","8");
		var algebraII = new Materia("Algebra II","8");
		var algo2 = new Materia("Algoritmos y programacion II","6");
		var algo3 = new Materia("Algoritmos y programacion III","6");

		materias.put(algo1.obtenerInfo()[0],algo1);
		materias.put(algo2.obtenerInfo()[0],algo2);
		materias.put(algo3.obtenerInfo()[0],algo3);
		materias.put(fisicaI.obtenerInfo()[0],fisicaI);
		materias.put(algebraII.obtenerInfo()[0],algebraII);
		materias.put(analisisII.obtenerInfo()[0],analisisII);

		usuarios.put(usuario.obtenerInfo()[0],usuario);

		var listaMaterias = new ArrayList<Materia>();
		Materia materia;
		for (String nombreMateria:materias){
			materia = materias.get(nombreMateria);
			listaMaterias.add(materia);
		}

		Carrera ingInformatica = new Carrera("Ingenieria en informatica",listaMaterias);
		Carrera licSistemas = new Carrera("Lic en sistemas",listaMaterias);

		carreras.add(ingInformatica);
		carreras.add(licSistemas);
	}

	private void iniciar(){
		System.out.println("Bienvenido al sistema de FIUBA.\n");
		var scan = new Scanner();
		String input;
		Usuario user = usuarios.get("Lucas");
		while (true){
			mostrarOpciones();
			if (input.equals("4")){
				System.out.println("Ha salido correctamente del sistema");
				break;
			} else if (input.equals("1"){
				user.inscribirseACarrera(carreras);
			} else if (input.equals("2"){
				//Inscribirse a una carrera
			} else if (input.equals("3"){
				//Inscribirse a una carrera
			} else {
				System.out.println("No es una opcion valida.");
			}
		}


	}

	private void mostrarOpciones(){
		System.out.println("Las opciones disponibles son: ");
		System.out.println("1 - Inscribirse a una carrera.");
		System.out.println("2 - Marcar una materia como aprobada.");
		System.out.println("3 - Consultar el estado de una carrera.");
		System.out.println("4 - Salir.");
	}


}