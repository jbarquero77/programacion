/*
 * Mostrar 4 veces los números del 1 al 5 en una misma línea usando bucle while. Ejemplo de salida: 1234512345123451234512345. 
 */


package Bloque1AR3;

public class Ej1MostrarNumEnLineaWhile {

	public static void main(String[] args) {
		
		int contadorVeces = 0;
				
		while (contadorVeces <= 4) {
			
			int contadorNumero =1;
			
			while (contadorNumero <= 5) {
				System.out.print(contadorNumero);
				contadorNumero++;
			}
			contadorVeces++;
			
		}

	}

}
