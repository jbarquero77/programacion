/*
 * Programa que calcule el IMC de una persona dado su peso y altura
 * luego, indicar su nivel de peso así:
 * 
 *     IMC			CLASIFICACION
 *  --------------------------------
 *   <18.5       ->     Bajo peso
 * 18.5 - 24.9   ->     Normal
 * 25.0 - 29.9   ->     Sobrepeso
 * 30.0 - 34.9   ->     Obesidad I
 * 35.0 - 39.9   ->     Obesidad II
 * 40.0 - 49.9   ->     Obesidad III
 * 		>50      ->     Obesidad IV
 * 
 * IMC = peso / (estatura * estatura)
 */

package Practicas;

import java.util.Scanner;

public class Ej9CalcularIMC {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double altura =0;
		double peso = 0;
		double IMC =0;
		
		
		System.out.println("Introduce la altura en cm: ");
		altura = sc.nextDouble();
		System.out.println("Introduce el peso en Kg: ");
		peso = sc.nextDouble();
		
		System.out.println("Su nivel de peso es: " + nivelDePeso(calcularIMC(peso,altura)));
		
		
	}
	
	public static double calcularIMC(double peso, double estatura) {
				
		return peso / (estatura * estatura);
				
	}
	public static String nivelDePeso (double IMC) {
		
		if (IMC < 18.5) {
			return "Bajo Peso";
			
		} else if (IMC >= 18.5 && IMC <= 24.9) {
			return "Normal";
		}else if (IMC >= 25 && IMC <= 29.9) {
			return "Sobre Peso";
		}else if (IMC >= 30 && IMC <= 34.9) {
			return "Obesidad I";
		}else if (IMC >= 35 && IMC <= 39.9) {
			return "Obesidad II";
		}else if (IMC >= 40 && IMC <= 49.9) {
			return "Obesidad III";
		}else  {
			return "Obesidad IV";
		}
		
		
	}

}
