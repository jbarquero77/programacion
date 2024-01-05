/*
 * Generar de forma aleatoria un vector de 30 valores numéricos enteros de 1 a 10
 * pedir al usuario que introduzca un número entero que pueda estar en el vector
 * el programa debe indicar si ha acertado o no. 
 * en caso de que haya acertado, inicará en que posición o posiciones se encuentra el valor
 */


package Arrays;

import java.util.Random;
import java.util.Scanner;

public class EncontrarNumeroEnVector {
	
	public static int []generarAleatorio (int longitud){
		
		int []vector = new int[longitud];
		
		Random ran = new Random();
		
		for (int i=0; i<longitud; i++) {
			vector[i] = ran.nextInt(10);
		}
		
		return vector;
	}
	
	public static void mostrarVector (int []vector) {
		for (int elemento : vector) {
			System.out.print(elemento + " ");
		}
		System.out.println();
	}
	
	public static void verificarNumero (int []vector, int numeroUsuario) {
		boolean acertado = false;
		
		for (int i=0; i<vector.length; i++) {
			if(vector[i] == numeroUsuario) {
				acertado = true;
				System.out.printf("El número %d se encuentra en la posición %d ", numeroUsuario, i);
			}
		}
		
		if (!acertado) {
			System.out.println("El número no se encuentra en el vector");
		}
	}
	
	
	
	public static void main(String[] args) {
		int [] vector = generarAleatorio(10);
		
		//Mostrar el vector
		System.out.println("Vector generado: ");
		mostrarVector (vector);
		
		//Pedir al usuario que introduzca un número
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número entre 0 y 9");
		int numeroUsuario = sc.nextInt();
		
		verificarNumero(vector, numeroUsuario);

	}

}
