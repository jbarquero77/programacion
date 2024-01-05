/* En la TIA (Organización de Técnicos de Investigación Aero
terráquea) han perdido los datos de las nóminas por culpa del
programa que el Profesor Bacterio escribió para gestionar las
notas de sus alumnos.
Te han contratado de urgencia y, por favor, no se puede enterar
el Profesor Bacterio de todo esto. Tu misión secretísima será
escribir un programita que te vaya pidiendo los sueldos de cada
uno de los empleados. Al terminar, el programa informará de cuál es el sueldo máximo
y mínimo que se cobra en esta desastrosa organización.
Como nadie te dice nada, supones que el programa te pedirá al principio la cantidad
de sueldos que quieras introducir.
Ejemplo de ejecución del programa
*/

package Mortadelo;

import java.util.Scanner;

public class SueldosTIA {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Cuántos empleados quiere introducir? ");
		int empleado = sc.nextInt();
		
		int sueldoMax = 0;
		int sueldoMin = 0;
		
		if (empleado <=0) {
			System.out.print("Introduce un número positivo de empleados");
		}else {
			
			System.out.print("Introduce el sueldo del empleado 1 ");
			int sueldo = sc.nextInt();
			
			sueldoMax = sueldo;
			sueldoMin = sueldo;
			
			for (int i =0; i <empleado-1;i++) {

				System.out.printf("Introduce el sueldo del empleado %d:", (i+2));
				sueldo = sc.nextInt();
				if (sueldo >= sueldoMax) {
					sueldoMax = sueldo;
				}else {
					if (sueldo <= sueldoMin) {
					sueldoMin = sueldo;
					}
				}
			}
			System.out.printf("Sueldo máximo: %d\n",sueldoMax);
			System.out.printf("Sueldo minimo: %d ",sueldoMin);
		}
		
	}

}
