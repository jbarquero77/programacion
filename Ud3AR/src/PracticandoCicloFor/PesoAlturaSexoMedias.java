/* Construye un programa que, al recibir como datos el peso, la altura, y el género de N personas, que pertenecen al estado de un país,
 * obtega el promedio del peso, y el promedio de la altura, tanto de la población masculina como femenina
 */


package PracticandoCicloFor;

import java.util.Scanner;

public class PesoAlturaSexoMedias {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n;
		float peso, altura;
		float pesoHombres=0, pesoMujeres =0;
		float alturaHombres =0, alturaMujeres =0;
		float cantidadHombres=0, cantidadMujeres =0;
		
		String genero;
		
		while (true) {
			
			System.out.println("Ingresa la cantidad de personas: ");
			n = sc.nextInt();
			
			if (n>0) {
				
				//Empezando por 1 y hasta llegar al número de personas
				for (int i=1; i <= n;i++) {
					
					//Le pedidos que introduzca el peso
					System.out.println("Ingresa el peso en Kg: ");
					peso = sc.nextFloat();
					
					//Le pedimos que ingrese la altura
					System.out.println("Ingresa la altura en M: ");
					altura = sc.nextFloat();
					
					while (true) {
						
						
						System.out.println("Ingresa el género de la persona: "+ "(M) (F)");
						genero = sc.next();
						
						if (genero.equalsIgnoreCase("M")) {
							pesoHombres +=peso;
							alturaHombres +=altura;
							cantidadHombres++;
							
							break;
						
						}else if (genero.equalsIgnoreCase("F")) {
							pesoMujeres +=peso;
							alturaMujeres +=altura;
							cantidadMujeres++;
							
							break;
							
						}else {
							System.out.println("Introduce una letra correcta. Ingresa una (M) o (F).");
						}
						
					}
				}
				
				
				
				System.out.println("Correcto");
				
				
				
			}else {
				System.out.println("El número introducido no es correcto.");
			}
		}
		
		
	}

}
