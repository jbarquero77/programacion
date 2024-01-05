/*  En Linux existe el comando “clear” que nos permite “limpiar” la consola cuando tenemos mucho texto que ya no es útil.
 *  Su equivalente en Windows es “cls”.
 *  Realmente lo que hace este comando es insertar muchas líneas en blanco de manera que parece que desaparecen el texto que había anteriormente.
 *  Vamos a simular este comportamiento escribiendo un programa que borre la pantalla dibujando 25 líneas en blanco.
 *  Implementa y utiliza la función: void borrarPantalla() 
 * 
 * */

package Funciones;

public class Ej1Borrar {

	public static void main(String[] args) {
		for (int i=0; i <= 10; i++) {
			System.out.println(i);
		}
		borrarPantalla();

	}
	
	public static void borrarPantalla() {
		
		for (int i=0; i <= 25; i++) {
			System.out.println();
		}
		
	}

}
