/*demana un número de dia de l’any (1-366) i mostra per pantalla:
Incorrecte!, si el número de dia no és correcte
Correcte per un any no bixest!, si el dia està entre 1 i 365
Correcte per un any bixest!, si el dia és 366
*/

package Joel_0201AlternativasIf;

import java.util.Scanner;

public class DiasCorrectosAnyo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int dia = sc.nextInt();
		
		if (dia < 1 || dia > 366) {
			System.out.println("Incorrecte!");
		
		}else if (dia == 366){
			System.out.println("Correcte per un any bixest!");
		}else {
			System.out.println("Correcte per un any no bixest!");
		}
	}

}
