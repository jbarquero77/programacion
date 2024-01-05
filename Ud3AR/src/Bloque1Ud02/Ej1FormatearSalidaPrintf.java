/*
 * Desarrolla el siguiente programa en Java para practicar el formateo de salida usando el método printf. 
 * Puedes ajustar los valores y formatos según tus necesidades. 
 * a) Imprime un entero: Declara una variable llamada "numero" con un valor entero y muestra ese número en la consola.
 *  b) Imprime un número decimal: Declara una variable llamada "decimal" con un valor decimal y muestra ese número con dos decimales en la consola. 
 *  c) Imprime una cadena: Declara una variable llamada "texto" con una cadena y muestra ese texto en la consola. 
 *  d) Imprime un carácter: Declara una variable llamada "caracter" con un valor de carácter y muestra ese carácter en la consola. 
 *  e) Imprime un valor booleano: Declara una variable llamada "esVerdadero" con un valor booleano y muestra ese valor en la consola.
 *  f) Imprime un número en notación científica: Declara una variable llamada "cientifico" con un valor decimal y muestra ese número en notación científica en la consola. 
 *  g) Imprime un número como porcentaje: Declara una variable llamada "porcentaje" con un valor decimal entre 0 y 1 y muestra ese número como un porcentaje en la consola. 
 *  h) Formatea un número grande con comas: Declara una variable llamada "grande" con un valor largo y muestra ese número con comas para separar miles en la consola. i) Alinea a la derecha e imprime un número: Declara una variable llamada "alinearDerecha" con un valor entero y muestra ese número alineado a la derecha en la consola. 
 *  j) Imprime una fecha formateada: Declara tres variables, "dia," "mes," y "anio," con valores enteros y muestra la fecha en el formato "dd/mm/yyyy" en la consola. 
 * Asegúrate de que el día y el mes tengan siempre dos dígitos. 
 */


package Bloque1Ud02;

public class Ej1FormatearSalidaPrintf {

	public static void main(String[] args) {
		int numero = 15;
		System.out.printf("%d %n", numero) ;  // 15
		
		float numeroDecimal = 15.5f;
		System.out.printf("%f %n", numeroDecimal); // 15,500000 
		
		String texto = "José Barquero";
		System.out.printf("%s %n", texto); // José Barquero
		
		char caracter = 'B';
		System.out.printf("%c %n", caracter); //B
		
		boolean esVerdadero = true;
		System.out.printf("%b %n", esVerdadero); //true 
	
		float cientifico = 15.3456f;
		System.out.printf("%e %n",cientifico); //1,534560e+01
		
		int grande = 1345643899; // número grande, mostrar separado por puntos
		System.out.printf("%,d %n",grande);  // 1.345.643.899 
		
		int alinearDerecha = 123;
			// Imprime el número alineado a la derecha en la consola
			System.out.printf(" %8d%n", alinearDerecha); //       123
		int dia = 1;
		int mes = 7;
		int anio =1997;
		System.out.printf("%02d/%02d/%04d %n", dia, mes, anio); // Muestra fechas separadas por "/" y se asegura de las cifras de cada variable
		
		
		
		
		
		
		
	}

}

