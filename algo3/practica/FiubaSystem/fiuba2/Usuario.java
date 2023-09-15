package fiuba2;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Usuario{
	private String nombre;
	private String padron;
	private List<Carrera> carreras;
	private final Map<Carrera, ArrayList<Materia>> materiasAprobadas;
	private final Map<Carrera, ArrayList<Materia>> materiasPorAprobar;

	public Usuario (String nombre, String padron){
		this.nombre = nombre;
		this.padron = padron;
		this.carreras = new ArrayList<Carrera>();
		this.materiasAprobadas = new HashMap<Carrera, ArrayList<Materia>>();
		this.materiasPorAprobar = new HashMap<Carrera, ArrayList<Materia>>();
	}
	
	public String[] obtenerInfo(){
		String[] datos = {this.nombre,this.padron};
		return datos;
	}

	public void inscribirseACarrera(List<Carrera> carreras){
		System.out.println("Elija una carrera");
		
		int i= 1;
		for (Carrera carrera:carreras){
			System.out.println(i +" - " +carrera.obtenerNombre());
		}
		Scanner scan = new Scanner();
		String input = scan.nextLine();
		int inputCarrera;
		try {
			inputCarrera = Integer.parseInt(input);
		} catch (Exception ex) {	
			inputCarrera = -1;
		} 
		if (inputCarrera >=0 && inputCarrera < carreras.size()){
			Carrera carrera = carreras.get(inputCarrera); 
		} else {
			System.out.println("Esa no es una carrera valida");
			break;
		} 

		for (Carrera iCarreraInsc:this.carreras){
			if (iCarreraInsc==carrera){
				System.out.println("Ya se esta inscripto en esa carrera.");
				return;
			}	
		}
		this.carreras.add(carrera);
	}
}