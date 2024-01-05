package PracticandoCicloFor;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Gallinas {
	 static final int NUM_GALLINEROS = 10;
	    static final int MAX_GALLINAS_POR_GALLINERO = 4;
	    static final int GALLINAS_POR_PACK = 4;

	    public static void main(String[] args) {
	        int[] gallineros = inicializarGallinerosAleatorios();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            mostrarEstadoGallineros(gallineros);

	            System.out.print("\nIngrese la cantidad de gallinas a incluir (-1 para salir): ");
	            int cantidadGallinas = scanner.nextInt();

	            if (cantidadGallinas == -1) {
	                break;
	            }

	            if (cantidadGallinas > GALLINAS_POR_PACK) {
	                System.out.println("Lo siento, no admitimos grupos de " + cantidadGallinas +
	                        " gallinas. Devuélvalas y compre 'packs' de " + GALLINAS_POR_PACK + " gallinas como máximo e intente de nuevo.");
	                continue;
	            }

	            colocarGallinas(gallineros, cantidadGallinas);
	        }

	        System.out.println("Programa terminado.");
	    }

	    static int[] inicializarGallinerosAleatorios() {
	        Random random = new Random();
	        int[] gallineros = new int[NUM_GALLINEROS];

	        for (int i = 0; i < NUM_GALLINEROS; i++) {
	            gallineros[i] = random.nextInt(MAX_GALLINAS_POR_GALLINERO + 1);
	        }

	        return gallineros;
	    }

	    static void mostrarEstadoGallineros(int[] gallineros) {
	        System.out.print("Número de gallineros: " + NUM_GALLINEROS + "\nOcupación: ");
	        for (int i = 0; i < NUM_GALLINEROS; i++) {
	            System.out.print("G" + (i + 1) + "  ");
	            
	        }
	        System.out.println();
	        
	        for (int i = 0; i < NUM_GALLINEROS; i++) {
	            System.out.print("  " +gallineros[i] + "  ");
	        }
	    }

	    static void colocarGallinas(int[] gallineros, int cantidadGallinas) {
	        for (int i = 0; i < NUM_GALLINEROS; i++) {
	            if (gallineros[i] == 0) {
	                gallineros[i] = cantidadGallinas;
	                break;
	            } else if (gallineros[i] + cantidadGallinas <= MAX_GALLINAS_POR_GALLINERO) {
	                gallineros[i] += cantidadGallinas;
	                break;
	            }
	        }

	        mostrarEstadoGallineros(gallineros);
	    }
}


