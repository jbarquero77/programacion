package Basicos;

import java.util.Scanner;

public class CalculadoraSimple {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce dos números: ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		System.out.println("Introduce la operación(+,-,*,/): ");
		char operacion = sc.next().charAt(0);
		
		double resultado =0;
		
		switch (operacion) {
			case '+':
				resultado = num1+num2;
				break;
			case '-':
				resultado = num1 -num2;
				break;
			case '*':
				resultado = num1*num2;
				break;
			case '/':
				if(num2 !=0) {
					resultado = num1/num2;
				}else {
					System.out.println("No se puede dividir por 0");
					return;
				}
				break;
			default:
				System.out.println("Operación no válida");
				
		}
		
		System.out.println("El resultado es : "+ resultado);

	}

}
