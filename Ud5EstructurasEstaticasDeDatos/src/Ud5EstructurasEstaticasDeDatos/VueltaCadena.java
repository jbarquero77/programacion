//Dada una cadena, darle la vuelta

package Ud5EstructurasEstaticasDeDatos;

import java.util.Scanner;

public class VueltaCadena {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String cadena ; 
		String cadenaGirada ="";
		
		System.out.print("Escribe una cadena: ");
		cadena = sc.nextLine();
		
		int primeraLetra =0;
		int ultimaLetra = cadena.length() -1;
		
		
		for (int i =0; i< cadena.length(); i++) {
			cadenaGirada = cadena.charAt(i) + cadenaGirada;
		}
		System.out.println(cadenaGirada);
		
		
	}
}
