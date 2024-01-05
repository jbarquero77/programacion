package DibujaFiguras;

import java.util.Scanner;

public class TrianguloHuecoDecrecienteEspacios {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int altura = sc.nextInt();
		
		for (int fila = 0; fila < altura; fila++) {
			System.out.print("*");
		}
		

	}

}
