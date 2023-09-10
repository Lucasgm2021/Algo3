package fiuba2;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class SystemFiuba {
	private Map<Carrera, Map<String,Materia>> materias;
	private Map<String, Usuario> usuarios;
	private List<Carrera> carreras;

	public SystemFiuba(){
		var materiasIng = new HashMap<String, Materia> ();
		usuarios= new HashMap<String, Usuario> ();
		carreras = new ArrayList<Carrera>();
		var usuario = new Usuario("Lucas","106830");

		var algo1 = new Materia("Algoritmos y programacion I","6");
		var analisisII = new Materia("Analisis Matematico II","8");
		var fisicaI = new Materia("Fisica I","8");
		var fisicaII = new Materia("Fisica II","8");
		var algebraII = new Materia("Algebra II","8");
		var matDisc = new Materia("Matematica discreta","6");
		var orgComp = new Materia("Organizacion del computdor","8");
		var algo2 = new Materia("Algoritmos y programacion II","6");
		var algo3 = new Materia("Algoritmos y programacion III","6");

		materiasIng.put(algo1.obtenerNombre(),algo1);
		materiasIng.put(algo2.obtenerNombre(),algo2);
		materiasIng.put(algo3.obtenerNombre(),algo3);
		materiasIng.put(fisicaI.obtenerNombre(),fisicaI);
		materiasIng.put(algebraII.obtenerNombre(),algebraII);
		materiasIng.put(analisisII.obtenerNombre(),analisisII);
		materiasIng.put(fisicaII.obtenerNombre(),fisicaII);

		var materiasLic = new HashMap<String, Materia> ();
		materiasLic.put(algo1.obtenerNombre(),algo1);
		materiasLic.put(algo2.obtenerNombre(),algo2);
		materiasLic.put(matDisc.obtenerNombre(),matDisc);
		materiasLic.put(orgComp.obtenerNombre(),orgComp);
		materiasLic.put(algebraII.obtenerNombre(),algebraII);
		materiasLic.put(analisisII.obtenerNombre(),analisisII);


		usuarios.put(usuario.obtenerNombre(),usuario);

		Carrera ingInformatica = new Carrera("Ingenieria en informatica",materiasIng);
		Carrera licSistemas = new Carrera("Lic en sistemas",materiasLic);
		
		this.materias = new HashMap<Carrera,Map<String,Materia>>();
		this.materias.put(ingInformatica,materiasIng);
		this.materias.put(licSistemas,materiasLic);
		carreras.add(ingInformatica);
		carreras.add(licSistemas);
	}

	public void iniciar(){
		System.out.println("\nBienvenido al sistema de FIUBA.");
		this.mostrarOpciones();
		String input = SystemFiuba.getUserInput();
		Usuario user = usuarios.get("Lucas");
		while (!input.equals("4")){


		    if (input.equals("1")){
				user.inscribirseACarrera(this.carreras,this.materias);
			} else if (input.equals("2")){
				user.aprobarMateria();
			} else if (input.equals("3")){
				user.consultarCarrera();
			} else if (!input.equals("4")){
				System.out.println("No es una opcion valida.");
			}
			this.mostrarOpciones();
			input = SystemFiuba.getUserInput();
		}
		System.out.println("Ha salido correctamente del sistema");

	}

	public static String getUserInput(){
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();
		return data; 
	}

	private void mostrarOpciones(){
		System.out.println("\nLas opciones disponibles son: ");
		System.out.println("1 - Inscribirse a una carrera.");
		System.out.println("2 - Marcar una materia como aprobada.");
		System.out.println("3 - Consultar el estado de una carrera.");
		System.out.println("4 - Salir.\n");
	}


}