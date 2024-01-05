/*
La entrada consta de una serie de casos de prueba. 
Cada uno contiene, en una sola línea, la definición de un rectángulo. 
Un rectángulo se especifica proporcionando las coordenadas de la esquina superior derecha. 
Se debe considerar que la esquina inferior izquierda está siempre en el origen de coordenadas,es decir en (0, 0). 
Se garantiza que la longitud de un lado no superará 10.

El último caso de prueba, que no debe procesarse, contendrá un valor negativo en alguno de los ejes.
Salida

Para cada caso de prueba se escribirá, en una línea independiente, el perímetro del rectángulo.

 */

package JuecesOnline;

import java.util.Scanner;

public class PerimetroRectangulo155 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int base = sc.nextInt();
		int altura = sc.nextInt();
		int perimetro;
		
		while (base>=0 && altura>=0) {
			perimetro = (base*2)+(altura*2);
			System.out.println(perimetro);
			base = sc.nextInt();
			altura = sc.nextInt();
		}

	}

}
