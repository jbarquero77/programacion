/*
 * Ejercicio1. java
 * 
 * JOSÉ MANUEL BARQUERO MARS
 * Comprobar si una matriz es simétrica
 * Realice una función en java que se le pase como parámetro una matriz, 
 * no tiene porqué tener el mismo número de filas que de columnas
 * y devuelve si la matriz es simétrica o no.
 * si el número filas es impar, se considera que la fila del medio es simétrica a sí misma.
 * realiza una función en java que se pase como parámetro una matriz y la imprima por pantalla.
 * imprime en la función principal la matriz utilizando la segunda función y 
 * muestra si es simétrica o no utilizando el resultado de la primera función
 * 
 */

package Examen;

public class Ejercicio1 {

	public static void imprimirMatriz (int [][] matriz) {
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	
	public static boolean esSimetrica (int[][] matriz) {
		
		boolean esSimetrica = true;
		
		int filas =matriz.length;
		int columnas = matriz[0].length;
		// int mitad = matriz.length/2     					//puedo crear una variable llamada mitad para usarla es el bucle
		
		for(int i =0; i<filas/2; i++) {							//Recorro la matriz hasta la mitat
			for (int j =0; j < columnas; j++) {
				if(matriz[i][j] != matriz[filas-i-1][j]) {		//si la 1 fila es diferente a la ultima fila (es -1 -i, porque la i también tiene que aumentar conforme aumenten las filas
					esSimetrica = false;						// en el momento que sea false
					break;										// dejo de comparar
				}
			}
		}
		return esSimetrica;
	}
	
	
	public static void main(String[] args) {
		
		int[][] m1 = {{1,2,1},{2,2,2,},{3,2,3}, {4,2,4}};
		int [][] m2= {{1,1},{2,2}, {2,2}, {1,1}};
		
		imprimirMatriz(m1);
		boolean esSimetrica =esSimetrica (m1);
		
		if (esSimetrica == true) {
			System.out.println("La matriz SI es simétrica");
		}else {
			System.out.println("La matriz NO es simétrica");
		}
		
		imprimirMatriz(m2);
		
		if (esSimetrica (m2)) {
			System.out.println("La matriz SI es simétrica");
		}else {
			System.out.println("La matriz NO es simétrica");
		}
	}

}
