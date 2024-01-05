/* Escribe un programa que muestre por pantalla los números pares del 26 al 10
(descendiendo), usando while */

package EstructurasControl;

public class NumDescPares {

	public static void main(String[] args) {
		
		int i = 26;
		
		while (i >= 10) {
			System.out.println(i);
			i = i-2;
		}
	}

}
