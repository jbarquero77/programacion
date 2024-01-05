package OtraVez;

import java.util.Scanner;

public class NumPalindromo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero = sc.nextInt();
		
		int original = numero;
		int girado = 0;
		
		do {
			int digito = numero%10;
			girado = girado*10+digito;
			numero/=10;
		}while(numero !=0);
		
		if(original == girado) {
			System.out.println("Es palíndromo");
		}else {
			System.out.println("No es palindromo");
		}
	}

}
