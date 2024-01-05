package MatricesBidimensionales;

public class RellenarCuadrado {
	
	// Apartado a
	public static int[][] rellenarCuadro(){
		int [][] matriz = rellenarCuadro(4,1,2,3,4);
		
		return matriz;
		
	}
	
	
	// Apartado b
	public static int[][] rellenarCuadro(int tamanio){
		int [][] matriz = rellenarCuadro(tamanio,1,2,3,4);
		
		return matriz;
	}
	
	
	// Apartado c
	public static int[][] rellenarCuadro (int tamanio, int a, int b, int c, int d) {
				
		int matriz [][] = new int [tamanio][tamanio];
				
		// Relleno el cuadro superior izquierdo
		for(int i =0; i < matriz.length/2; i++) {
			for(int j =0; j < matriz[0].length/2; j++) {
				matriz[i][j] = a;
			}
		}
		
		// Relleno el cuadro superior derecho
		for(int i =0; i < matriz.length/2; i++) {
			for(int j =matriz[0].length/2; j < matriz[0].length; j++) {
				matriz[i][j] = b;
			}
		}
		
		//Relleno cuadro inferior izquierdo
		for(int i =matriz.length/2; i < matriz.length; i++) {
			for(int j =0; j < matriz[0].length/2; j++) {
				matriz[i][j] = c;
			}
		}
		
		//Relleno cuadro inferior derecho
		for(int i =matriz.length/2; i < matriz.length; i++) {
			for(int j =matriz[0].length/2; j < matriz[0].length; j++) {
				matriz[i][j] = d;
			}
		}
		return matriz;
	}
	
	//Funcion para imprimir la matriz
	public static void imprimirMatriz(int [][]matriz) {
		
		for(int i =0; i < matriz.length; i++) {
			for(int j=0; j < matriz[i].length;j++) {
				System.out.print(matriz[i][j]+ " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
				
		int [][] matriz = rellenarCuadro ();
		imprimirMatriz(matriz);
		System.out.println();
		
		// Apartado B
		matriz = rellenarCuadro (8);
		imprimirMatriz(matriz);
		System.out.println();
		
		// Apartado C
		matriz = rellenarCuadro (6,3,5,7,9);
		imprimirMatriz(matriz);
		
		
	}

}
