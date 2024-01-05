package TresEnRaya;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TresEnRaya {
	
	private static final char JUGADOR_X = 'X';
    private static final char JUGADOR_O = 'O';

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        char[][] tablero = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
	        char jugadorActual = JUGADOR_X;
	        int partidasGanadasX = 0;
	        int partidasGanadasO = 0;

	        do {
	            mostrarTablero(tablero);

	            int fila = -1, columna = -1;

	            try {
	                do {
	                    System.out.println("Jugador " + jugadorActual + ", ingresa fila (1-3) y columna (1-3): ");
	                    fila = scanner.nextInt() - 1;
	                    columna = scanner.nextInt() - 1;
	                } while (!esMovimientoValido(tablero, fila, columna));
	            } catch (InputMismatchException e) {
	                System.out.println("Error: Ingresa valores numéricos para la fila y la columna.");
	                scanner.nextLine(); // Limpiar el buffer de entrada
	                continue; // Vuelve al inicio del bucle
	            }

	            tablero[fila][columna] = jugadorActual;

	            if (hayGanador(tablero, jugadorActual)) {
	                mostrarTablero(tablero);
	                System.out.println("¡Jugador " + jugadorActual + " ha ganado!");
	                actualizarEstadisticas(jugadorActual, partidasGanadasX, partidasGanadasO);
	                reiniciarTablero(tablero);
	            } else if (tableroCompleto(tablero)) {
	                mostrarTablero(tablero);
	                System.out.println("¡Empate!");
	                reiniciarTablero(tablero);
	            }

	            jugadorActual = (jugadorActual == JUGADOR_X) ? JUGADOR_O : JUGADOR_X;
	        } while (quiereJugarDeNuevo(scanner));

	        System.out.println("Partidas ganadas por X: " + partidasGanadasX);
	        System.out.println("Partidas ganadas por O: " + partidasGanadasO);
	    }

	    public static void mostrarTablero(char[][] tablero) {
	        System.out.println("-------------");
	        for (int i = 0; i < 3; i++) {
	            System.out.print("| ");
	            for (int j = 0; j < 3; j++) {
	                System.out.print(tablero[i][j] + " | ");
	            }
	            System.out.println();
	            System.out.println("-------------");
	        }
	    }

	    public static boolean esMovimientoValido(char[][] tablero, int fila, int columna) {
	        return fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ';
	    }

	    public static boolean hayGanador(char[][] tablero, char jugador) {
	        // Verificar filas, columnas y diagonales
	        for (int i = 0; i < 3; i++) {
	            if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) ||
	                (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) {
	                return true;
	            }
	        }
	        return (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) ||
	               (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador);
	    }

	    public static boolean tableroCompleto(char[][] tablero) {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (tablero[i][j] == ' ') {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }

	    public static void reiniciarTablero(char[][] tablero) {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                tablero[i][j] = ' ';
	            }
	        }
	    }

	    public static boolean quiereJugarDeNuevo(Scanner scanner) {
	        System.out.println("¿Deseas jugar de nuevo? (Sí/No): ");
	        String respuesta = scanner.next().toLowerCase();
	        return respuesta.equals("si") || respuesta.equals("sí");
	        
	    }
	    
	    public static void actualizarEstadisticas(char jugadorActual, int partidasGanadasX, int partidasGanadasO) {
	        if (jugadorActual == JUGADOR_X) {
	            partidasGanadasX++;
	        } else {
	            partidasGanadasO++;
	        }
	    }
}
