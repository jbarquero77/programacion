/* Entrada
L’entrada comença amb un número indicant la quantitat de casos de prova que vindran a continuació.

Cada cas de prova consta de: Una terna de números separats per un espai que indicaran:

    -   Profunditat en metres del pou on cau el cargol (enter positiu entre 1 i 999)
    -   Metres que puja el cargol durant el dia (enter positiu entre 0 i 999) 
    -   Metres que cau el cargol durant la nit (enter positiu entre 0 i 999)

Sortida
Per cada cas de prova, caldrà respondre, en una sola línia:

-   Si el cargol pot sortir del pou:
        Número de dies que triga el cargol en sortir del pou
-   Si no pot sortir del pou:
        Missatge “NO” 
        */



package BuclesAcumulador;

import java.util.Scanner;

public class Caracoles {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int casos = sc.nextInt();
				
		for (int i = 0; i<= casos; i++) {
			int profunditat = sc.nextInt();
			int metresDia = sc.nextInt();
			int metresCau = sc.nextInt();
			
			int distanciaDia = metresDia - metresCau;
			int contadorDias =0;
			
			
		}
	}

}
