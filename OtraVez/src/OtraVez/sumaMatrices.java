package OtraVez;

public class sumaMatrices {

	public static void main(String[] args) {
		
		int filas = 3;
		int columnas =3;
		
		int[][]matriz1 = {{1,2,3},{4,5,6},{7,8,9}};
		
		int [][] matriz2 = {{9,8,7},{6,5,4},{3,2,1}};
		
		int [][]sumaMatrices = new int [filas][columnas];
		
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				sumaMatrices[i][j] = matriz1[i][j]+matriz2[i][j];
				System.out.print(sumaMatrices[i][j]+ " ");
			}
			System.out.println();
		}
		

	}

}
