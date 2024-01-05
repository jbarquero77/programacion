/*
 * Crea un programa que convierta de grados Celsius (centígrados) a Kelvin y a Fahrenheit:
 *  pedirá al usuario la cantidad de grados centígrados y usará las siguientes tablas de conversión: 
 *  • kelvin = celsius + 273; 
 *  • fahrenheit = celsius x 18 / 10 + 32; 
 *  Emplea ‘System.out.print’ en vez de concatenación ‘+’ para mostrar los datos en la misma línea. 
 */

package Ud1AR;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int gradosC =0;
		System.out.println("Introduce la cantidad de grados Celsius (centígrados) que deseas convertir:");
		gradosC =sc.nextInt();
		int gradosK = gradosC + 273;
		int gradosF = ((gradosC * 18) / 10) +32;
		
		System.out.print (gradosC +" grados Celsius corresponden a: ");
		System.out.print(gradosK +" grados Kelvin, y a ");
		System.out.print(gradosF + " grados Fahrenheit ");

	}

}
