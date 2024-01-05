/*
 * Mostrar 4 veces los números del 1 al 5 en una misma línea usando bucle for.
 *  Ejemplo de salida: 1234512345123451234512345. 
 */


package Bloque1AR3;

public class Ej1MostrarSerieNumConFor_g {

	public static void main(String[] args) {
		
		for (int i =0; i<4;i++) {
			for (int j=1; j<=5;j++) {
				System.out.print(j);
			}
		}

	}

}
