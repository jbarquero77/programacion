// Pide un número positivo y mostrar la tabla de multiplicar

package PracticandoCicloFor;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num;
		
		do {
			System.out.println("Ingresa un número");
			num = sc.nextInt();
		
		// Controlamos los elementos (miestras que se de esta condicion "número entre 0 y 10)
		}while (!(0<= num && num <=10));
			// Empiza por 1 y muestrame 10 veces
			for (int i =1; i<=10;i++) {
				System.out.println(num+ " x "+i+" = "+num*i);
			}

	}

}
