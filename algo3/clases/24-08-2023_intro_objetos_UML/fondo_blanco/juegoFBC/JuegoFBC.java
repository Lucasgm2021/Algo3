package juegoFBC;


public class JuegoFBC {
	private Jugador jugador1;
	private Jugador jugador2;
	private Barril barril;

	public JuegoFBC (int cantidadVasos){
		barril = new Barril(cantidadVasos);
		jugador1 = new Jugador(1);
		jugador2 = new Jugador(2);
	}

	public void jugar() {
		while (barril.haySuficienteCerveza()) {
			jugador1.beber(barril);
			if (barril.hayGanador()) {
				System.out.println("El ganador es: " + jugador1.obtenerNombre());
				break;
			} else if (barril.hayPerdedor()) {
				System.out.println("El ganador es: " + jugador2.obtenerNombre());
				break;				
			}
			jugador2.beber(barril);
			if (barril.hayGanador()) {
				System.out.println("El ganador es: " + jugador2.obtenerNombre());
				break;
			} else if (barril.hayPerdedor()) {
				System.out.println("El ganador es: " + jugador1.obtenerNombre());
				break;				
			}			
		}
		System.out.println("El juego ha terminado!");
	}

}