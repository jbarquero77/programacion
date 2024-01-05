/* Contruye un programa que, a partir de recibir N números naturales, determine cuantosde ellos son positivos, negativos o nulos.
 * Si el usuario escribe un número incorrecto, el programa no se ejecuta, pregunta de nuevo por la información hasta que el dato sea correcto.
 * 
 */

package PracticandoCicloFor;

import java.util.Scanner;

public class EvaluaNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numAnalizar;
		int numNatural;
		
		int positivo =0;
		int negativo =0;
		int cero =0;
		
		while(true) {
			System.out.println("Ingresa la cantidad de números que quieres analizar");
			numAnalizar = sc.nextInt();
	
			if (numAnalizar > 0) {
	
				for (int i = 1; i <= numAnalizar; i++) {
					System.out.println("Ingresa un número natural");
					numNatural = sc.nextInt();
	
					if (numNatural > 0) {
						System.out.println("Positivo");
						positivo++;
					} else if (numNatural < 0) {
						System.out.println("Es negativo");
						negativo++;
					} else {
						System.out.println("Nulo");
						cero++;
					}
	
				}
				System.out.println("La cantidad de positivos es: " + positivo);
				System.out.println("La cantidad de negativos es: " + negativo);
				System.out.println("La cantidad de nulos es: " + cero);
	
				{
					break;
				}
	
			} else {
				System.out.println("El número introducido no es correcto");
			}
		}
	}

}
