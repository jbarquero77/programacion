/*
 * 

La entrada consta de una serie de casos de prueba, cada uno en una línea. 
El primer número de la misma indica el número de toros que intervienen en la carrera (n ≥ 1). 
A continuación aparece un entero por cada uno de los toros, indicando la velocidad a la que correrá ese toro (recuerda, es velocidad constante). 
La velocidad es siempre positiva y no excede 19

Salida
Para cada caso de prueba se mostrará una línea en la que aparecerá la velocidad a la que deberán ir los corredores expertos para mantener el espectáculo.

 */

package AceptaElReto;

import java.util.Scanner;

public class SanFermines149 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el número de toros");
		int toros = sc.nextInt();
		System.out.println("Introduce la velocidad de los toros");
		int velocidadToros;
		int velMaxima =0;
		
		if (toros >= 0) {
			for (int i =0; i< toros; i++){
				velocidadToros=sc.nextInt();
				if (velocidadToros > velMaxima) {
					velMaxima = velocidadToros;
				}
			}
			
			System.out.print(velMaxima);
		}
	}
}
