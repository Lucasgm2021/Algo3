import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class pruebas {
	public static void main(String[] args) {
		//System.out.println("Hola mundo!");
		//String text = evaluarStdin();
		//System.out.println(text.equals("Lucas"));
		//mostrarDefaults();
		/*
		System.out.println(2.1 + " holaxd " + true);

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("El numero ingresado es: " + num);
		String texto = scan.nextLine();//This is for cleaning the previuos user input of \n to prevent the next line to have an unexpected behaviour.
		String texto = scan.nextLine();
		System.out.println("El texto ingresado es: " + texto);*/
		//System.out.println(Math.max(9,11) + " " + Math.sqrt(10) + " " + Math.ceil(4.5) + " " + Math.floor(4.5) + " " Math.round(4.5518765));
		/*Random rand = new Random();

		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt(6)); //random between 0 and 5
		System.out.println(rand.nextDouble()); //random double between 0 and 1
		*/
		//swtichStatemos();
		//whileExample();
		//forExample();
		//arrayExample();
		//stringClass();
		/*
		boolean bool1 = true;
		Boolean bool2 = true;
		int num1 =2;
		Integer num2 = 2;
		//Double - double, Character - char
		System.out.println("Pruebas" + 2 + 2);*/
		//ArrayListExample2D();
		//forEachExample();
		//printF();
		//dictionaries();
		sets();
	}


	public static String evaluarStdin(){
		java.util.Scanner scn = new java.util.Scanner(System.in);
		java.io.PrintStream pantalla = new java.io.PrintStream(System.out);

		pantalla.print("Pruebas de ingreso de entrada estandar:\n");
		String nombre = scn.nextLine();
		return nombre;
	}


	public static void mostrarDefaults(){
		int num;
		String text;
		boolean bool;
		float num2;
		//System.out.println("Los valores por defecto son: " + num + text+bool+num2);
	}

	public static void ifStatements(){
		int age = 22;
		if (age<20){
			System.out.println("La edad es menor que 20");
		}  else if (age > 60) {
			System.out.println("La edad es mayor que 60");
		} else {
			System.out.println("La edad esta entre 20 y 60");
		}
	}

	public static void swtichStatemos(){
		String day = "Pizza";
		switch (day){
			case "Monday": System.out.println("Today is monday!");
			break;
			case "Tuesday": System.out.println("Today is Tuesday!");
			break;
			case "Wednesday": System.out.println("Today is Wednesday!");
			break;
			case "Thursday": System.out.println("Today is Thursday!");
			break;
			case "Friday": System.out.println("Today is Friday!");
			break;
			case "Saturday": System.out.println("Today is Saturday!");
			break;
			case "Sunday": System.out.println("Today is Sunday!");
			break;
			default: System.out.println("That is not a day!");
		}

	}

	public static void whileExample(){
		Scanner scan = new Scanner(System.in);

		String name = scan.nextLine();
		while (!name.isBlank()){
			System.out.println("No es vacio");
			name = scan.nextLine();
		}
	}

	public static void forExample(){
		for (int i=0;i<10;i++){
			System.out.println(i);
		}
	}

	public static void arrayExample(){
		String[] listaString = {"Texto1","Texto2","Texto3"}; //no es modificable
		System.out.println(listaString[0] + listaString[2]);
		System.out.println(listaString);
		String[] nombres = new String[3];
		System.out.println(nombres[2]);
		for (int i = 0;i<nombres.length;i++){
			System.out.println(nombres[i]);
		}
		//System.out.println(listaString[3] + listaString[2]);

	}

	public static void stringClass(){
		String texto = "hola";
		System.out.println(texto.equals("Prueba")); //false
		System.out.println(texto.length());
		System.out.println(texto.isEmpty() + " "+ texto.charAt(3) + " " + texto.indexOf("l"));
		texto = "  pruebas texTo  ";
		System.out.println(texto.toUpperCase() + " - "+texto.trim() + " " + texto.trim().length());
	}

	public static void ArrayListExample(){


		ArrayList<String> food = new ArrayList<String>();
		food.add("pizza");
		food.add("bread");
		food.add("soup");

		for (int i=0;i<food.size();i++){
			System.out.println(food.get(i));
		}
		food.set(0,"hamburger");
		food.remove(2);

		for (int i=0;i<food.size();i++){
			System.out.println(food.get(i));
		}
		food.clear();
		System.out.println(food.size());	
	}
	
	public static void ArrayListExample2D(){
		ArrayList<String> listaPanaderia = new ArrayList<String>();
		listaPanaderia.add("pan");
		listaPanaderia.add("facturas");
		listaPanaderia.add("confites");

		ArrayList<String> listaLiu = new ArrayList<String>();
		listaLiu.add("papel");
		listaLiu.add("galletitas");
		listaLiu.add("cafe");

		ArrayList<String> libreria = new ArrayList<String>();
		libreria.add("lapiz");
		libreria.add("lapicera");
		libreria.add("goma");

		ArrayList<ArrayList<String>> listas = new ArrayList<ArrayList<String>>();  
		listas.add(listaPanaderia);
		listas.add(listaLiu);
		listas.add(libreria);

		for (int i = 0; i < listas.size();i++){
			for (int j =0;j<listas.get(i).size();j++){
				System.out.println(listas.get(i).get(j));
			}
			System.out.println(listas.get(i));
		}
	}

	public static void forEachExample(){
		ArrayList<String> food = new ArrayList<String>();
		food.add("pizza");
		food.add("bread");
		food.add("soup");

		String[] animals = {"Cat","Dog","Bird"};
		for (String i:animals){
			System.out.println(i);
		}

		for(String i:food){
			System.out.println(i);
		}
	}

	public static void printF(){
		System.out.printf("%d This is a format\n",123);
		System.out.printf("%,.2f",-1684848623156.6518489169);
		System.out.printf("%+,.2f",1684848623156.6518489169);
	}

	public static void dictionaries(){
		HashMap<String, Integer> dict = new HashMap<String, Integer>();
		//Map<String, Integer> dict2 = new Map<String, Integer>(); //interface from different implementations
		dict.put("John",123);
		dict.put("Lucas",456);
		dict.put("Pedro",789);
		System.out.println(dict);
		System.out.println(dict.get("John"));
		System.out.println(dict.get("Pedro"));
		System.out.println(dict.containsKey("John"));
		System.out.println(dict.containsValue(789));
		dict.put("John",dict.get("John")+111);
		System.out.println(dict.get("John"));
		dict.replace("PEdro",1235);//Si no existe la clave, no hace nada. INTERESANTE. Igual no lo usaria prefiero evaluar.
	}

	public static void sets(){
		HashSet<String> setImp = new HashSet<String>();
		setImp.add("prueba");
		setImp.add("names");
		setImp.add("prueba");
		setImp.add("Leon");
		setImp.add("tigre");
		System.out.println(setImp); 
		setImp.remove("tigre");
		System.out.println(setImp);
		System.out.println(setImp.size());
		System.out.println(setImp.contains("Leon")==false);
		System.out.println(setImp.isEmpty());

		for (String elem:setImp) {
			System.out.println(elem);
		}
	}
}