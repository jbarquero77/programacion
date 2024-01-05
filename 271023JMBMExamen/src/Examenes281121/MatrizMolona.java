package Examenes281121;

import java.util.Random;

public class MatrizMolona {
	
	// Método para llenar la matriz con valores aleatorios (0 o 1)
    public static void llenarMatrizAleatoria(int[][] matriz) {
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Generar aleatoriamente 0 o 1
                matriz[i][j] = random.nextInt(2);
            }
        }
    }
    
 // Método para verificar si la matriz "mola" o no
    public static boolean esMatrizMolona(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            int contadorFila = 0;
            int contadorColumna = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                contadorFila += matriz[i][j];
                contadorColumna += matriz[j][i];
            }

            // Verificar si hay más de un "1" en una fila o columna
            if (contadorFila > 1 || contadorColumna > 1) {
                return false; // No mola :(
            }
        }

        return true; // Mola :)
    }

 // Método para imprimir la matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
	
	
	public static void main(String[] args) {
		// Tamaño de la matriz
        int filas = 4;
        int columnas = 4;

        // Crear la matriz
        int[][] matriz = new int[filas][columnas];

        // Llenar la matriz de forma aleatoria con 0 y 1
        llenarMatrizAleatoria(matriz);

        // Imprimir la matriz
        imprimirMatriz(matriz);

        // Verificar si la matriz "mola" o no
        if (esMatrizMolona(matriz)) {
            System.out.println("¡Mola!");
        } else {
            System.out.println("No mola :(");
        }
    }

}
