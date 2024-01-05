/* La Valentina té un Ràdar que pot detectar la quantitat d'energia de les persones. 
 * Per a calibrar-ho, fa 5 medicions de cada persona, que li tornen un valor d'energia. 
 * Si l'energia es menys de 1000, serà de categoria H, si es entre 1000 i 10000, de categoria B i si és de 10000 o més, categoria M

Entrada
La primera línia indica els casos de prova a considerar Cada cas és una linea amb 5
 números, cadascún amb la medició de l'energia.

Sortida
Per cada cas de prova caldrà respondre: Si en alguna medició s'ha detectat un valor d'energia de 10000 o superior, M Si no és M, pero hi ha algun valor d'energia 1000 o superior, B En cas contrari, H
*/


package BuclesContador;

import java.util.Scanner;

public class RadarValentina {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int casos = sc.nextInt();
		
		for (int i =0;i<casos;i++) {
			int contador10k =0;
			int contador1k =0;
			
			for (int j =0; j<5;j++) {
				int numero =sc.nextInt();
				
				if (numero >=10000) {
					contador10k++;
					
				}else if (numero >=1000) {
					contador1k++;
				}
				
			}
			if (contador10k >0) {
				System.out.println("M");
			}else if(contador1k >0) {
				System.out.println("B");
			}else {
				System.out.println("H");
			}
		}
		

	}

}
