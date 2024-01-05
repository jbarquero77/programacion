/*Dadas dos variables numéricas A y B, que el usuario debe teclear, 
 *se pide realizar un algoritmo que intercambie los valores de ambas variables y
muestre por pantalla cuanto valen al final las dos variables.*/



package ud1Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca las variables
		
		System.out.println("Escribe el valor de A");
		double A = sc.nextDouble();
		System.out.println("Escribe el valor de B");
		double B = sc.nextDouble();
		
		//Realizamos el algoritmo para intercambiar los valores
		//Primero guardamos el valor de A en una variable temporal
		
		double temp = A;
		A= B;
		B = temp;
		
		//Mostramos el resultado
		System.out.println("La primera variable A, ahora vale: " + A);
        System.out.println("Y B ahora vale: " + B);

        sc.close();
		
	}

}
