package Strings;
import java.util.Scanner;
public class StringContarVocales {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce una palabra");
		String palabra = sc.nextLine();
		
		int contadorVocales = contarVocales(palabra);
		
		System.out.println("La palabra "+ palabra+ " tiene "+ contadorVocales+ " vocales.");

	}
	
	public static int contarVocales (String palabra) {
		int contador =0;
		for (char c : palabra.toLowerCase().toCharArray()) {
			if (c == 'a' || c=='e' || c=='i' || c== 'o'  || c== 'u') {
				contador++;
			}
		}
		return contador;
		
	}

}
