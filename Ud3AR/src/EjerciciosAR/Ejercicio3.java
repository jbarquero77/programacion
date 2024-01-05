/* a) Calcular en una variable s la superficie (4*π*r2) de una esfera
 *  a partir del valor del radio r (supóngase que es un valor positivo).
 */


package EjerciciosAR;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double radio = sc.nextDouble();
		double PI = 3.1416;
		double s = (4*PI*radio*radio);
		
		System.out.println("La superficie es "+s);
		}
	

}
