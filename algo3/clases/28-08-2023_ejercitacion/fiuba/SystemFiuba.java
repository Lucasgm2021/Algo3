package fiuba;

import java.util.Scanner;

public class SystemFiuba {
	Usuario user;


	public SystemFiuba(){
		System.out.println("Bienvenido a la aplicacion de la UBA");		
		user = new Usuario("Lucas","106830");
	}

	public void ejecutar(){
		String input = "";
		Scanner scan= new Scanner(System.in);
		while (input != "4") {
			mostrarOpciones();
			input = scan.nextLine();
			switch(input){
				case "1":System.out.println("Opcion 1");
				user.inscribirseCarrera();
				break;
				case "2":System.out.println("Opcion 2");
				//user.marcarMateriaAprobada();
				break;
				case "3":System.out.println("Opcion 3");
				//user.consultarCarrera();
				break;
				case "4":System.out.println("Ha cerrado con exito la aplicación");
				return;  
				case "5":System.out.println(user.nombre + user.padron);
				break;  
				default: System.out.println("No existe ese ingreso, favor de volver a ingresar");
				break;
			}
		}
	}

	public static void mostrarOpciones(){
		String[] opciones = {"1 - Inscribirse a una carrera.","2 - Marcar materia como aprobada.","3 - Consultar el estado de una carrera.","4 - Salir."};
		for (int i =0;i<opciones.length;i++){
			System.out.println(opciones[i]);
		}	
	}
}