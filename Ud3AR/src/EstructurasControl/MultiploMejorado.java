/* Escribe una versión mejorada del programa anterior, que, tras introducir cada par de números, 
 * responderá si el primero es múltiplo del segundo,
 *  o el segundo es múltiplo del primero,
 *  o ninguno de ellos es múltiplo del otro. */


package EstructurasControl;

import java.util.Scanner;

public class MultiploMejorado {

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
            } else if (numero2 % numero1 == 0){
                System.out.println(numero2 + " es múltiplo de " + numero1);
            }else {
            	System.out.println("No son múltiplos");
            }
        }
	}

}
