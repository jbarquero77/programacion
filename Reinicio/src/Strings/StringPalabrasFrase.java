package Strings;
import java.util.Scanner;
public class StringPalabrasFrase {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce una frase: ");
		String frase = sc.nextLine();
		
		int contadorPalabras = contarPalabrasFrase(frase);
		System.out.println("Esta frase tiene "+ contadorPalabras+ " palabras.");

	}
	
	public static int contarPalabrasFrase (String frase) {
		String[]palabras = frase.trim().split(" ");
		return palabras.length;
	}

}
