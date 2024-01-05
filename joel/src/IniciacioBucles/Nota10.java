/* L'entrada consta d'una seqüencia de números corresponents a les notes obtingudes. 
 * La última nota és -1 i no s'ha de processar.

Sortida
Es mostrarà un missatge indicant el nombre total de notes correctes llegides 
i el nombre total de notes 10. Una nota és vàlida si es troba entre 0 i 10.

El format del missatge de sortida serà el següent:
TOTAL NOTES: xxx NOTES10: xxx */

package IniciacioBucles;

import java.util.Scanner;

public class Nota10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int nota = sc.nextInt();
		int notaDiez = 0;
		int notaCorrecta =0;
		
		while  (nota != -1){
			
			if (nota == 10) {
				notaDiez++;
			}if ( nota >= 0 && nota < 11) {
				notaCorrecta++;
			}
			nota = sc.nextInt();
			
		}
		System.out.println("TOTAL NOTES: "+notaCorrecta+ " NOTES10: "+notaDiez);
		//System.out.printf( "TOTAL NOTES: %d NOTAS10: %d", notaCorrecta, notaDiez);
	}
	
}
