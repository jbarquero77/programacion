package MatricesBidimensionales;

import java.util.Scanner;

public class Ej4bRellenaCuadrosMatrizPar {
	
	public static char[][] rellenarCuadros (int lado){
		char matriz[][] = new char [lado][lado];
		
		matriz[0][0] = '1';

		// superior derecho
		matriz[0][lado-1] = '2';

		// inferior izquierdo
		matriz[lado-1][0] = '3';

		// inferior derecho
		matriz[lado-1][lado-1] = '4';
		
		
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
		
		
		char[][] matriz = rellenarCuadros(lado);
        imprimirMatriz(matriz);

	}

}
