/*
 * Mostrar los números pares del 20 al 100, excepto los que sean múltiplos de 10, usando continue.
 */

package BreakContinua;

public class Ej3cMostrarParesMenosMultiplos {

	public static void main(String[] args) {
		for (int i = 20; i <= 100; i+=2) {
			
			if (i%10==0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
