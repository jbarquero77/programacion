package FigurasArteriscos;

public class TrianguloEmpiezaEspacios {

	public static void main(String[] args) {
		int altura = 5;
		
		for(int i =0; i<altura;i++) {
			for(int j = altura-2-i;j>=0;j--) {
				System.out.print("-");
			}
			for(int j = 0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
