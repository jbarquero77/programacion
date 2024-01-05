/* calcular el volumen de un cono según la fórmula v= 1/3 πr2h */

package EjerciciosAR;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Pedimos que introduzca el valor del radio
		System.out.println("Introduce el valor del radio");
		
		Scanner sc = new Scanner(System.in);
		double radio = sc.nextDouble();
		double PI = 3.1416;
		
		//Calculamos el volumen
		double v = ((1/3)*PI*Math.pow(radio, 2));
		
		System.out.println("El volumen del cono es "+ v);
		


	}

}
