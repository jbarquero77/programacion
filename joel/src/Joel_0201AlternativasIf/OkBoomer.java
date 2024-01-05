/* Els Baby Boomers (coneguts com a boomers) són aquells nascuts entre 1945 i 1965.
 *  S'ha posat de moda cabrejar-los dient-lis "ok boomer"

Entrada
Cada cas es de una línea, i conté un nombre, l'any de naixement, entre 1 i 2020.

Sortida
Sí l'any està entre 1945 i 1965, incloent els dos, es dirà "ok boomer"; en cas contrari, es dirà "nah" */


package Joel_0201AlternativasIf;

import java.util.Scanner;

public class OkBoomer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int añoNac = sc.nextInt();
		
		if (añoNac >= 1945 && añoNac <= 1965) {
			System.out.println("ok boomer");
		}else {
			System.out.println("nah");
		}

	}

}
