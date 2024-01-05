/*
 * Mostrar que para los números entre el 10 y el 20 (ambos incluidos)
 *  diga si son divisibles entre 5, si son divisibles entre 6 y si son divisibles entre 7, 
 * usando dos bucles anidados.
 */


package Bloque1AR3;

public class Ej1MostrarNumerosSiCondicionesDosBucles {

	public static void main(String[] args) {
		
		for (int i = 10; i <= 20; i++) {
			while(i%5==0) {
				System.out.println(i +" Es divisible por 5");
				break;
			}
			while(i%6==0) {
				System.out.println(i +" Es divisible por 6");
				break;
			}
			while(i%7==0) {
				System.out.println(i +" Es divisible por 7");
				break;
			}
		}

	}

}
