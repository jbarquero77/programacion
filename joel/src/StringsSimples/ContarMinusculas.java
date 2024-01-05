/*
 * Fes un programa que donada una String et digui quantes lletres minúscules hi ha. 
 * 
Entrada
La primera línia indica els casos de prova a considerar. 
Cada cas de prova compta amb una línea, escrita únicament amb lletres de l'alfabet

Sortida
Per cada cas de prova, s'escriurà quantes lletres minúscules hi ha
 */


package StringsSimples;

import java.util.Scanner;

public class ContarMinusculas {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el número de palabras a comprobar: ");
		
		int casosPrueba = Integer.parseInt(sc.nextLine());
		
		String palabraUsuario ="";
		
		
		for (int i =0; i< casosPrueba; i++) {
			palabraUsuario = sc.nextLine();
			
			int countMinusculas = contarMinusculas(palabraUsuario);
			
			System.out.println(countMinusculas);
			
		}
		
	
	}
	
	public static int contarMinusculas (String cadena) {
		int contadorMinusculas =0;
		
		for (int j = 0; j <cadena.length(); j++) {
			if (Character.isLowerCase(cadena.charAt(j))) {
				contadorMinusculas++;
			}
			
		}
		return contadorMinusculas;
	}

}
