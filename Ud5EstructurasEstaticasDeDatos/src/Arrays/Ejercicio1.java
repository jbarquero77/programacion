package Arrays;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			Random rand = new Random();
			
			//Declarar un array
			int[] numeros;
			int[] numerosInvertidos;
			
			//Pedir al usuario el tamaño del vector (array)
			System.out.println("Introduce el tamaño del vector:" );
			int n = sc.nextInt();
			
			//Crear vector de tamaño que quiera el usario
			numeros = rellenarVector( n );
			
			//Imprimir el vector con los datos introducidos por el usuario.
			//Se imprimirá la posición del vector y el contenido: "Posición 1: 45”
			imprimirVector( numeros );
			
			//Calcular la suma de todos los elementos del vector
			int suma = sumarElementos( numeros );
			System.out.println("La suma de los elementos del vector es: " + suma);
			
			//Obtener el valor máximo de los elementos del vector
			int max = maximoNumero( numeros );
			System.out.println("El valor máximo de los elementos del vector es: " + max);
			
			//Invertir los valores del vector e imprimir el resultado
			numerosInvertidos = invertirVector( numeros );
			System.out.println("El vector invertido es: ");
			imprimirVector( numerosInvertidos );
	}
	
	public static int[] rellenarVector (int n) {
		
		int[] numeros = new int [n];
		int aleatorio = (int)Math.random();
		
		for (int i =0; i <numeros.length; i++) {
			
		}
		
		return numeros;
		
	}
	
	
	
	public static void imprimirVector (int[] numeros) {
				
		for (int i =0; i<numeros.length; i++) {
			
			System.out.println(numeros[i]);
		}
		
	}
	public static int sumarElementos (int [] numeros) {
		int suma = 0;
		
		for (int i =0; i<numeros.length; i++) {
			suma += numeros[i];
		}
		
		return suma;
	}
	
	public static int maximoNumero (int [] numeros) {
		int max = numeros [0];
		
		
		for (int i =1; i <numeros.length;i++) {
			if (numeros[i] > max) {
				max = numeros[i];
			}
		}
		
		
		return max;
	}
	
	public static int [] invertirVector (int [] n) {
		
		// Copiamos el array
		
		int [] invertida = new int [n.length];
		
		
		for (int i = 0; i < n.length; i++) {
			invertida[i] = n[n.length -i -1];
		}
		return invertida ;
		
	}

}
