/* Jordi While() és un streamer famós. Com tots els streamers, el que més por li fa es que l'hi posin 3 strikes a la compta, 
 * perquè aleshores li tancarien

Entrada
Cada cas és una linea amb un nombre desconegut de números. Els números seran, o bé un nombre positiu,
 amb els viewers que ha tingut Jordi, o bé -1, que significa que li han posat un strike. La línea acaba al tercer strike.

Sortida
Per cada cas de prova caldrà respondre: Quants videos ha fet jordi fins a rebre el tercer strike 
(sense comptar els vídeos amb strike)
*/


package IniciacioBucles;

import java.util.Scanner;

public class JordiWhile {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);

		int num =0;
		int cont =0;
		int videos =0;
		
		while (num >= -1) {
			num = sc.nextInt();
			if (num == -1) {
				cont++;
			}else {
				videos++;
			}
			if (cont == 3) {
				break;
			}
		}
		System.out.print(videos);
	}
}
