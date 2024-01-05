/*   Anem a fer operacions matemàtiques.
 * Donat un nombre enter n >= 0 calcula el seu factorial (n!). Ajuda : si n> 2 , n! = n (n-1) (n-2) …. 1 0! = 1 i 1! = 1

Entrada
La primera línia indica els casos de prova a considerar Cada cas compta amb 1 linea amb un número enter positiu

Sortida
Per cada cas de prova caldrà mostrar el resultat de n! */

package IniciacioBucles;

import java.util.Scanner;

public class CalcularFacotorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		for (long contador = sc.nextInt(); contador > 0;contador--) {
			long nFactorial = sc.nextInt();
			long resultado =1;
			
			while (nFactorial >0) {
				resultado = resultado * nFactorial;
				nFactorial--;
			}
			System.out.println(resultado);
		}
		
	}
}
