/*
 * Crea un arrayde números de 100 posiciones, que contendrá los números del 1 al 100. Obtén la suma de todos ellos y la media.
 */

package Arrays;

public class Ej2ArrayNumSumaYMedia {

	public static void main(String[] args) {
		
		//Crea array de números del 1 al 100
		int [] numeros = new int [100];
		for (int i =0; i < 100; i++) {
			numeros [i] = i + 1;
		}
		
		// Suma
		int suma =0;
		for (int numero:numeros) {
			suma += numero;
		}
		
		//Calcular media
		double media = (double) suma / numeros.length;
		
		
		System.out.println("Suma " + suma);
		System.out.println("Media " + media);
	}

}
