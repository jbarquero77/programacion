package OtraVez;

public class TableroAjedrez {

	public static void main(String[] args) {
		int filas = 8;
		int columnas =8;
		
		for(int i =0; i<filas; i++) {
			for(int j =0; j<columnas; j++) {
				if ((i+j)%2!=0) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
