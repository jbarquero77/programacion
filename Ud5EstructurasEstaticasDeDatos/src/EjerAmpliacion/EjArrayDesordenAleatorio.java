/*
 * 5. Escribe un programa que genere un array de 10 números enteros generados aleatoriamente entre 0 y 100.
 *  El programa mostrará el contenido de ese array y 
 * en segundo lugar mostrará el contenido de ese array desordenado (de forma aleatoria). 
 */

package EjerAmpliacion;

import java.util.Arrays;
import java.util.Random;

public class EjArrayDesordenAleatorio {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int []numerosAleatorios = new int[20];
		int cantidad =20;
		
		for(int i =0; i<20;i++) {
			numerosAleatorios[i]= ran.nextInt(101);
		}
		System.out.println("Array de números desordenados ");
		for (int numeros : numerosAleatorios) {
			System.out.print(numeros + " ");
		}
		
		 // Desordenar el array de forma aleatoria
        Random random2 = new Random();
        for (int i = numerosAleatorios.length - 1; i > 0; i--) {
            int indiceAleatorio = random2.nextInt(i + 1);

            // Intercambiar elementos
            int temp = numerosAleatorios[i];
            numerosAleatorios[i] = numerosAleatorios[indiceAleatorio];
            numerosAleatorios[indiceAleatorio] = temp;
        }

        // Mostrar el contenido del array desordenado
        System.out.println("\nContenido del array desordenado:");
        System.out.println(Arrays.toString(numerosAleatorios));
   
		

	}

}
