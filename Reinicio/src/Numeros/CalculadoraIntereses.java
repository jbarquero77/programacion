package Numeros;

import java.util.Scanner;

public class CalculadoraIntereses {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el capital inicial: ");
		double inicial= sc.nextDouble();
		
		System.out.println("Introduce la tasa de interes(porcentaje): ");
		double interes=sc.nextDouble()/100;
		
		System.out.println("Introduce el tiempo en años: ");
		int tiempo = sc.nextInt();
		
		double cantidad = calcularIntereses(inicial, interes, tiempo);
		
		System.out.println("La cantidad final con intereses es de: "+cantidad);
		
	}
	public static double calcularIntereses(double principal, double interes, int tiempo) {
		return principal * Math.pow((1+interes), tiempo);

	}
}