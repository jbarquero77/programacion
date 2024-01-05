/* Implementa un programa que llegeixi una seqüència de números enters fins a trobar un zero. 
 * Llavors ens dirà quins són els números més gran i més petit. Penseu que poden haver-hi números negatius.
Entrada
Cada cas de prova conté una seqüència de números enters, entre -100000 i 100000, que finalitza amb un zero, que no s´ha de processar.
Sortida
Mostrarà el número més gran i el més petit en una mateixa línia i separats per un espai en blanc. */

package IniciacioBucles;

import java.util.Scanner;

public class MesGranMesPetit {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero = sc.nextInt();
		int mayor = 0;
		int menor = 0;
		
		if (numero >= -100000 && numero <= 100000) {
			while (numero != 0) {
				numero = sc.nextInt();
				if(numero >= mayor) {
					mayor = numero;
				}else if (numero <= menor) {
					menor = numero;
				}
			}
			System.out.println(mayor+" "+menor);
		
		}
	}		
}
