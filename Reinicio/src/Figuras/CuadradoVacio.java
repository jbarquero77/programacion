package Figuras;

public class CuadradoVacio {

	public static void main(String[] args) {
		int lado = 5;
		
		for (int i=0; i<lado; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i =0; i<lado-2;i++){
			for (int j=0; j<lado;j++) {
				if (j==0 || j == lado-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i=0; i<lado; i++) {
			System.out.print("*");
		}

	}

}
