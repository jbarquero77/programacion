package Arrays;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArraysOrdenarPalabrasVocales {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una serie de palabras separadas por espacios: ");
		String usuario = sc.nextLine();
		
		String palabras[]= usuario.split(" ");
		Arrays.sort(palabras, Comparator.comparingInt(ArraysOrdenarPalabrasVocales::contarVocales));
		
		System.out.println("Palabras ordenads por cantidad de vocales: ");
		for(String palabra : palabras) {
			System.out.println(palabra);
		}
	}
	
	public static int contarVocales(String palabra) {
		return(int)palabra.toLowerCase().chars().filter(c->"aeiou".indexOf(c)!= -1).count();
	}

}
