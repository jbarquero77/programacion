/*
 * Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media
de los negativos y contar el número de ceros.
 */

package Numeros;

import java.util.Scanner;

public class Bol4Ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numTeclado [] = new int [5];
		int contPositivos =0;
		int contNegativos =0;
		int contCeros =0;
		
		int sumaPositivos=0;
		int sumaNegativos=0;
		
		for (int i =0; i<numTeclado.length;i++) {
			System.out.println("Introduce un número");
			numTeclado[i] = sc.nextInt();
			
			if (numTeclado[i] > 0) {
				contPositivos++;
				sumaPositivos += numTeclado[i];
			}else if (numTeclado[i]<0) {
				contNegativos++;
				sumaNegativos+= numTeclado[i];
			}else {
				contCeros++;
			}
		}
		double mediaPositivos = (sumaPositivos)/contPositivos;
		double mediaNegativos = (sumaNegativos)/contNegativos;
		
		
		System.out.println("La media de los números Positivos es: "+ mediaPositivos);
		System.out.println("La media de los números Negativos es: "+ mediaNegativos);
		System.out.printf("Hay %d números positivos %n", contPositivos);
		System.out.printf("Hay %d números negativos %n", contNegativos);
		System.out.printf("Hay %d ceros", contCeros);
		

	}

}
