package Ud3Test;

import java.util.Scanner;

public class EstacionesAño {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número para saber la estación del año");
		int estacion = sc.nextInt();
		
		/*if (estacion == 1) {
			System.out.println("Es primavera");
			
		}else if (estacion == 2) {
			System.out.println("Es verano");
			
		}else if (estacion == 3) {
			System.out.println("Es otoño");
			
		}else if (estacion == 4) {
			System.out.println("Es invierno");
			
		}else {
			System.out.println("Introduce un número entre 1 y 4");
		} 
		sc.close();*/
		
		// Usando switch
		
		switch (estacion) {
			case 1: 
			case 2: 
				System.out.println("Hace calor");
				break;
			
			case 3: 
			case 4: 
				System.out.println("Hace frío");
				break;
			
		default:
			System.out.println("Introduce un número entre 1 y 4");
		}
		
		sc.close();
		
		
	}

}
