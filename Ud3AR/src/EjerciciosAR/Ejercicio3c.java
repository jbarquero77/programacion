/* c) Calcular en una variable v el volumen de una esfera 
a partir del valor de su superficie s (supóngase que es un valor positivo). */

package EjerciciosAR;

import java.util.Scanner;

public class Ejercicio3c {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		double s = sc.nextDouble();
		double PI = 3.1416;
		
		double radio = Math.sqrt(s/(4*PI));
		double v = ((4/3)*PI*Math.pow(radio, 3));
		
		System.out.println("El volumen es "+v);

	}

}
