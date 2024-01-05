package Examen20191114;

import java.util.Random;

public class SopaLetras1 {

	 public static void main(String[] args) {
	        String[] palabras = {"esa", "edu", "mus", "mar", "ora", "aro", "uva", "ufo", "mes", "oso", "ron", "seo", "pus", "rol", "rio", "oir", "muy", "ras", "ivi", "ojo", "uvi", "veo", "pum", "bus", "gal", "mas"};
	        char[][] sopa = generarSopaDeLetras();
	        imprimirSopaDeLetras(sopa);
	        System.out.println();
	        imprimirPalabrasEncontradas(sopa, palabras);
	 }

	 public static char[][] generarSopaDeLetras() {
	        char[][] sopa = new char[20][20];
	        Random random = new Random();

	        for (int i = 0; i < 20; i++) {
	            for (int j = 0; j < 20; j++) {
	                sopa[i][j] = (char) (random.nextInt(26) + 'a');
	            }
	        }

	        return sopa;
	  }

	  public static void imprimirSopaDeLetras(char[][] sopa) {
	        for (int i = 0; i < 20; i++) {
	            for (int j = 0; j < 20; j++) {
	                System.out.print(sopa[i][j] + " ");
	            }
	            System.out.println();
	        }
	   }

	    public static void imprimirPalabrasEncontradas(char[][] sopa, String[] palabras) {
	        for (String palabra : palabras) {
	            boolean encontrada = buscarPalabra(sopa, palabra);
	            if (encontrada) {
	                System.out.println("La palabra \"" + palabra + "\" ha sido encontrada.");
	            } else {
	                System.out.println("La palabra \"" + palabra + "\" no ha sido encontrada.");
	            }
	        }
	    }

	    public static boolean buscarPalabra(char[][] sopa, String palabra) {
	        int n = sopa.length;
	        int m = sopa[0].length;

	        // Buscar de izquierda a derecha
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j <= m - palabra.length(); j++) {
	                boolean encontrada = true;
	                for (int k = 0; k < palabra.length(); k++) {
	                    if (sopa[i][j + k] != palabra.charAt(k)) {
	                        encontrada = false;
	                        break;
	                    }
	                }
	                if (encontrada) {
	                    return true;
	                }
	            }
	        }

	        // Buscar de arriba a abajo
	        for (int i = 0; i <= n - palabra.length(); i++) {
	            for (int j = 0; j < m; j++) {
	                boolean encontrada = true;
	                for (int k = 0; k < palabra.length(); k++) {
	                    if (sopa[i + k][j] != palabra.charAt(k)) {
	                        encontrada = false;
	                        break;
	                    }
	                }
	                if (encontrada) {
	                    return true;
	                }
	            }
	        }

	        // Buscar en diagonal de izquierda a derecha
	        for (int i = 0; i <= n - palabra.length(); i++) {
	            for (int j = 0; j <= m - palabra.length(); j++) {
	                boolean encontrada = true;
	                for (int k = 0; k < palabra.length(); k++) {
	                    if (sopa[i + k][j + k] != palabra.charAt(k)) {
	                        encontrada = false;
	                        break;
	                    }
	                }
	                if (encontrada) {
	                    return true;
	                }
	            }
	        }

	        // Buscar en diagonal de derecha a izquierda
	        for (int i = 0; i <= n - palabra.length(); i++) {
	            for (int j = palabra.length() - 1; j < m; j++) {
	                boolean encontrada = true;
	                for (int k = 0; k < palabra.length(); k++) {
	                    if (sopa[i + k][j - k] != palabra.charAt(k)) {
	                        encontrada = false;
	                        break;
	                    }
	                }
	                if (encontrada) {
	                    return true;
	                }
	            }
	        }

	        return false;
	    }

}
