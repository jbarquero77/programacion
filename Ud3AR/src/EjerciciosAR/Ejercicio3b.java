/* b) Calcular en una variable v el volumen (4/3*π*r3) de una esfera
 a partir del valor del radio (supóngase que es un valor positivo). */

package EjerciciosAR;

import java.util.Scanner;

public class Ejercicio3b {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double radio = sc.nextDouble();
		double PI = 3.1416;
		//double v = (4/3*PI*radio*radio*radio);
		
		//utilizando Math
		double v = ((4/3)*Math.PI*Math.pow(radio,3));
		System.out.println("El volumen es "+v);
		

	}

}
