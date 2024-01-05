/*
 * Ejercicio1. java
 * 
 * JOSÉ MANUEL BARQUERO MARS
 * 
 * Crea una función que, dada una cadena de texto, devuelva la misma
cadena pero cada una de las palabras que contiene al revés,
manteniendo las mayúsculas y minúsculas en las posiciones originales.
Realiza las siguientes pruebas en el método principal (main):
 * 
 */





package Examen;


public class Ejercicio2 {
	
	public static String cadenaAlReves (String cadena) {
		
		String[] palabras = cadena.split("\\s+");
        StringBuilder resultado = new StringBuilder();
        int posicionMayuscula =0;

        for (String palabra : palabras) {
            palabra = palabra.toLowerCase();

            if (Character.isUpperCase(cadena.charAt(posicionMayuscula))) {
            	palabra = Character.toUpperCase(palabra.charAt(0)) + palabra.substring(1);
            }
            resultado.append(palabra).append(" ");
            posicionMayuscula += palabra.length()+1;
        }   
        return resultado.toString().trim();
	}    
				
	public static void main(String[] args) {
		String cadena = "HoY Es Un GraN DiA";
		
		String resultado = cadenaAlReves(cadena);
		System.out.println(resultado);
	}

}
