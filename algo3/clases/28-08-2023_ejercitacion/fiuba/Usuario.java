package fiuba;

import static fiuba.Main.user1;
import static fiuba.Main.user2;
import java.util.ArrayList;


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
		} else if (carrerasEnCurso.get(0).nombreCarrera().equals(carrera)) {
			System.out.println("Ya se esta inscripto en la carrera " + carrera  + ".");
			return;			
		} else if (carrera.equals(carreraIng) || carrera.equals(carreraSis)) {
			Carrera carreraCursar = new Carrera(carrera);
			carrerasEnCurso.add(carreraCursar);
		} else {
			System.out.println("No existe esa carrera.");
		}
	}
}