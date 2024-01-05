/* Escribe un programa que pida al usuario un número y le diga si este es positivo o
negativo. Se repetirá mientras el número introducido no sea cero */


package EstructurasControl;

import java.util.Scanner;

public class PositivoONegativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num = 1;
				
		while (num !=0) {
			System.out.print ("Dame un número: ");
			num = sc.nextInt();
			
			if (num >= 0){
				System.out.println("El número es positivo");
			}else {
				System.out.println ("El numero es negativo");
			}
			
		}
			
		
		
		
		
		

	}

}
