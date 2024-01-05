package ud02Test;

import java.util.Scanner;

public class ProbandoPrintf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 8;
		int b = 3;
		int resultado = 0;
		
		resultado = (a+b);
		System.out.printf("La suma es: %d \n", resultado);
		System.out.printf("La suma de %d y %d es: %d\n", a, b, resultado);
		
		resultado =(a-b);
		System.out.printf("La resta es: %d \n", resultado);
		
		
		
		System.out.printf("La resta de %d y %d es: %d\n", a, b, resultado);
		
	}

}
