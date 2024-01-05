/*Hacer una traza del siguiente programa en Java: */

package EjerciciosAR;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Declaramos las variables x, y, como double
		double x, y;
		
		//Asignamos valores a las variables
		
		x = 5.0;
		
		//La variable y será el resultado de la siguente operación
		//Deberíamos castear la division para un resultado correcto
		
		y = (double) 7/9 * (x + 1);
		
		//Mostramos el resultado
		System.out.println("x = " + x + " y = " + y); 
		
		
	}
}
