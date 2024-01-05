/*
 * Entrada
La entrada estará compuesta de multiples casos de prueba.

comenzará con un número indicando el número de montañas de una determinada cordillera montañosa que avanza de Oeste a Este.
A continuación se indicarán las alturas (en metros, sin decimales) de cada una de esas montañas, comenzando con la situada más al Oeste. Ninguna cordillera tendrá más de 100.000 montañas.

La entrada terminará con una cordillera sin montañas, que no debe procesarse.

Salida
Para cada caso de prueba se debe indicar el número máximo de abadías que se pueden construir en esa cordillera montañosa. Sólo se pueden construir abadías en las cimas que sean más altas que todas las montañas que tengan al Este.
 */



package AceptaElReto;

import java.util.Scanner;

public class AbadiasPirenaicas171 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int numMontanas = sc.nextInt();
            
            if (numMontanas == 0) {
                break;
            }
            
            int[] alturas = new int[numMontanas];
            
            for (int i = 0; i < numMontanas; i++) {
                alturas[i] = sc.nextInt();
            }
            
            int maxAbadias = calcularMaxAbadias(alturas);
            
            System.out.println(maxAbadias);
        }
        
        sc.close();
    }
    
    public static int calcularMaxAbadias(int[] alturas) {
        int maxAbadias = 0;
        int maxAlturaEste = Integer.MIN_VALUE;
        
        for (int i = alturas.length - 1; i >= 0; i--) {
            if (alturas[i] > maxAlturaEste) {
                maxAbadias++;
                maxAlturaEste = alturas[i];
            }
        }
        
        return maxAbadias;
    }
}
