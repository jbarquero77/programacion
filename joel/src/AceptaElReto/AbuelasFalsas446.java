/*
 * Si la mujer sólo ha dicho el nombre del nieto al final de la lista de nombres se considera que es una abuela verdadera,
 *  en caso contrario es una falsa abuela.

Entrada
La entrada comienza por el número N de pruebas realizadas a distintas personas mayores.

Cada una de esas pruebas ocupa una única línea. Comienza con el nombre real del nieto de la foto.
 A continuación viene un número positivo que indica la cantidad de nombres que dijo la abuela en cuestión (como mucho 100), al que le sigue cada uno de esos nombres.

Para evitar confusiones, tanto el nombre real como los nombres dichos por las abuelas aparecerán siempre en minúsculas 
y no contendrán espacios ni tildes o eñes. La longitud de cada nombre no excederá los 10 caracteres.

Salida
Por cada prueba se escribirá una única línea con la cadena VERDADERA si la persona encuestada es una abuela real
 y FALSA si es una farsante.

Entrada de ejemplo
3
mireia 5 ximo vicente maria vicente mireia
juan 2 juan maria
ximo 1 ximo
Salida de ejemplo
 
VERDADERA
FALSA
FALSA
 */


package AceptaElReto;

import java.util.Scanner;

public class AbuelasFalsas446 {

		public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int casos = sc.nextInt();
		sc.nextLine();
		
		for (int i =0; i<casos; i++) {
			String nombre = sc.next();
			int nombres = sc.nextInt();
			sc.nextLine();
			
			String []arrayNombres = new String [nombres];
			
			for (int j=0; j < nombres; j++) {
				arrayNombres[j] = sc.next();
			}
			
			boolean esVerdadera = false;
			
			for(int j =0;j<nombres;j++) {	
				if (arrayNombres[j].equals(nombre)) {
					esVerdadera=true;
					break;
				}
			}
			if(esVerdadera) {
				System.out.println("VERDADERA");
			}else {
				System.out.println("FALSA");
			}
		}
	}

}
