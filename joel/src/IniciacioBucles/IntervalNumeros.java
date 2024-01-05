/* Crea un programa que demani dos números i ens imprimirà número a número l’interval que hi ha entre un i l’altre inclosos els dos. Si el segon número no és més petit que el primer mostrarà el següent missatge : "El segon numero no es mes petit que el primer"

Entrada
Cada cas és una línia amb 2 números positiu.

Sortida
El compte enrere del primer nombre fins al segon, incloent els dos. */


package IniciacioBucles;

import java.util.Scanner;

public class IntervalNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//System.out.println("Ingresa el primer número: ");
		int primer = sc.nextInt();
		//System.out.println("Ingresa el segundo número: ");
		int segundo = sc.nextInt();
		
		if (segundo > primer) {
			System.out.println("El segon número no es mes petit que el primer");
		}else {
			
			while (primer >= segundo) {
				for (int i=primer; i>=segundo;i--) {
					System.out.println(i);
				}
				break;
			}
		}

	}

}
