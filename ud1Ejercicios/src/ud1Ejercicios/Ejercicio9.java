/*Si se ejecuta la siguiente secuencia de instrucciones, ¿se produce una división por cero?
int j = -2;
boolean b = (j > 0) && (1/(j+2) > 10);
*/

package ud1Ejercicios;

public class Ejercicio9 {

	public static void main(String[] args) {
		int j = -2;
		boolean b = (j > 0) && (1/(j+2) > 10);
		
		//No se produciría, ya que la primera expresión lógica es false

	}

}
