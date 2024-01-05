/* L'entrada consta d'una seqüencia de números corresponents a les notes obtingudes.
 * La última nota és -1 i no s'ha de processar. Pot haver-hi notes no vàlides, que s'ignoraran, al processar les dades.

Sortida
Es mostrarà un missatge en una sola línia amb els resultats obtingits. El missatge s'ajustarà al següent format: */

package BuclesContador;

import java.util.Scanner;

public class ContadorNotes {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	    
		int nota =0;
        int validNotes = 0;
        int sumaNotes = 0;
        int excelents = 0;
        int notables = 0;
        int bens = 0;
        int suficients = 0;
        int insuficients = 0;
        int moltDeficients = 0;
                
        while (nota != -1) {
            nota = sc.nextInt();
            if (nota >= 0 && nota <= 10) {
                validNotes++;
                sumaNotes += nota;
            } 
            if (nota == 10 || nota == 9) {
				excelents++;
            } else if (nota ==7 || nota ==8) {
				notables++;	
            } else if (nota == 6) {
				bens++;
            } else if (nota == 5) {
				suficients++;
            } else if (nota < 5 || nota > 3) {
				insuficients++;
            } else if ( nota == 0 || nota <3){
				moltDeficients++;
            } 
             
         }
        if (validNotes > 0) {
        	double mitjana = (double) sumaNotes / validNotes;
        
        	System.out.println("NOTES: " + validNotes + " MITJANA: " + mitjana + "E: " + excelents + " N: " + notables + " B: " + bens +
                    " S: " + suficients + " I: " + insuficients + " MD: " + moltDeficients);
        }
	}

}
