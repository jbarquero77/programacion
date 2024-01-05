/*
 * 

El programa recibirá, por la entrada estándar, 
un conjunto de casos de prueba, cada uno en una línea. 
Cada caso de prueba estará compuesto de un número de vivienda.
Se garantiza que nunca será mayor que 1.000.

El último caso, que no deberá procesarse, será el número 0.
Salida

Para cada caso de prueba el programa escribirá "IZQUIERDA" (sin las comillas) si la vivienda está situada a la izquierda de la calle, y "DERECHA" si está a la derecha.

 */


package AceptaElReto;

import java.util.Scanner;

public class LadoDeLaCalle217 {
	
	public static boolean esPar(int num) {
		boolean derecha = true;
		
		if ( num%2==0) {
			return true;
			
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int casos=sc.nextInt();
		sc.nextLine();
		
		int numVivienda= sc.nextInt();
		
		while (numVivienda !=0) {
			for (int i =0; i<casos; i++) {
				
				if(esPar(numVivienda)) {
					System.out.println("DERECHA");
					break;
				}else {
					System.out.println("IZQUIERDA");
					break;
				}
			}
			numVivienda=sc.nextInt();
		}
	}

}
