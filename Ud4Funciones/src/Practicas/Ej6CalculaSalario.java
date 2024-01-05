/*Calcular el salario de un trabajador que ha tenido un incremento del x%
 * 
 */

package Practicas;

import java.util.Scanner;

public class Ej6CalculaSalario {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double salarioBase;
		double incremento;
		double nuevoSalario;
		
		System.out.println("Cual es el salario base del trabajador?");
		salarioBase = sc.nextDouble();
		System.out.println("Qué porcentaje se le va a aumentar el salario?");
		incremento = sc.nextDouble();
		
		nuevoSalario = calcularIncremento (salarioBase, incremento);
		System.out.println("El nuevo salario es de: "+nuevoSalario);
	}
	public static double calcularIncremento(double salarioBase, double incremento) {
		double nuevoSalario;
		
		nuevoSalario = salarioBase + (salarioBase * (incremento/100));
		return nuevoSalario;
	}
}
