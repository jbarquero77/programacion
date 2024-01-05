/*  Escribe un programa que, para los números entre el 10 y el 20 (ambos incluidos) diga
 *  si son divisibles entre 5, si son divisibles entre 6 y si son divisibles entre 7, usando dos bucles anidados. */

package Ud3AR;

public class Ud3Ej9 {

	public static void main(String[] args) {
		for (int numero = 10; numero <= 20; numero++) {
            System.out.print("Número " + numero + ": ");
            
            for (int divisor = 5; divisor <= 7; divisor++) {
                if (numero % divisor == 0) {
                    System.out.print("Divisible por " + divisor + " ");
                }
            }
            
            System.out.println(); // Salto de línea para el siguiente número
        }

	}

}
