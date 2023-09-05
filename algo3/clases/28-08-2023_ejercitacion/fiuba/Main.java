package fiuba;

public class Main {
	public final Usuario user1 = new Usuario("Lucas","123");
	public final Usuario user2 = new Usuario("Pedro","123");

	public static void main(String[] args) {
		SystemFiuba systemFiuba = new SystemFiuba();
		systemFiuba.ejecutar();
	}
}