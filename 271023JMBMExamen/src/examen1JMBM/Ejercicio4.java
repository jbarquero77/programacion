// // José Manuel Barquero Mars

package examen1JMBM;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int nAmuletos = sc.nextInt();
		
		while (nAmuletos !=0) { // El programa se ejecuta mientras no se introduzca un 0
			
			// necesito saber el número de amigas y el número de amuletos total
			int amigas =0;
			int sumaAmuletos =0;
			
			//Pido amigas y cantidad de amuletos en cada caso
			while (nAmuletos !=0) {
				amigas++;
				sumaAmuletos = sumaAmuletos + nAmuletos;
				// vuelvo a controlar los siguientes amuletos
				nAmuletos = sc.nextInt();
							
			}
			// comprobamos si el reparto es equitativo
			if (sumaAmuletos %amigas == 0) {
				System.out.println("EQUITATIVO");
			}else {
				System.out.println("DESIGUAL");
			}
			
			nAmuletos = sc.nextInt();
		}
	}
	
}
