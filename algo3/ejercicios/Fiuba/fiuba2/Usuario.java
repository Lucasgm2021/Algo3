package fiuba2;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Usuario{
	private String nombre;
	private String padron;
	private List<Carrera> carrerasCursando;
	private final Map<Carrera, ArrayList<Materia>> materiasAprobadas;
	private final Map<Carrera, ArrayList<Materia>> materiasPorAprobar;

	public Usuario (String nombre, String padron){
		this.nombre = nombre;
		this.padron = padron;
		this.carrerasCursando = new ArrayList<Carrera>();
		this.materiasAprobadas = new HashMap<Carrera, ArrayList<Materia>>();
		this.materiasPorAprobar = new HashMap<Carrera, ArrayList<Materia>>();
	}
	
	public String obtenerNombre(){
		return this.nombre;
	}

	public void inscribirseACarrera(List<Carrera> carrerasDisponibles,Map<Carrera,Map<String, Materia>> materiasPorCarrera){
		if (carrerasDisponibles.size()==this.carrerasCursando.size()){
			System.out.println("No hay mas carreras disponibles.");
		}

		int inputCarrera = this.seleccionarCarrera(carrerasDisponibles);
		if (inputCarrera == -1){
			System.out.println("Esa no es una carrera valida.");
			return;
		}
		Carrera carreraSeleccionada = carrerasDisponibles.get(inputCarrera);
		for (Carrera carreraActual:this.carrerasCursando){
			if (carreraActual==carreraSeleccionada){
				System.out.println("Ya esta inscripto en esa carrera.");
				return;
			}	
		}
		this.carrerasCursando.add(carreraSeleccionada);
		var materiasCursar = new ArrayList<Materia>(materiasPorCarrera.get(carreraSeleccionada).values());
		this.materiasPorAprobar.put(carreraSeleccionada,materiasCursar);
		this.materiasAprobadas.put(carreraSeleccionada,new ArrayList<Materia>());
		System.out.println("Te has inscrito satisfactoriamente a: " + carreraSeleccionada.obtenerNombre());
	}

	public void aprobarMateria(){
		if (this.carrerasCursando.size()==0){
			System.out.println("No se está cursando ninguna carrera actualmente.");
			return;
		}
		int inputCarrera = this.seleccionarCarrera(this.carrerasCursando);
		if (inputCarrera == -1){
			System.out.println("Esa no es una carrera valida.");
			return;
		}
		Carrera carreraSeleccionada = this.carrerasCursando.get(inputCarrera);
		ArrayList<Materia> materiasAprobar = this.materiasPorAprobar.get(carreraSeleccionada);
		if (materiasAprobar.size()==0){
			System.out.println("No hay mas materias por aprobar, felicidades.");
			return;
		}
		int inputMateria = this.seleccionarMateria(materiasAprobar);
		if (inputMateria==-1){
			System.out.println("Esa no es una materia valida.");
			return;
		}
		Materia materiaSeleccionada = materiasAprobar.get(inputMateria);
		ArrayList<Materia> materiasAprobadas = this.materiasAprobadas.get(carreraSeleccionada);
		for (Materia materiaAprobada:materiasAprobadas){
			if (materiaAprobada==materiaSeleccionada){
				System.out.println("Esa materia ya fue aprobada.");
				return;
			}
		}
	
		this.materiasPorAprobar.get(carreraSeleccionada).remove(materiaSeleccionada);
		this.materiasAprobadas.get(carreraSeleccionada).add(materiaSeleccionada);
		System.out.println("La materia fue aprobada correctamente.");
	}

	public void consultarCarrera(){
		if (this.carrerasCursando.size()==0){
			System.out.println("No se está cursando ninguna carrera actualmente.");
			return;
		}
		int inputCarrera = this.seleccionarCarrera(this.carrerasCursando);
		if (inputCarrera == -1){
			System.out.println("Esa no es una carrera valida.");
			return;
		}
		Carrera carreraSeleccionada = this.carrerasCursando.get(inputCarrera);
		System.out.println("Materias por aprobar: ");
		if (this.materiasPorAprobar.get(carreraSeleccionada).size()==0){
			System.out.println("\nNo hay materias pendientes.");
		} else {
			int i = 1;
			for (Materia materia:this.materiasPorAprobar.get(carreraSeleccionada)){
				System.out.println(i + " - " + materia.obtenerNombre());
				i+=1;
			}
		}		
		System.out.println("\n----------------\n");
		System.out.println("Materias aprobadas: ");
		if (this.materiasAprobadas.get(carreraSeleccionada).size()==0){
			System.out.println("\nNo hay materias aprobadas.");
		} else {
			int i = 1;
			for (Materia materia:this.materiasAprobadas.get(carreraSeleccionada)){
				System.out.println(i + " - " + materia.obtenerNombre());
				i+=1;
			}
		}
	}


	private int seleccionarCarrera(List<Carrera> carreras){
		int i = 1;
		System.out.println("Seleccione una carrera: ");
		for (Carrera carrera:carreras){
			System.out.println(i + " - " + carrera.obtenerNombre());
			i+=1;
		}

		String input = SystemFiuba.getUserInput();
		int inputCarrera;
		try {
			inputCarrera = Integer.parseInt(input);
		} catch (Exception ex) {	
			inputCarrera = -1;
		} 

		if (inputCarrera <= 0 || inputCarrera > carreras.size()){
			inputCarrera = -1;
		} else {
			inputCarrera-=1;
		}
		return inputCarrera; 		
	}

	private int seleccionarMateria(ArrayList<Materia> materias){
		int i = 1;
		System.out.println("Seleccione una materia: ");
		for (Materia materia:materias){
			System.out.println(i + " - " + materia.obtenerNombre());
			i+=1;
		}

		String input = SystemFiuba.getUserInput();
		int inputMateria;
		try {
			inputMateria = Integer.parseInt(input);
		} catch (Exception ex) {	
			inputMateria = 0;
		} 

		if (inputMateria <= 0 || inputMateria > materias.size()){
			inputMateria = -1;
		} else {
			inputMateria-=1;
		}
		return inputMateria; 		
	}
}