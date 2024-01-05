//Realiza un conversor de euros a dólares.
//La cantidad de euros que se quiere convertir a dólares debe ser introducida por teclado.

package ud1Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Pedimos al usuario que ingrese la cantidad de € que desea cambiar
		
		System.out.println("Introduce la cantidad de € que desea convertir a $");
		double euros = sc.nextDouble();
		double cambioEuroDolar = 1.064;
		String son = "are"; //ResourceString languages son or are
		//Realizamos la operación de cambio
		double cambio = euros * cambioEuroDolar;
		
		
		//Mostramos el resultado
		System.out.println(euros+" € son "+cambio+" $");
		//Utilizando format String
		System.out.printf("%.2f € %s %.2f $", euros, son, cambio);
		sc.close();

	}

}
