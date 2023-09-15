package juegoFBC;

import static juegoFBC.Main.pantalla;
import static juegoFBC.Main.teclado;
import static juegoFBC.Main.topeJuego;

public class Jugador {
	private String nombre;

	public Jugador(int numero){
		do {
			pantalla.print("Jugador Nro,  " + numero + ", ingrese su nombre: ");
			nombre = teclado.nextLine();
		} while (nombre.isEmpty());
	}

	public void beber(Barril barril){
		int tope = obtenerTope(barril);
		int cantBeber = decidirCantBeber(tope);
		barril.extraer(cantBeber);
		System.out.println("La cantidad de vasos restante es: " + barril.obtenerCantVasos());
	}
	public String obtenerNombre(){
		return nombre;
	}

	private int obtenerTope(Barril barril){
		int cantVasos = barril.obtenerCantVasos();
		if (cantVasos >= 3){
			return 3;
		}
		return cantVasos;
	}

	private int decidirCantBeber(int tope){
		int cantBeber = obtenerCantBeber(tope);
		while (cantBeber == 0 || cantBeber < 0 || cantBeber > tope){
			cantBeber = obtenerCantBeber(tope);
		}
		return cantBeber;
	}

	private int obtenerCantBeber(int tope){
		pantalla.print(nombre + ", ingrese la cantidad a beber: (max " + tope + ") ");
		String cantBeber = teclado.nextLine();
		int cantidadRes;
		try {
			cantidadRes = Integer.parseInt(cantBeber);
		} catch (Exception ex) {
			cantidadRes = 0;
		} 
		return cantidadRes;
	}
}