package Funciones;

public class Ej5CajaCaracteres {

	public static void escribirRepetido (char letra, int nRepeticiones) {
			
			for (int i = 0; i <nRepeticiones;i++) {
				dibujarRectangulo (5,3,letra);
				System.out.println();
			}
			
		}
	
	public static void dibujarRectangulo(int lado, int altura, char letra) {
			
			for (int i =0; i<altura; i++) {
				for (int j=0; j<lado;j++) {
					System.out.print(letra);
				}
				System.out.println();	
			}
	}
	
	
	public static void main(String[] args) {
		
		escribirRepetido('A',5);
		
	}
	
	
	
}
