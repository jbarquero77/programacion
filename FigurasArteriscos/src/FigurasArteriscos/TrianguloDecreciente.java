package FigurasArteriscos;

public class TrianguloDecreciente {

	public static void main(String[] args) {
				
		int filas = 5;
		
		for (int i = 0; i < filas; i++) {                  
		    for (int j = filas - 1 - i; j >= 0; j--) {  
		        System.out.print("*");                     
		    }
		    System.out.println("");                       
		}
	}
}
