package Figuras;

public class TrianguloNormalHueco {

	public static void main(String[] args) {
		int altura =5;
		
		for(int i=0; i<altura; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int i=0; i<altura-2;i++) {
			System.out.print("*");
			for(int j=1; j<altura-2-i;j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		System.out.println("*");
	}

}
