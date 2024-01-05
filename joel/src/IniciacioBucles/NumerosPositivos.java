/* Implementa un programa que llegeix n números enters i ens diu quants d’ells són positius.
Entrada
La primera línia conté un nombre n que indica el nombre de números a tractar. 
L'entrada continua amb una seqüencia de n nombres a processar. 
Cada nombre es troba en una línia diferent.
Sortida
Indica el total de nombre positius tractats */

package IniciacioBucles;

import java.util.Scanner;

public class NumerosPositivos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		int nPositivos = 0;
				
		while (n > 0) {
			int numero = sc.nextInt();
			if (numero > 0) {
				nPositivos++;
			}
			n--;
		}System.out.println(nPositivos);
		
	}

}
