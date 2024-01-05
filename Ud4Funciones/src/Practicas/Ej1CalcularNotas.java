/* Promara que toma las tres notas del estudiante y diga la nota final del curso.
 * tenga en cuenta que la primera y segunda nota valen el 30% de la nota final.
 * la tercera nota vale el 40;
 */

package Practicas;

import java.util.Scanner;

public class Ej1CalcularNotas {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escribe la primera nota: ");
		double nota1 = sc.nextDouble();
		System.out.println("Escribe la segunda nota: ");
		double nota2 = sc.nextDouble();
		System.out.println("Escribe la tercera nota: ");
		double nota3 = sc.nextDouble();
		
		double notaFinal = calcularNota(nota1, nota2, nota3);
		
		System.out.println("La nota final es: "+notaFinal);
	}
	
	public static double calcularNota(double n1, double n2, double n3) {
		return (n1*0.3)+(n2*0.3)+(n3*0.4);
	}
	

}
