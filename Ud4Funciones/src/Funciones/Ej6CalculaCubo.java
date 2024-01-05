/*  Escribe un programa que calcule el cubo de un número real (float) introducido por el usuario.
 *  El resultado debe ser otro número real. 
 *  Implementa y utiliza la función: 
*/

package Funciones;

import java.util.Scanner;

public class Ej6CalculaCubo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Introduce un número: ");
		float num = sc.nextFloat();
		
		float resultado = calculaCubo(num);
		System.out.println("El cubo de: "+num+" es "+resultado);
	
		
	}
	
	public static float calculaCubo(float num) {
		return num*num*num;
	
	}
}
