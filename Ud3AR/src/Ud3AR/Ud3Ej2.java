/* Escribe un programa que escriba en pantalla los números del 1 al 50 que sean múltiplos de 3*/

package Ud3AR;

public class Ud3Ej2 {

	public static void main(String[] args) {
		for (int i =1;i<=50;i++) {
			if (i%3==0) {
				System.out.print(i+" ");
			}
		}

	}

}
