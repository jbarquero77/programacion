/*
 * Realizar un programa que defina un vector llamado “vector_numeros” de 10 enteros
 * , a continuación lo inicialice con valores aleatorios (del 1 al 10) y
 *  posteriormente muestre en pantalla cada elemento del vector junto con su cuadrado y su cubo.
 * 
 */


package PracticandoCicloFor;

import java.util.Random;

public class PracticaJoseDomingoArrays1 {
	
	public static void arrayAleatorios (int[]aleatorios) {
		Random rand = new Random();
		for (int i=0; i<aleatorios.length;i++) {
			aleatorios[i] = rand.nextInt(11);
		}
	}
	
	public static void mostrarCuadradoCubo(int [] vector) {
		
		System.out.printf("%-10s%-10s%-10s\n", "Numero", "Cuadrado", "Cubo");
		
		for (int i =0; i<vector.length; i++) {
			int numero = vector[i];
			double cuadrado = Math.pow(numero, 2);
			double cubo = Math.pow(numero,3);
			
			System.out.printf("%-10d%-10.0f%-10.0f\n", numero, cuadrado, cubo);
        }
	}
	

	public static void main(String[] args) {
		int []numerosAleatorios = new int [10];
		
		arrayAleatorios(numerosAleatorios);
		
		mostrarCuadradoCubo(numerosAleatorios);
	}

}
