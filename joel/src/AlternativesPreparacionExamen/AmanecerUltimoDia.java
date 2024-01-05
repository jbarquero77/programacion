/*  En The Legend of Zelda, Majora’s Mask, tens 3 dies per a salvar el mon de l’impacte de la lluna. 
 * Tot i que internament el joc compta el temps en segons, els events més importants passen cada 12 hores, 
 les 12 primeres el “matí del dia 1”, les 12 segones la “nit del dia 1”, les 12 terceres el “matí del dia 2” i així. 
 Fes un programa que 
 donat el nombre de segons que transcorreixen desde l’inici del joc, et digui en quin dia estas, i si és matí o nit.
Entrada
Cada cas es un nombre, amb els segons transcorreguts. El nombre serà entre 1 i 100000000
Sortida
El temps en format Zelda dient "mati del dia X" o "nit del dia X" (sense accents!)
 Si passen exactament 12 hores assumeix que ha canviat a la nova etapa. */



package AlternativesPreparacionExamen;

import java.util.Scanner;

public class AmanecerUltimoDia {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int seg = sc.nextInt();
		
		if (seg >= 1  || seg <= 21600) {
			
		}

	}

}
