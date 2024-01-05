/*
 * Crea un vector de 20 números reales correspondientes a los pesos de 20 personas.
 * obtener el peso mayor, el menor, el peso medio 
 * visualizar un mensaje si hay alguna persona con un peso mayor de 100kg
 * 
 * 
 */


package Arrays;

import java.util.Random;

public class Pesos {
	
	public static void llenarMatriz (double[] pesos) {
		Random ran = new Random ();
		
		for (int i=0; i<pesos.length; i++) {
			pesos[i] = ran.nextDouble(150);
		}
		
	}
	
	public static double pesoMayor (double[]pesos) {
		double mayor =0;
		
		for (int i = 0; i<pesos.length; i++) {
			if (pesos[i] > mayor) {
				mayor = pesos[i];
			}
		}
		
		return mayor;
	}
	
	public static double pesoMenor (double[]pesos) {
		double menor =0;
		
		for (int i = 0; i<pesos.length; i++) {
			if (pesos[i] < menor) {
				menor = pesos[i];
			}
		}
		
		return menor;
	}
	
	public static double pesoMedio (double []pesos) {
		double suma =0;
		for (double peso : pesos) {
			suma +=peso;
		}
		
		return suma / pesos.length;
	}
	
	public static void verificarPesoMayor100 (double[]pesos) {
		for (double peso : pesos) {
			if (peso>100) {
				System.out.println("Hay una persona con un peso mayor que 100kg");
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		double pesos [] = new double [20];
		
		llenarMatriz(pesos);
		
		double pesoMayor = pesoMayor(pesos);
		double pesoMenor = pesoMenor(pesos);
		double pesoMedio = pesoMedio (pesos);
		
		System.out.printf("El peso mayor es %.2f kg%n", pesoMayor);
		System.out.printf("El peso menor es %.2f kg%n", pesoMenor);
		System.out.printf("El peso medio es %.2f kg%n", pesoMedio);
		
		verificarPesoMayor100(pesos);
		

	}

}
