/*
 * Mostrar los números del 50 al 300 que sean divisibles entre 7 y 3. 
 */

package Bloque1AR3;

public class Ej1Multiplos_d {

	public static void main(String[] args) {
		for (int i = 50; i <=300;i++) {
			if (i%7==0 && i%3==0) {
				System.out.println(i);
			}
		}

	}

}
