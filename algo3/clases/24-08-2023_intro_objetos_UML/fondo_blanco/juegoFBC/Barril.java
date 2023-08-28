package	 juegoFBC;

public class Barril {
	private int cantVasos;

	public Barril(int cantidadVasosInicial){
		cantVasos = cantidadVasosInicial;
	}

	public boolean haySuficienteCerveza(){
		return cantVasos > 1;
	}

	public boolean hayGanador(){
		return cantVasos == 1;
	}

	public boolean hayPerdedor(){
		return cantVasos == 0;
	}

	public void extraer(int cant){
		cantVasos -= cant;
	}

	public int obtenerCantVasos(){
		return cantVasos;
	}

}