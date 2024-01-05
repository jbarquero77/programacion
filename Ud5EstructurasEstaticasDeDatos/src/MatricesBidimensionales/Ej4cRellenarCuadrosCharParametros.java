package MatricesBidimensionales;

import java.util.Scanner;

public class Ej4cRellenarCuadrosCharParametros {
	
	 public static char[][] rellenarCuadros(int lado, char a, char b, char c, char d) {
	        char[][] matriz = new char[lado][lado];
	        
	        matriz[0][0] = 'a';

			// superior derecho
			matriz[0][lado-1] = 'b';

			// inferior izquierdo
			matriz[lado-1][0] = 'c';

			// inferior derecho
			matriz[lado-1][lado-1] = 'd';
	        
	        return matriz;
	 }   
	 
	 public static void imprimirMatriz (char[][] matriz) {
			for(int i =0; i < matriz.length; i++) {
				for(int j=0; j < matriz[i].length;j++) {
					if (matriz[i][j] == 0) {					// en el caso de que no cumpla los requisitos pinta un -
						System.out.print('-');
					}else {
						System.out.print(matriz[i][j]);			// si los cumples imprime lo indicado 
					}	
				}
				System.out.println();
			}
		}
	
	
	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduce el tamaño de la matriz: ");
		int lado = sc.nextInt();
		
		
		char[][] matriz = rellenarCuadros(lado, 'a', 'b', 'c', 'd');
        imprimirMatriz(matriz);

	}

}
