package Examen20191114;

public class Ejercicio1 {
	
	public static double calcular1Norma(double[][] matriz) {
        int n = matriz.length;
        double maxSuma = 0;

        for (int j = 0; j < n; j++) {
            double sumaColumna = 0;
            for (int i = 0; i < n; i++) {
                sumaColumna += Math.abs(matriz[i][j]);
            }
            if (sumaColumna > maxSuma) {
                maxSuma = sumaColumna;
            }
        }

        return maxSuma;
    }
	
	
	 public static int[][] multiplicarMatrizDiagonal(int[][] matriz, int entero) {
	        int n = matriz.length;
	        int[][] resultado = new int[n][n];

	        for (int i = 0; i < n; i++) {
	            resultado[i][i] = matriz[i][i] * entero;
	        }

	        return resultado;
	    }
	 
	 
	
	
	
}
