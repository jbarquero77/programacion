/*
 * Crear una función menu y mostrarla por pantalla
 */


package Ud5EstructurasEstaticasDeDatos;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Ej4aMenu {

	public static void menu() {
		
		System.out.println();
		System.out.println("Introduzca una opción entre el 1 y el 6:");
		System.out.println("1.-Introduce una cadena de carácteres: "); 
		System.out.println("2.- Introduce dos cadenas y dime cual es alfabéticamente mayor"); 
		System.out.println("3.-Concatena dos cadenas"); 
		System.out.println("4.-La cadena que esta entre los valores introducidos es: "); 
		System.out.println("5.-Invierte esta cadena"); 
		System.out.println("6.-Palindromo"); 
		System.out.println("7.-Salir"); 

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int option = 0;
			
		do {
			menu();
			
				option = sc.nextInt();
				sc.nextLine();
					switch (option) {
						case 1:
							String longitud ="";
							System.out.println("1.-Introduce una cadena de carácteres: ");
							longitud = sc.nextLine();
							int longitudCadena = longitud.length();
							System.out.printf("La cadena tiene %d carácteres %n", longitudCadena);
							
							break;
						
						case 2: 
							String primeraCadena = "";
							String segundaCadena = "";
							
							System.out.println("2.- Introduce dos cadenas y dime cual es alfabéticamente mayor: ");
							System.out.println("Introduce la primera cadena: ");
							primeraCadena = sc.nextLine();
							System.out.println("Introduce la segunda cadena: ");
							segundaCadena = sc.nextLine();
							
							if (primeraCadena.compareTo(segundaCadena) > 0) {
								System.out.println(segundaCadena);
							}else {
								System.out.println(primeraCadena);
							}
							
							
							break;
							
						case 3:
							String primerConca = "";
							String segunConca = "";
							String concatenadas ="";
							
							System.out.println("3.-Concatena dos cadenas"); 
							System.out.println("Introduce la primera cadena: ");
							primerConca = sc.nextLine();
							System.out.println("Introduce la segunda cadena: ");
							segunConca = sc.nextLine();
							
							concatenadas = primerConca.concat(segunConca);
							System.out.println(concatenadas);
												
							
							break;
							
						case 4:
							String cadenaComprovar = "";
							String cadenaResultado ="";
							int primerValor;
							int segundoValor;
							
							
							System.out.println("4.-La cadena que esta entre los valores introducidos es: "); 
							System.out.println("Introduce la cadena: ");
							cadenaComprovar = sc.nextLine();
							System.out.println("Introduce entre que valores quieres que este la cadena resultante: ");
							System.out.println("Introduce el primer valor: ");
							primerValor = sc.nextInt();
							System.out.println("Introduce el segundo valor: ");
							segundoValor = sc.nextInt();
							
							cadenaResultado = cadenaComprovar.substring(primerValor,segundoValor);
							System.out.println(cadenaResultado);
							
							
							break;
						case 5:
							String cadenaUsuario = "";
							String cadenaInvertida = "";
							
							
							System.out.println("Escribe la cadena que quieres invertir: ");
							cadenaUsuario = sc.nextLine();
							
							cadenaInvertida = reverse(cadenaUsuario);
							System.out.println(cadenaInvertida);
						        
							
							break;
						case 6: 
							String palindromo = "";
							
							System.out.println("Intruduce la palabra que quieres analiar: ");
							palindromo = sc.nextLine();
							
							System.out.println ("la palabra "+ palindromo + " es Palíndroma de: " + esPalindromo(palindromo));
							
							
							break;
						
						case 7:
							
							System.out.println("FIN");
							break;
												
						default:
							System.out.println("Introduzca del 1 a 6 para mostrar resultados: 7 para SALIR");
					  }
				}
		while (option != 7);
			
			 			
		}


	public static String reverse(String str) {
        // caso base: si la string es nula o está vacía
        if (str == null || str.equals("")) {
            return str;
        }
 
        // crea una lista vacía de caracteres
        List<Character> list = new ArrayList<Character>();
 
        // inserta todos los caracteres de la string dada en él
        for (char c: str.toCharArray()) {
            list.add(c);
        }
 
        // lista inversa usando `java.util.Collections` `reverse()`
        Collections.reverse(list);
 
        // convierte `ArrayList` en una cadena usando `StringBuilder` y lo devuelve
        StringBuilder builder = new StringBuilder(list.size());
        for (Character c: list) {
            builder.append(c);
        }
 
        return builder.toString();
	}
	
	public static boolean esPalindromo (String palabra) {
		
		String palabraInicial = "";
		String palabraGirada = palabraInicial.replaceAll("\\s", "").toLowerCase();
		
		 int longitud = palabraGirada.length();
	        for (int i = 0; i < longitud / 2; i++) {
	            if (palabraGirada.charAt(i) != palabraGirada.charAt(longitud - 1 - i)) {
	                return false;
	            }
	        }
	        return true;
		
	}

}
