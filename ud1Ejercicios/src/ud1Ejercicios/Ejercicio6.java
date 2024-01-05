//Escribir un programa que ejecute una instrucción en Java tal que, suponiendo que las variables x, y, z son de tipo double, asigne a z el valor que indica la fórmula:


package ud1Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Pedimos al usuario que introduzca los valores x e y
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el valor de x");
		double x = sc.nextDouble();
		System.out.println("Introduce el valor de y");
		double y = sc.nextDouble();
		
		//Realizamos la operación
		double z = (1+(x*x/y))/((x*x*x)/(1+y));
		
		//Mostramos el resultado por pantalla
		System.out.println("El resultado de la operación es "+ z);
		
		
				
	
		
		
		

	}

}
