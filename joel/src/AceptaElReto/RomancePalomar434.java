/*
 * Entrada
La entrada comienza con una línea con un número que indica el número de casos de prueba que siguen.

Cada caso de prueba, en una línea independiente, contiene los datos de una noche en el palomar: 
número de ejemplares que duermen en él (al menos dos) y 
número de cajas disponibles. 
Ninguno de los números será mayor que 1.000.000.

Salida
Sabiendo que siempre se encuentra dos palomas en al menos un habitáculo,
 por cada caso de prueba se escribirá una línea que indicará si Higinio puede estar seguro de que esa noche ha habido un romance
  (escribiendo ROMANCE) o puede ser cosa del principio del palomar (escribiendo PRINCIPIO).
 */


package AceptaElReto;

import java.util.Scanner;

public class RomancePalomar434 {

	public static String calcularResultado (int palomas, int cajas) {
		
		if(palomas <=cajas) {
			return 	"ROMANCE";
		}else {
			return 	"PRINCIPIO";
		}		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int casos = sc.nextInt();
		
		for(int i =0; i<casos; i++) {
			int palomas =sc.nextInt();
			int cajas = sc.nextInt();
		
			String resultado = calcularResultado(palomas, cajas);
			System.out.println(resultado);
		}	
	}
}
