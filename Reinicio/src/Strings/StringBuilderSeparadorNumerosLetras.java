package Strings;
import java.util.Scanner;
public class StringBuilderSeparadorNumerosLetras {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce una cadena de números y letras: ");
		String cadena = sc.nextLine();
		
		String []separados = separarNumerosLetras (cadena);
		
		System.out.println("Números separados: "+ separados[0]);
		System.out.println("Letras separadas: "+ separados [1]);

	}
	public static String []separarNumerosLetras (String frase){
		StringBuilder numeros = new StringBuilder();
		StringBuilder letras = new StringBuilder();
		
		for (char c : frase.toCharArray()) {
			if(Character.isDigit(c)) {
				numeros.append(c);
			}else if (Character.isLetter(c)) {
				letras.append(c);
			}
		}
		return new String[] {numeros.toString(), letras.toString()};
	}
	

}
