/*
 * Escribe la función “RellenaCuadros” que te rellena y devuelve una matriz cuadrada de 4x4 en cuatro cuadros.
 * El cuadro superior izquierdo lo rellena con ‘1’, el superior derecho, con ‘2’, 
 * el inferior izquierdo con ‘3’ y el inferior derecho con‘4’
 */


package MatricesBidimensionales;

public class Ej4aRellenaCuadros {
	
	public static char[][] rellenaCuadros (){
		char[][] matriz = new char [4][4];
		
		//Primera fila superior izquierda
		matriz[0][0] ='1';
		
		// superior derecho
		matriz[0][3] = '2';
		
		// inferior izquierdo
		matriz [3][0] = '3';
		
		// inferior derecho
		matriz [3][3] = '4';
		
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
		char[][] matriz = rellenaCuadros();
		
		imprimirMatriz (matriz);

	}

}
