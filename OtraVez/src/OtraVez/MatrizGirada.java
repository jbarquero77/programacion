package OtraVez;

public class MatrizGirada {

	public static void main(String[] args) {
		int filas =3;
		int columnas =4;
		
		int matrizOriginal[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		int matrizGirada[][] = new int [columnas][filas];
		
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				matrizGirada[j][i] = matrizOriginal[i][j]; 
			}
		}
		
		for(int i=0;i<columnas;i++) {
			for(int j=0;j<filas;j++) {
				System.out.print(matrizGirada[i][j]+" ");
			}
			System.out.println();
		}

	}

}
