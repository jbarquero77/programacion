/*  Escribe un programa que pida de forma repetitiva pares de números al usuario. 
 * Tras introducir cada par de números, responderá si el primero es múltiplo del segundo. 
 * Se repetirá mientras los dos números sean distintos de cero (terminará cuando uno de ellos sea cero).  */


package EstructurasControl;

import java.util.Scanner;

public class NumerosMultiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		while (true) {
            System.out.println("Ingrese dos números (0 para salir):");
            
            System.out.print("Primer número: ");
            int numero1 = sc.nextInt();

            if (numero1 == 0) {
                System.out.println("Saliendo del programa.");
                break;
            }

            System.out.print("Segundo número: ");
            int numero2 = sc.nextInt();

            if (numero2 == 0) {
                System.out.println("Saliendo del programa.");
                break;
            }

            if (numero1 % numero2 == 0) {
                System.out.println(numero1 + " es múltiplo de " + numero2);
            } else {
                System.out.println(numero1 + " no es múltiplo de " + numero2);
            }
        }
	}

}
