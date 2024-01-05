//Modifica el programa anterior para pedir al usuario que introduzca los números


package ud1Ejercicios;

import java.util.Scanner;

public class Ejercicio2b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario que ingrese 2 números
		
		System.out.println("Escribe el primer número");
		double primerNumero = sc.nextDouble();
		System.out.println("Escribe el segundo número");
		double segundoNumero = sc.nextDouble();
		double resultDivision =(double) primerNumero/segundoNumero;
		
		//Mostramos el resultado de las operaciones
		System.out.println("El valor de la primera variable es "+primerNumero);
		System.out.println("El valor de la segunda variable es "+segundoNumero);
		System.out.println("La suma de las dos variables es "+(primerNumero+segundoNumero));
		System.out.println("La resta de las dos variables es "+(primerNumero-segundoNumero));
		System.out.println("La multiplicación de las dos variables es "+(primerNumero*segundoNumero));
		System.out.println("La división de las dos variables es "+resultDivision);
		
		sc.close();
		

	}

}
