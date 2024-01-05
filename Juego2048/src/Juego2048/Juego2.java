package Juego2048;

import java.util.Random;
import java.util.Scanner;

public class Juego2 {
	
	private static int[][] tablero;
    private static int TAMANO_TABLERO;
    private static int puntuacion;
    
    private static final String RESET = "\u001B[0m";
    private static final String Rojo = "\u001B[31m";
    private static final String Verde = "\u001B[32m";
    private static final String Amarillo = "\u001B[33m";
    private static final String Azul = "\u001B[34m";
    private static final String Morado = "\u001B[35m";
    private static final String Cyan = "\u001B[36m";

	public static void main(String[] args) {
		 System.out.println("¡Bienvenido al juego 2048!");
	        while (true) {
	            seleccionarTamanioTablero();
	            iniciarJuego();
	            System.out.print("¿Quieres jugar de nuevo? (s/n): ");
	            Scanner scanner = new Scanner(System.in);
	            if (!scanner.nextLine().equalsIgnoreCase("s")) {
	                System.out.println("¡Gracias por jugar! ¡Hasta luego!");
	                break;
	            }
	        }
	    }

	    private static void seleccionarTamanioTablero() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Selecciona el tamaño del tablero:");
	        System.out.println("1. Pequeño (3x3)");
	        System.out.println("2. Mediano (4x4)");
	        System.out.println("3. Grande (5x5)");

	        int opcion = scanner.nextInt();
	        switch (opcion) {
	            case 1:
	                TAMANO_TABLERO = 3;
	                break;
	            case 2:
	                TAMANO_TABLERO = 4;
	                break;
	            case 3:
	                TAMANO_TABLERO = 5;
	                break;
	            default:
	                System.out.println("Opción no válida. Seleccionando tamaño mediano (4x4) por defecto.");
	                TAMANO_TABLERO = 4;
	        }

