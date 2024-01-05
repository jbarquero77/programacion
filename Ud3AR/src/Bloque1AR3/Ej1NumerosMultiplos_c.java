/*
 * Mostrar los números del 1 al 50 que sean múltiplos de 3. 
 */


package Bloque1AR3;

public class Ej1NumerosMultiplos_c {

	public static void main(String[] args) {

		for (int i = 1; i<=50;i++) {
			if (i%3==0) {
				System.out.println(i);
			}
		}

	}

}
