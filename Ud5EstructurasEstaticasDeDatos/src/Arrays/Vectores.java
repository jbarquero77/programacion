package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Vectores {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 1-. Generar vector
	        int[] v = generarVectorRandom(14, 0, 400);
	        imprimirVector(v);

	        // 2-. Rotar vector
	        System.out.println("¿Cuantas posiciones a la derecha quieres rotar los elementos del vector?");
	        int n = sc.nextInt();
	        v = rotarVector(v, n);
	        System.out.printf("Vector con los elementos rotados %d posiciones:\n", n);
	        imprimirVector(v);

	        // 3.- Resaltar números
	        System.out.println("De qué número quieres que resalte sus múltiplos");
	        n = sc.nextInt();
	        imprimirVector(v, n);
	    }

	    // 1-. Generar vector de N elementos con números aleatorios entre A y B
	    public static int[] generarVectorRandom(int N, int A, int B) {
	        int[] vector = new int[N];
	        Random random = new Random();
	        for (int i = 0; i < N; i++) {
	            vector[i] = random.nextInt(B - A + 1) + A;
	        }
	        return vector;
	    }

	    // 2-. Imprimir vector mostrando índice y valor
	    public static void imprimirVector(int[] vector) {
	        System.out.println("Vector:");
	        for (int i = 0; i < vector.length; i++) {
	            System.out.printf("Índice %d: Valor %d\n", i, vector[i]);
	        }
	        System.out.println();
	    }

	    // 3-. Rotar vector N posiciones hacia la derecha
	    public static int[] rotarVector(int[] vector, int N) {
	        int[] rotatedVector = Arrays.copyOf(vector, vector.length);
	        int length = vector.length;

	        for (int i = 0; i < vector.length; i++) {
	            rotatedVector[(i + N) % length] = vector[i];
	        }

	        return rotatedVector;
	    }

	    // 4-. Imprimir vector resaltando múltiplos de un número dado
	    public static void imprimirVector(int[] vector, int numeroResaltar) {
	        System.out.printf("Vector resaltando múltiplos de %d:\n", numeroResaltar);
	        for (int i = 0; i < vector.length; i++) {
	            if (vector[i] % numeroResaltar == 0) {
	                System.out.printf("Índice %d: [Valor %d]\n", i, vector[i]);
	            } else {
	                System.out.printf("Índice %d: Valor %d\n", i, vector[i]);
	            }
	        }
	        System.out.println();
	    }

}
