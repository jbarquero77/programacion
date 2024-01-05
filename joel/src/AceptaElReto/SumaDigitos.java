/*
 * Se trata de implementar un programa que sume los dígitos de un número entero no negativo. 
 * Por ejemplo, la suma de los dígitos del 3433 es 13.

Para darle un poco más de emoción, el programa no se limitará a escribir el resultado de la suma, 
sino que también escribirá todos los sumandos utilizados: 3 + 4 + 3 + 3 = 13.

Entrada
La entrada consta de una serie de casos de prueba terminados con un número negativo. 
Cada caso de prueba es una simple línea con un número no negativo no mayor que 100000 del que habrá que sumar todos sus dígitos.

Salida
Para cada caso de prueba se mostrará una línea en la que aparecerán cada uno de los dígitos 
separados por el signo +, tras lo cual aparecerá el símbolo = y la suma de todos los dígitos.

Ten en cuenta que antes y después de cada símbolo (+ y =) hay un espacio.
 */


package AceptaElReto;

import java.util.Scanner;

public class SumaDigitos {

	public static void sumaDigitos (int numero) {
		
		int temporal = numero;
		int suma = 0;
		
		while(temporal >0) {
			int digito = temporal%10;
			System.out.print(digito);
			
			if (temporal/10>0) {
				System.out.print(" + ");
			}
			suma += digito;
			temporal /=10;
		}
		
		System.out.println(" = "+ suma);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		while(true) {
			int numero = sc.nextInt();
			
			if (numero<0  || numero >100000) {
				break;
			}
			sumaDigitos(numero);
		}

	}

}