	        tablero = new int[TAMANO_TABLERO][TAMANO_TABLERO];
	    }

	    private static void iniciarJuego() {
	        tablero = new int[TAMANO_TABLERO][TAMANO_TABLERO];
	        puntuacion = 0;

	        generarNuevaFicha();
	        generarNuevaFicha();

	        // Bucle principal del juego
	        while (true) {
	            imprimirTablero();
	            String direccion = obtenerDireccion();
	            moverFichas(direccion);
	            generarNuevaFicha();
	            
	            if (verificarEstadoJuego()) {
	                reiniciarJuego();
	                break;
	            }
	        }
	    }

	    private static void reiniciarJuego() {
	        System.out.println("Puntuación final: " + puntuacion);
	        System.out.print("¿Quieres jugar de nuevo? (s/n): ");
	        Scanner scanner = new Scanner(System.in);
	        if (scanner.nextLine().equalsIgnoreCase("s")) {
	            iniciarJuego();
	        } else {
	            System.out.println("¡Gracias por jugar! ¡Hasta luego!");
	            System.exit(0);
	        }
	    }

	    private static void generarNuevaFicha() {
	        Random rand = new Random();
	        int fila, columna;

	        do {
	            fila = rand.nextInt(TAMANO_TABLERO);
	            columna = rand.nextInt(TAMANO_TABLERO);
	        } while (tablero[fila][columna] != 0);

	        // Generar un 2 o 4 con mayor probabilidad de ser 2
	        int fichaNueva = (rand.nextInt(10) < 9) ? 2 : 4;

	        tablero[fila][columna] = fichaNueva;

	        // Actualizar la puntuación al generar una nueva ficha
	        puntuacion += fichaNueva;
	    }
	    // no funciona bien. deberia imprimir los ginones de las lineas 112 ajustadas al tamaño del tablero
	    private static void imprimirTablero() {
	        System.out.println("+---------------------+");
	        for (int fila = 0; fila < TAMANO_TABLERO; fila++) {
	            System.out.print("| ");
	            for (int col = 0; col < TAMANO_TABLERO; col++) {
	                imprimirCelda(tablero[fila][col]);
	                System.out.print(" | ");
	            }
	            System.out.println("\n+---------------------+");
	            
	        }
	        System.out.println("| 0  | 1  | 2  | 3  | 4  |");  // tengo que ajustar esta fila
	        System.out.println();
	        System.out.println("Puntuación: " + puntuacion);
	        System.out.println();
	    }

	    private static void imprimirCelda(int valor) {
	        if (valor == 0) {
	            System.out.print(" \t"); // Espacio para celdas vacías
	        } else {
	            System.out.print(valor + "\t");
	        }
	    }
	    private static String obtenerDireccion() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingresa la dirección (w/a/s/d): ");
	        return scanner.nextLine().toLowerCase();
	    }
	    
	    
	    private static String elegirColor(int valor) {
	        switch (valor) {
	            case 2:
	                return Rojo;
	            case 4:
	                return Verde;
	            case 8:
	                return Amarillo;
	            case 16:
	                return Azul;
	            case 32:
	                return Morado;
	            case 64:
	                return Cyan;
	            default:
	                return RESET;
	        }
	    }


	    private static void moverFichas(String direccion) {
	        switch (direccion) {
	            case "w":
	                moverArriba();
	                break;
	            case "a":
	                moverIzquierda();
	                break;
	            case "s":
	                moverAbajo();
	                break;
	            case "d":
	                moverDerecha();
	                break;
	            default:
	                System.out.println("Dirección no válida. Inténtalo de nuevo.");
	        }
	    }

	    private static void moverArriba() {
	        for (int col = 0; col < TAMANO_TABLERO; col++) {
	            for (int fila = 1; fila < TAMANO_TABLERO; fila++) {
	                if (tablero[fila][col] != 0) {
	                    int filaDestino = fila;
	                    while (filaDestino > 0 && tablero[filaDestino - 1][col] == 0) {
	                        tablero[filaDestino - 1][col] = tablero[filaDestino][col];
	                        tablero[filaDestino][col] = 0;
	                        filaDestino--;
	                    }
	                    if (filaDestino > 0 && tablero[filaDestino - 1][col] == tablero[filaDestino][col]) {
	                        tablero[filaDestino - 1][col] *= 2;
	                        tablero[filaDestino][col] = 0;
	                        puntuacion += tablero[filaDestino - 1][col];
	                    }
	                }
	            }
	        }
	    }

	    private static void moverIzquierda() {
	        for (int fila = 0; fila < TAMANO_TABLERO; fila++) {
	            for (int col = 1; col < TAMANO_TABLERO; col++) {
	                if (tablero[fila][col] != 0) {
	                    int colDestino = col;
	                    while (colDestino > 0 && tablero[fila][colDestino - 1] == 0) {
	                        tablero[fila][colDestino - 1] = tablero[fila][colDestino];
	                        tablero[fila][colDestino] = 0;
	                        colDestino--;
	                    }
	                    if (colDestino > 0 && tablero[fila][colDestino - 1] == tablero[fila][colDestino]) {
	                        tablero[fila][colDestino - 1] *= 2;
	                        tablero[fila][colDestino] = 0;
	                        puntuacion += tablero[fila][colDestino - 1];
	                    }
	                }
	            }
	        }
	    }

	    private static void moverAbajo() {
	        for (int col = 0; col < TAMANO_TABLERO; col++) {
	            for (int fila = TAMANO_TABLERO - 2; fila >= 0; fila--) {
	                if (tablero[fila][col] != 0) {
	                    int filaDestino = fila;
	                    while (filaDestino < TAMANO_TABLERO - 1 && tablero[filaDestino + 1][col] == 0) {
	                        tablero[filaDestino + 1][col] = tablero[filaDestino][col];
	                        tablero[filaDestino][col] = 0;
	                        filaDestino++;
	                    }
	                    if (filaDestino < TAMANO_TABLERO - 1 && tablero[filaDestino + 1][col] == tablero[filaDestino][col]) {
	                        tablero[filaDestino + 1][col] *= 2;
	                        tablero[filaDestino][col] = 0;
	                        puntuacion += tablero[filaDestino + 1][col];
	                    }
	                }
	            }
	        }
	    }

	    private static void moverDerecha() {
	        for (int fila = 0; fila < TAMANO_TABLERO; fila++) {
	            for (int col = TAMANO_TABLERO - 2; col >= 0; col--) {
	                if (tablero[fila][col] != 0) {
	                    int colDestino = col;
	                    while (colDestino < TAMANO_TABLERO - 1 && tablero[fila][colDestino + 1] == 0) {
	                        tablero[fila][colDestino + 1] = tablero[fila][colDestino];
	                        tablero[fila][colDestino] = 0;
	                        colDestino++;
	                    }
	                    if (colDestino < TAMANO_TABLERO - 1 && tablero[fila][colDestino + 1] == tablero[fila][colDestino]) {
	                        tablero[fila][colDestino + 1] *= 2;
	                        tablero[fila][colDestino] = 0;
	                        puntuacion += tablero[fila][colDestino + 1];
	                    }
	                }
	            }
	        }
	    }


	    private static boolean verificarEstadoJuego() {
	        if (alcanzar2048()) {
	            System.out.println("¡Felicidades! Has alcanzado 2048. ¡Has ganado!");
	            return true;
	        }

	        if (!hayMovimientosPosibles()) {
	            System.out.println("Game over. No hay movimientos posibles.");
	            reiniciarJuego();
	            return true;
	        }

	        return false;
	    }

	    private static boolean alcanzar2048() {
	        for (int[] fila : tablero) {
	            for (int celda : fila) {
	                if (celda == 2048) {
	                    return true;
	                }
	            }
	        }
	        return false;
	    }

	    private static boolean hayMovimientosPosibles() {
	        // Verifica si hay movimientos disponibles en alguna dirección
	        return puedoMoverArriba() || puedoMoverIzquierda() || puedoMoverAbajo() || puedoMoverDerecha();
	    }

	    private static boolean puedoMoverArriba() {
	        for (int col = 0; col < TAMANO_TABLERO; col++) {
	            for (int fila = 1; fila < TAMANO_TABLERO; fila++) {
	                if (tablero[fila][col] != 0 && (tablero[fila - 1][col] == 0 || tablero[fila][col] == tablero[fila - 1][col])) {
	                    return true;
	                }
	            }
	        }
	        return false;
	    }

	    private static boolean puedoMoverIzquierda() {
	        for (int fila = 0; fila < TAMANO_TABLERO; fila++) {
	            for (int col = 1; col < TAMANO_TABLERO; col++) {
	                if (tablero[fila][col] != 0 && (tablero[fila][col - 1] == 0 || tablero[fila][col] == tablero[fila][col - 1])) {
	                    return true;
	                }
	            }
	        }
	        return false;
	    }

	    private static boolean puedoMoverAbajo() {
	        for (int col = 0; col < TAMANO_TABLERO; col++) {
	            for (int fila = TAMANO_TABLERO - 2; fila >= 0; fila--) {
	                if (tablero[fila][col] != 0 && (tablero[fila + 1][col] == 0 || tablero[fila][col] == tablero[fila + 1][col])) {
	                    return true;
	                }
	            }
	        }
	        return false;
	    }

	    private static boolean puedoMoverDerecha() {
	        for (int fila = 0; fila < TAMANO_TABLERO; fila++) {
	            for (int col = TAMANO_TABLERO - 2; col >= 0; col--) {
	                if (tablero[fila][col] != 0 && (tablero[fila][col + 1] == 0 || tablero[fila][col] == tablero[fila][col + 1])) {
	                    return true;
	                }
	            }
	        }
	        return false;
	    }

}
