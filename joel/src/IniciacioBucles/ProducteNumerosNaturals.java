/* Implementa un programa que llegeix un número enter i ens calcula la suma i el producte dels n primers números naturals.
 *  Si n és <= 0 es mostrará un missatge d'error i no calcularà res.

Entrada
L'entrada consta d'un primer número k > 0 que indica el nombre de casos de prova a processar. 
Per cada cas de prova l'entrada serà un únic nombre enter n.

Sortida
Per cada cas de prova es mostrarà, en una línia, el següent:

Si n és errònia es mostrarà el següent missatge de error: ELS NOMBRES NATURALS COMENCEN EN 1
Si n és correcta es mostrarà el següent missatge: SUMA: xxx PRODUCTE: xxx.
*/


package IniciacioBucles;

import java.util.Scanner;

public class ProducteNumerosNaturals {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		for (int i =0;i<num;i++) {
			int suma =0;
			int pro =1;
			int n = sc.nextInt();
			
			if (n<=0) {
				System.out.println("ELS NOMBRES NATURALS COMENCEN EN 1");
			}else {
				for (int j=n;j>0 ; j--) {
					suma = suma+j;
					pro = pro*j;
				}
				System.out.printf("SUMA: %d PRODUCTE: %d", suma,pro);
			}	
		}
	}

}


