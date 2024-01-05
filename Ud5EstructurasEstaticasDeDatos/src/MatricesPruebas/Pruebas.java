package MatricesPruebas;

import java.util.Random;

public class Pruebas {

	public static void main(String[] args) {
		
		int [][] alumnosNotasED = new int [2][3];
		
		// Relleno notas para el primer curso
		
		alumnosNotasED [0][0] = 5;
		alumnosNotasED [0][1] = 6;
		alumnosNotasED [0][2] = 9;
		
		// Relleno notas aleatorias entre 1-10 para el segundo curso
		Random r = new Random ();									// llamamos al método para crear números aleatorios
		
		for (int i =0; i< alumnosNotasED[1].length; i++) {     		// Recorremos los elementos de la matriz [1], que es la del segundo curso
			alumnosNotasED[1][i] = r.nextInt(10)+1;					// Para cada posición, le damos un número aleatorio
			System.out.println(alumnosNotasED[1][i]);				// imprimimos cada posición
		}
		
	/*	Otra forma de rellenar la matriz
	 * 
	 * for (int fila =0; fila < alumnosNotasED.length;fila++) {
			for (int columna =0; columna < alumnosNotasED[0].length;columna++) {
				alumnosNotasED[fila][columna] = r.nextInt(10)+1;
			}
		}
		for (int fila =0; fila < alumnosNotasED.length;fila++) {
			for (int columna =0; columna < alumnosNotasED[fila].length;columna++) {
				System.out.print (alumnosNotaED[fila][columna] + " ";				// 8 4 4
			}	
			System.out.println();													// 5 9 7				
		}		
				
			
		
	*/
		
		// Creo otra matriz con las notas rellenadas previamente
		int [][] alumnosNotasPRG = {
				{5,3,10},
				{8,7,9},
				{9,9,5}
		};
		
		// Recorro la matriz y muestro los datos
		for (int i =0;i < alumnosNotasPRG.length; i++) {
			for (int j =0; j < alumnosNotasPRG [i].length; j++) {
				System.out.println(alumnosNotasPRG[i][j] + " ");
			}
			System.out.println();
		}
		
		// Suma
		int totalSuma =0;
		
		for (int fila =0; fila < alumnosNotasPRG.length; fila++) {
			for (int columna =0; columna < alumnosNotasPRG[fila].length; columna++) {
				totalSuma += alumnosNotasPRG[fila][columna];
			}
		}
		System.out.println(totalSuma);
		
		
		//Suma diagonal mayor
		totalSuma =0;
		for (int fila =0; fila < alumnosNotasPRG.length; fila++) {
			totalSuma += alumnosNotasPRG [fila][fila];
			System.out.println(totalSuma);
		
		}
		
		// Suma diagonal menor
		totalSuma =0;
		for (int columna = alumnosNotasPRG.length-1; columna >= 0; columna--) {
			
				totalSuma += alumnosNotasPRG [alumnosNotasPRG.length-1-columna][columna];
			
		}
		System.out.println(totalSuma);
		
	}

}
