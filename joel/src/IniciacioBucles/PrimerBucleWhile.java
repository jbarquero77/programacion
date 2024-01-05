/* Entrada
Hi ha diverses línies. La última línea té un 0, que NO s'ha de processar

Sortida
Per cada cas de prova caldrà respondre: El nombre introduït més un.
*/


package IniciacioBucles;

import java.util.Scanner;

public class PrimerBucleWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		while (true) {
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                if (num == 0) {
                    break;
                }
                int result = num + 1;
                System.out.println(result);
            }
		}    
	}

}
