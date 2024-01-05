/* Escribe un programa que muestre los números del 100 al 200 (ambos incluidos) que sean divisibles entre 7 y a la vez entre 3 */


package Ud3AR;

public class Ud3Ej3 {

	public static void main(String[] args) {
		for (int i =100; i<=200; i++) {
			if (i%3==0 && i%7 ==0) {
				System.out.print(i +" ");
			}
		}
	}

}
