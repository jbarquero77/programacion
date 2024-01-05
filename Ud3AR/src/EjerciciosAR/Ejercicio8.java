/* Escribe un programa que calcule el salario semanal de un empleado en base a
 *  las horas trabajadas, a razón de 12 euros la hora.
 */

package EjerciciosAR;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Pedimos que ingrese el número de horas trabajadas
		System.out.println("Introduce el número de horas trabajadas");
		Scanner sc = new Scanner(System.in);
		double horasTrabajadas = sc.nextDouble();
		double precioHora = 12;
		
		//Realizamos algoritmo
		double salarioSemanal = horasTrabajadas * precioHora;
		
		//Mostramos resultado
		System.out.println("El salario semanal será de "+salarioSemanal+" €");
		

	}

}
