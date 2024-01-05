/*Mai m'ha agradat que el Python no tingués una funció ràpida per augmentar un comptador. C té el ++ que és elegant. Però Python? Res.

Entrada
Cada cas és d'una sola línia que contindrà un nombre.

Sortida
Per cada cas es mostrarà el nombre immediatament superior.*/

package ProblemesScanner;

import java.util.Scanner;

public class Problema2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numUsuario = sc.nextInt();
		
		numUsuario++;
		System.out.println(numUsuario);
		
	}

}
		
		