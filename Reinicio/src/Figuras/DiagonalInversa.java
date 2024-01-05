package Figuras;

public class DiagonalInversa {

	public static void main(String[] args) {
		int altura =5;
		
		for (int i =0; i<altura;i++) {
			for(int j=0; j<altura-1-i;j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}

	}

}
