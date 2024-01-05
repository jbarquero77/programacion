/*  Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que 
 * las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. 
 * A partir de la hora 41, se pagan a 16 euros la hora. */


package Ud3AR;

import java.util.Scanner;

public class SalarioSemanal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int horas = sc.nextInt();
		int horasExtras = horas - 40;
		int precioHora = 12;
		int precioHoraExtra = 16;
		int salario =0;
		
		
		if (horas >0 || horas <40) {
			salario = horas * precioHora;
			System.out.println("Tu salario esta semana es de "+salario+ "€");
		}else if (horas > 40) {
			salario = (horas * precioHora) + (horasExtras * precioHoraExtra);
			System.out.println("Tu salario esta semana es de "+salario+ "€");
		}

	}

}
