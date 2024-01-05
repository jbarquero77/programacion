package Ud3Test;


public class Ejercicio1 {

	public static void main(String[] args) {
		
		int x = 10;
		char c = 'y';
		
		if (x < 0) {
			if ( c == 'x') {
				System.out.println("Caso 1");
			}
		} else if (x < 0) {
			if ( c != 'x') {
				System.out.println("Caso 2");
			}
		}else if (x >= 0) {
			if (c =='y') {
				System.out.println("Caso 3");
			}
		}else if (x >= 0) {
			if (c !='y') {
				System.out.println("Caso 4");
			}
		}
	

	}

}
