/**
 *  Ejercicio 1 - Iniciación a JAVA
 * 
 *  Leer una cantidad 'N' números neteros.
 *  Se le pide imprimir el mayor y el menor y las veces que aparece cada uno.
 * 
 *  Ejemplo para entrada: N = 5 --- 3, 3, 8, 1, 8
 *  Salida. El mínimo es 1 y aparece 1 vez
 *          El máximo es 8 y aparece 2 veces
 *  
 */

 import java.util.Scanner;
 public class ejer1Iniciacion {
    
    public static void main (String [] args) {
        Scanner entrada = new Scanner (System.in);
        int cantidadNumeros, numActual;
        int contador = 0, max = 0, min = 0, contadorMax = 1, contadorMin = 1;

        System.out.println( "¿Cuántos números quieres introducir?");
        cantidadNumeros = entrada.nextInt();

        while (contador < cantidadNumeros) {
            System.out.println ("Introduce un número: " + (contador + 1) + " de " + cantidadNumeros);
            numActual = entrada.nextInt();

            if (contador == 0) {
                max = numActual;
                min = numActual;
            } else{
                // Nuevo máximo
                if (numActual > max) {
                    max = numActual;
                    contadorMax = 1;
                }
                // mismo máximo
                else if (numActual== max)
                    contadorMax++;

                // Nuevo mínmo
                if (numActual< min) {
                    min = numActual;
                    contadorMin = 1;
                }

                // Mismo Mínimo
                else if (numActual== min)
                    contadorMin++;

                }
                contador ++;
        }
        System.out.println(
            "El mínimo es " + min + " y aparece " + contadorMin + " " + (contadorMin == 1 ? "vez" : "veces"));
        System.out.println(
            "El máximo es " + max + " y aparece " + contadorMax + " " + (contadorMax == 1 ? "vez" : "veces"));
            entrada.close();
        
   
    }    
    
 }