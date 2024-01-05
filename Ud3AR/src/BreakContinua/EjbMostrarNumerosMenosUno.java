/*
 *Mostrar los números del 30 al 20, descendiendo, excepto el 27, usando continue. 
 */


package BreakContinua;

public class EjbMostrarNumerosMenosUno {

	public static void main(String[] args) {
		for (int i =30; i>=20; i--) {
			if(i == 27) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
