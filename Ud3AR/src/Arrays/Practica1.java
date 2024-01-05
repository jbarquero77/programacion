/*
 * Introducir un vector de 30 enteros y obtener el número de pares y el número de impares
 */

package Arrays;

import java.util.Random;

public class Practica1 {
	
	public static void aleatorios (int [] numeros) {
		Random rand = new Random();
				
		for (int i=0; i < numeros.length; i++) {
			numeros[i] = (int)rand.nextInt(31);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		int []vector = new int [30];
		int contadorPares =0;
		int contadorImpares =0;
		int sumaPares =0;
		
		aleatorios(vector);
		for (int i=0; i<vector.length;i++) {
			System.out.print(vector[i]+ " ");
		}
		
		for (int i =0; i<vector.length; i++) {
			if (vector[i] %2 == 0) {
				contadorPares++;
				sumaPares += vector[i];
			}else {
				contadorImpares++;
			}
		}
		System.out.printf("\nEl vector contine %d numeros pares y %d numeros impares", contadorPares, contadorImpares);
		System.out.printf("\nLa suma de los números pares del vector es %d", sumaPares);
		
	}

}
