/*
 * Realiza un programa que calcule el máximo, el mínimo y la media 
 * de una serie de números enteros positivos introducidos por teclado.
 * El programa terminará cuando el usuario introduzca el -1.
 * Este último número no se tendrá en cuenta en los cálculos.
 * El programa debe indicar también cuántos números ha introducido el usuario. 
 * Ejemplo de ejecución: Introduce números enteros positivos (o -1 para terminar):
 *  2
 *  5
 *  25
 *  13
 *  21 
 *  Has introducido: 5 números 
 *  Máximo: 25 
 *  Mínimo: 2 
 *  Media: 13,2 
 */


package EjerciciosAR;

import java.util.Scanner;

public class Ej4Ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num =0;
		
		int max = Integer.MIN_VALUE;;
		int min = Integer.MAX_VALUE;
		int contador =0;
		int suma =0;
		
		
		
		while (num != -1) {
			num = sc.nextInt();
			
			if (num == -1) {
				break;
			}
			suma += num;
			contador++;
			
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}
		
		if (contador > 0) {
			double media = (double)suma/contador;
			
			System.out.println("Has introducido "+ contador+ " números");
			System.out.println("El número máximo es: "+max);
			System.out.println("El número mínimo es: "+ min);
			System.out.println("La media de los "+ contador + " números es: "+media);
			
		}else {
			System.out.println("No has introducido ningún número");
		}
		
		

	}

}
