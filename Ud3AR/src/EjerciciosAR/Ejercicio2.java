/*
 * a partir de una temperatura en grados Celsius (celsius de tipo double) 
 *obtenga su equivalente en grados Fahrenheit (fahrenheit de tipo double),
 *  aplicando la fórmula ºF= (9/5)∗ ºC+32.   */

package EjerciciosAR;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double celsius = sc.nextDouble();
		double fahrenheit = ((double) (9/5)) * (celsius+32);
		
		System.out.println(celsius + " grados Celsius equivalen a "+fahrenheit+ " grados Fahrenheit");
		
		

	}

}
