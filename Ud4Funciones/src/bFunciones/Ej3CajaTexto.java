/* Ejercicio 3
	Hacer una función que dado un String, imprima dicha cadena en una Caja de caracteres. */



package bFunciones;

import java.util.Scanner;

public class Ej3CajaTexto {

	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
		
        String texto = "";
        System.out.println("Introduce el texto");
        texto = sc.nextLine();
        
        imprimirCaja(texto);
    }

    public static void imprimirCaja(String texto) {
        int longitud = texto.length();

         // Imprimir la parte superior de la caja
        for (int i = 0; i < longitud + 4; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Imprimir las filas con el texto
        for (int i =0; i < 3; i++){
			System.out.print("*");
			
			for (int j =0; j < longitud+2; j++) {
				if (i == 1) {
					System.out.print(" "+texto+" ");
					break;
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("*");
        
        }

        // Imprimir la parte inferior de la caja
        for (int i = 0; i < longitud + 4; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}