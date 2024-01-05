/*
 * haya decidido que los números de la lotería que comprará serán siempre números pares.
 * Entrada
La entrada comienza con una línea que contiene el número de casos de prueba que aparecen a continuación.

Cada caso de prueba, que se compone de dos líneas, 
se corresponde con una administración de lotería. 
La primera línea tiene un único entero con el número de décimos distintos que tiene la administración (como mucho 10.000), 
mientras que la segunda línea contiene la lista con los números de cada décimo (números entre 0 y 99.999).

Salida
Por cada caso de prueba aparecerá una línea independiente con el número de décimos que la peña podría comprar 
de esa administración.

Entrada de ejemplo
1
10
1 2 3 4 5 6 7 8 9 10
Salida de ejemplo
 
5

 */

package AceptaElReto;

import java.util.Scanner;

public class LoteriaAtletica219 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int pares =0;
		int casos = sc.nextInt();
		int numeros=0;
		
		for (int i =0; i< casos; i++) {
			numeros = sc.nextInt();
			if (numeros%2==0) {
				pares++;
			}
			System.out.println(pares);
			pares=0;
		}		
	}
}
