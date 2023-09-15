package fiuba;

import static fiuba.Main.carreraIng;
import static fiuba.Main.carreraSis;
import java.util.ArrayList;
import java.util.Scanner;


public class Usuario {
	public String nombre;
	public String padron;
	public ArrayList<Carrera> carrerasEnCurso = new ArrayList<Carrera>();

	public Usuario(String nombreUsuario,String padronUsuario){
		nombre = nombreUsuario;
		padron = padronUsuario;
	}

	public void inscribirseCarrera(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa una carrera: ");
		String carrera = scan.nextLine();
		if (carrerasEnCurso.size() >= 2){
			System.out.println("Maxima cantidad de carreras posibles");
			return;
		} 
		
		if (carrerasEnCurso.size() > 0 && carrerasEnCurso.get(0).obtenerNombreCarrera().equals(carrera)) {
			System.out.println("Ya se esta inscripto en la carrera " + carrera  + ".");
			return;			
		} 
	    if (carrera.equals(carreraIng) || carrera.equals(carreraSis)) {
			Carrera carreraCursar = new Carrera(carrera);
			carrerasEnCurso.add(carreraCursar);
			System.out.println("Te has inscribido con exito a " + carrera+".");
			return;
		} 
		System.out.println("No existe esa carrera.");
	}

	public void consultarCarrera(){
		if (carrerasEnCurso.size()<=0){
			System.out.println("No se está cursando ninguna carrera.");
			return;
		}
		System.out.println("Carreras disponibles: ");
		int i = 1;
		for (Carrera carrera:carrerasEnCurso){
			System.out.println(i + " - " + carrera.obtenerNombreCarrera());
			i = i + 1;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa una carrera: ");
		String nCarrera = scan.nextLine();
		if ((nCarrera.equals("1") || nCarrera.equals("2")) && Integer.parseInt(nCarrera) <= carrerasEnCurso.size()){
			int numCarrera = Integer.parseInt(nCarrera) - 1;
			Carrera carrera = carrerasEnCurso.get(numCarrera); 
			carrera.mostrarMateriasAprobadas();
			carrera.mostrarMateriasPorAprobar();
			return;
		}
		System.out.println("No existe esa carrera.");
	}

	public void marcarMateriaAprobada(){
		if (carrerasEnCurso.size()<=0){
			System.out.println("No se está cursando ninguna carrera.");
			return;
		}
		System.out.println("Carreras disponibles: ");
		int i = 1;
		for (Carrera carrera:carrerasEnCurso){
			System.out.println(i + " - " + carrera.obtenerNombreCarrera());
			i = i + 1;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa una carrera: ");
		String nCarrera = scan.nextLine();
		if ((nCarrera.equals("1") || nCarrera.equals("2")) && Integer.parseInt(nCarrera) <= carrerasEnCurso.size()){
			int numCarrera = Integer.parseInt(nCarrera) - 1;
			Carrera carrera = carrerasEnCurso.get(numCarrera); 
			if (carrera.numMateriasPorAprobar()==0){
				System.out.println("Ya estan todas las materias aprobadas, felicidades!");
				return;
			}
			carrera.mostrarMateriasPorAprobar();
			System.out.println("Ingresa una materia: ");
			String nMateria = scan.nextLine();
			if ("123456".contains(nMateria)  && Integer.parseInt(nMateria) <= carrera.numMateriasPorAprobar()){
				int numMateria = Integer.parseInt(nMateria) - 1;
				System.out.println("El numero de materias por aprobar es: " + carrera.numMateriasPorAprobar());
				carrera.marcarAprobada(numMateria);
				System.out.println("Las nuevas materias aprobadas son: ");
				carrera.mostrarMateriasAprobadas();	
				return;			
			}
			System.out.println("No existe esa materia.");
			return;	
		}
		System.out.println("No existe esa carrera.");		
	}

}