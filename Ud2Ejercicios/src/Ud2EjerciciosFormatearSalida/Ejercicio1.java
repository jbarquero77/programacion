/* Escribe un programa que muestre por pantalla 10 palabras en inglés junto a
su correspondiente traducción al castellano. Las palabras deben estar
distribuidas en dos columnas y alineadas a la izquierda.
Pista: Se puede insertar un tabulador mediante \t.  */

package Ud2EjerciciosFormatearSalida;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*System.out.println("house\tcasa");
		System.out.println("soccer\tfutbol");
		System.out.println("cat\tgato");
		System.out.println("mouse\tratón");
		System.out.println("course\tcurso");
		System.out.println("bag\tbolsa");
		System.out.println("hello\thola");
		System.out.println("people\tgente");
		System.out.println("car\tcoche");
		System.out.println("dog\tperro"); */
		
		//Para añadir espacios a la derecha, poner el signo -
		System.out.printf("%-20s%-20s\n", "Hola", "Hello");
		System.out.printf("%-20s%-20s", "cat", "gato");
		
		
	}

}
