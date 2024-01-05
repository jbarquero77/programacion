package ManipularCadenas;

public class Ej1Strings {

	public static void main(String[] args) {
		
		String nombre = "Jose";
		
		int tamanioNombre = nombre.length();
		
		char letraPosicion = nombre.charAt(0);
		
		
		//El nombre: Jose tiene 4 letras, y la primera letra es: J
		System.out.println("El nombre: "+ nombre + " tiene "+ tamanioNombre + " letras, y la primera letra es: "+letraPosicion);
		
		int ultimaLetra;
		ultimaLetra = nombre.length()-1;
		
		// La última letra es: e
		System.out.println("La última letra es: "+ nombre.charAt(ultimaLetra));
		
		String frase = "Hoy hace un buen día";
		
		
		// Muestrame los caracteres que estan entre la posición 1 y la 3, nos muestra "oy", corta antes del último parámetro
		String cadenaElegida = frase.substring(1, 3);
		System.out.println(cadenaElegida);
		
		
		
	}

}
