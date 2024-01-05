// Crear una matriz para rellenar un cuadrado con arteriscos

package MatricesPruebas;

import java.lang.reflect.Array;
import java.util.Scanner;

public class RectanguloArteriscos {
	
	//Funcion para rellenar la matriz de arteriscos
	public static void rellenarMatriz (char[][] matriz, int n) {
		for (int i =0; i<n;i++) {
			for (int j =0; j<n; j++) {
				matriz[i][j] = '*';
			}
		}
	}
	
	//Función para imprimir una matriz de carácteres
	public static void imprimirMatriz (char[][] matriz, int n) {
		for (int i =0; i<n; i++) {
			for (int j =0; j<n; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	//Función para imprimir una matriz de cadena de texto
	public static void imprimirMatriz (String[][] matriz, int n) {
		for (int i =0; i<n; i++) {
			for (int j =0; j<n; j++) {
				matriz[i][j] = "*";
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("introduce el lado del cuadrado");
		int lado = sc.nextInt();
		char dibujo ='*';
		
		char [][] matriz = new char [lado][lado];
		
		rellenarMatriz(matriz, lado);
		
		imprimirMatriz (matriz, lado);
		
		String[][] matrizPalabras = new String [lado][lado];
		
		System.out.println();
		
		//Dibujar la diagonal mayor
		 for (int i = 0; i < lado; i++) {
	            for (int j = 0; j < lado; j++) {
	                if (i == j) {
	                    matriz[i][j] = '*';  // Asterisco en la diagonal
	                } else {
	                    matriz[i][j] = '-';  // Guion en el resto
	                }
	            }
	        }

	        // Imprimir la matriz
	        for (int i = 0; i < lado; i++) {
	            for (int j = 0; j < lado; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();  // Nueva línea después de cada fila
	        }
	        
	        //Diagonal menor
	        for (int i = 0; i < lado; i++) {
	            for (int j = 0; j < lado; j++) {
	                if (i + j == lado - 1) {
	                    matriz[i][j] = '*';  // Asterisco en la diagonal menor
	                } else {
	                    matriz[i][j] = '-';  // Guion en el resto
	                }
	            }
	        }
	        System.out.println();
	        
	        for (int i = 0; i < lado; i++) {
	            for (int j = 0; j < lado; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();  // Nueva línea después de cada fila
	        }
	        
		

	}
	
	

}
