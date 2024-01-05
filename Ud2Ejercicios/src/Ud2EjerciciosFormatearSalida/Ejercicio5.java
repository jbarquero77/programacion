package Ud2EjerciciosFormatearSalida;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		System.out.println("                 SUMA        RESTA    PRODUCTO    COCIENTE");
		System.out.println("--------------------------------------------------------");
		System.out.println("x="+x+" y="+y+"      "+(x+y)+"         "+(x-y)+"       "+(x*y)+"       "+(x/y));
	}

}
