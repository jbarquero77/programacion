/* Ets un rastrejador i estàs analitzant els casos de covid de tots els barris de catalunya. Et passaran els valors diaris de l'índex de contagis. La teva única missió és avisar si algun valor passa de 300.

Entrada
La primera línia indica els casos de prova a considerar. Cada cas són dues línies. La primera conté un nombre N
 amb la quantitat de dies durant els que faràs l'anàlisi. Després vindrà una línia amb N
 nombres, cadascun amb el valor de l'índex de contagis de cada dia.

Sortida
Per cada cas de prova caldrà respondre: Si no hi ha cap valor per sobre de 300, OK Si n'hi ha algun igual o per sobre de 300, ALARMA
*/


package BuclesContador;

import java.util.Scanner;

public class Trazacovid {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int casos = sc.nextInt();
		
		
		for (int i=0;i<casos;i++) {
			int casos2=sc.nextInt();
			
			int contador =0;
			
			for (int j=0;j<casos2;j++) {
				int numero =sc.nextInt();
				if (numero >=300) {
					contador++;
				}
			}
			if (contador >0) {
				System.out.println("ALARMA");
			}else {
				System.out.println("OK");
			}
		}
		
	}
}