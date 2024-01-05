package ud02Test;

import java.util.Scanner;

public class ProbandoScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el número de clase:");
		int numClase = sc.nextInt();
		
		//Captura el salto de línea porque en numeros guarda el intro como \n y lo guarda y el nextLine siguiente si lee el \n
		
		sc.nextLine();
		
		System.out.println("Introduce el nombre de alumno: ");
		String nombre = sc.nextLine();
		
		//En este caso no hace falta poner el nextLine porque los números no leen el \n
		System.out.println("Introduce la nota: ");
		double nota = sc.nextDouble();
		
		sc.close();

	}

}
