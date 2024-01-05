/*
 * El ordenado relegirá un número al azar entre 1 y 100.
 * El usuario irá introduciendo números por teclado, y el ordenador le irá dando pistas:
 * "mi número es mayor" o "mi número es menor",
 * hasta que el usuario acierte. 
 * Entonces el ordenador le felicitará y le comunicará el número de intentos que necesitó para acertar el número secreto.
 */

package Ud5EstructurasEstaticasDeDatos;

import java.util.Random;
import java.util.Scanner;

public class Ej1NumeroSecreto {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Random aleatorio = new Random();
		
		int num = (int)(aleatorio.nextDouble() * 100 + 1);
		
		int jugador =0;
		int intentos =0;
		
		while (num != jugador) {
			System.out.println("Introduce un número");
			jugador = sc.nextInt();
			
			if (jugador > num) {
				System.out.println("Mi numero es mayor");
				intentos++;
			}else if (jugador < num) {
				System.out.println("Mi numero es menor");
				intentos++;
			}else {
				System.out.println("Has acertado");
				System.out.println("Has necesitado: " + intentos + " intentos");
			}
		}
	}
	
	
}
