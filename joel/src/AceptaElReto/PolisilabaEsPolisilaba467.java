/*
 * Entrada
La entrada comienza con una línea con un número indicando cuántos casos hay que procesar.

Cada caso tiene una frase con el esquema "X es Y" en la que 
tanto X como Y son palabras sin espacios con hasta 20 caracteres del alfabeto inglés.

Salida
Por cada caso de prueba se escribirá TAUTOLOGIA si la frase es una tautología 
(sin distinguir entre mayúsculas y minúsculas) y NO TAUTOLOGIA en caso contrario
 */


package AceptaElReto;

import java.util.Scanner;

public class PolisilabaEsPolisilaba467 {

	/*public static String esTautologia (String frase) {
		
		String [] palabras = frase.split(" ");
		
		String x = palabras[0];
		String y = palabras[2];
		
		if (x.equals(y)) {
			return "TAULOGIA";
		}else {
			return "NO TAULOGIA";
		}				
	}
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int casos = sc.nextInt();
		sc.nextLine();
		
		for (int i =0; i<casos;i++) {
			String frase = sc.nextLine();			
			String [] palabras = frase.split(" ");
			
			String x = palabras[0];
			String y = palabras[2];
					
			if (x.equals(y)) {
					System.out.println("TAULOGIA");
			}else {
					System.out.println("NO TAULOGIA");
			}
		}
	}
}
// naranja es naranja
