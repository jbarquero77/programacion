/*
 *  corredores son capaces de correr mucho más deprisa que los toros. 
 *  para mantener la emoción, no lo hacen. 
 *  Se limitan a mantener una velocidad adecuada para que los toros se mantenga siempre cerca, pero no lleguen a pillarles.

El problema consiste en, dadas las velocidades de todos los toros que participan en los San Fermines (y que se suponen constantes), 
¿a qué velocidad deben ir estos corredores expertos para mantener el espectáculo conservando su integridad?
Entrada

La entrada consta de una serie de casos de prueba, cada uno en una línea. 
El primer número de la misma indica el número de toros que intervienen en la carrera (n ≥ 1). 
A continuación aparece un entero por cada uno de los toros, indicando la velocidad a la que correrá ese toro (recuerda, es velocidad constante). 
La velocidad es siempre positiva y no excede 109.

Salida

Para cada caso mostrará una línea en la que aparecerá la velocidad a la que deberán ir los corredores 
*/

package JuecesOnline;

import java.util.Scanner;

public class SanFermines149 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Primero pedir al usuario el número de toros que intervienen, 
		int toros = sc.nextInt();
		
		// Evaluamos que sea positivo
		while (sc.hasNext()) {
			int velocidad [] = new int [toros];
			int velMax =0;
			
		// después pedir que introduzca la velocidad de cada toro, será un bucle que se repitirá = nº toros, será un número positivo
			for (int i =0; i<toros; i++) {
				velocidad[i] = sc.nextInt();
				if (velocidad[i]> velMax) {
					velMax = velocidad[i];
				}
			}
			// nos mostrará la velocidad máxima
			System.out.println(velMax);			
		}	
	}
}
