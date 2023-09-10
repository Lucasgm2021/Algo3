package fiubaCRM;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class SystemFiuba{
	Map<String,Persona> personas;
	Map<String,Alumno> alumnos;
	Map<String,Docente> docentes;

	public SystemFiuba(){
		this.personas = new HashMap<String,Persona>();
		this.alumnos =  new HashMap<String,Alumno>();
		this.docentes = new HashMap<String,Docente>();
	}

	public void iniciar(){
		System.out.println("Bienvenido al sistema de la fiuba.");
		this.mostrarOpciones();
		String input = this.getUserInput();
		while (!input.equals("4")){
		    if (input.equals("1")){
				this.ingresarIntegrante();
			} else if (input.equals("2")){
				this.listarAlumnos();
			} else if (input.equals("3")){
				this.listarDocentes();
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
		System.out.println("1 - Ingresar nuevo integrante FIUBA.");
		System.out.println("2 - Listar alumnos.");
		System.out.println("3 - Listar docentes.");
		System.out.println("4 - Salir.\n");		
	}

	private void ingresarIntegrante(){
		System.out.println("Ingrese el DNI: ");
		String dni = this.getUserInput();
		if (this.personas.containsKey(dni)){
			System.out.println("Ya existe un integrante con ese dni.");
			return;
		}
		System.out.println("Ingrese el nombre: ");
		String nombre = this.getUserInput();

		System.out.println("Ingrese 'a' si es un alumno o 'd' si es un docente: ");
		String tipo = this.getUserInput();

		if ("ad".contains(tipo)&&tipo.length()==1){
			System.out.println("Ingrese el identificador correspondiente: ");
			String id = this.getUserInput();
			if (tipo.equals("a")){
				if (this.alumnos.containsKey(id)){
					System.out.println("Ya existe un alumno con ese padron.");
					return;
				} else {
					Alumno alumno = new Alumno(nombre,dni,id);
					this.alumnos.put(id,alumno);
					this.personas.put(dni,alumno);
					System.out.println("Se ha agregado correctamente el alumno al sistema.");
				}
			} else{
				if (this.docentes.containsKey(id)){
					System.out.println("Ya existe un docente con ese legajo.");
					return;
				} else {
					Docente docente = new Docente(nombre,dni,id);
					this.docentes.put(id,docente);
					this.personas.put(dni,docente);
					System.out.println("Se ha agregado correctamente el docente al sistema.");
				}				
			}

			return;
		}
		System.out.println("No es un tipo valido de integrante.");

	}

	private void listarAlumnos(){
		if (this.alumnos.size()==0){
			System.out.println("No hay alumnos registrados.");
		}
		int i=1;
		for (String alumnoPadron:alumnos.keySet()){
			Alumno alumno = alumnos.get(alumnoPadron);
			System.out.println(i+" - " + alumno.obtenerNombre()+", "+alumno.obtenerDni()+", "+alumno.obtenerPadron()); 
			i+=1;
		}
	}

	private void listarDocentes(){
		if (this.docentes.size()==0){
			System.out.println("No hay docentes registrados.");
		}	
		int i=1;
		for (String legajoDocente:this.docentes.keySet()){
			Docente docente = this.docentes.get(legajoDocente);
			System.out.println(i+" - " + docente.obtenerNombre()+", "+docente.obtenerDni()+", "+docente.obtenerLegajo()); 
			i+=1;
		}	
	}	
}