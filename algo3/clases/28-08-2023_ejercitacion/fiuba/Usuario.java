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
		
	}

}