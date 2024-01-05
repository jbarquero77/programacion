package TresEnRaya2;

import java.util.Scanner;

public class TresEnRaya {

	static char[][] tablero = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	static char jugadorActual = 'X';
	static int partidasGanadasJugadorX = 0;
	static int partidasGanadasJugadorO = 0;

	// Mostrar tablero
	public static void mostrarTablero() {
		System.out.println("   0   1   2");
		System.out.println("  -------------");

		for (int i = 0; i < 3; i++) {
			System.out.print(i + " |");
			for (int j = 0; j < 3; j++) {
				System.out.print(" " + tablero[i][j] + " |");
			}
			System.out.println();
			System.out.println("  -----------");
		}
		System.out.println();
	}

	// Turnos de cada Jugador
	public static void jugarTurno() {
		Scanner sc = new Scanner(System.in);

		int fila;
		int columna;

		do {
			System.out.println("Jugador " + jugadorActual + ", introduce la fila (0, 1, 2): ");
			fila = sc.nextInt();
			System.out.println("Jugador " + jugadorActual + ", introduce la columna (0, 1, 2): ");
			columna = sc.nextInt();

		} while (!esMovimientoValido(fila, columna));

		tablero[fila][columna] = jugadorActual;
	}

	public static boolean esMovimientoValido(int fila, int columna) {

		if (fila < 0 || fila >= 3 || columna < 0 || columna >= 3 || tablero[fila][columna] != ' ') {

			System.out.println("Movimiento fuera de rango permitido. Intenta de nuevo.");

			mostrarTablero();

			return false;
		}
		return true;
	}

	public static boolean haGanado() { // Si alguna cumple las condiciones, hay Ganador
		return (comprobarFilas() || comprobarColumnas() || comprobarDiagonales());
	}

	public static boolean comprobarFilas() {
		for (int i = 0; i < 3; i++) {
			if (tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) {
				return true;
			}
		}
		return false;
	}

	public static boolean comprobarColumnas() {
		for (int j = 0; j < 3; j++) {
			if (tablero[0][j] == jugadorActual && tablero[1][j] == jugadorActual && tablero[2][j] == jugadorActual) {
				return true;
			}
		}
		return false;
	}

	public static boolean comprobarDiagonales() {
		return (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual)
				|| (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual);
	}

	public static void eliminarFicha() {
		Scanner sc = new Scanner(System.in);

		int fila;
		int columna;

		do {
			System.out.println("Jugador " + 'X' + ", selecciona la fila de la ficha a eliminar (0, 1, 2): ");
			fila = sc.nextInt();
			System.out.println("Jugador " + 'X' + ", selecciona la columna de la ficha a eliminar (0, 1, 2): ");
			columna = sc.nextInt();

			if (fila < 0 || fila >= 3 || columna < 0 || columna >= 3 || tablero[fila][columna] != 'X') {
				System.out.println("Selección no válida. Intenta de nuevo.");
				mostrarTablero();
			} else {
				break;
			}
		} while (true);

		tablero[fila][columna] = ' '; // Elimina la ficha seleccionada
	}

	public static void cambiarTurno() {
		// El jugador Actual se mostrará o X o O
		jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
	}

	public static void reiniciarJuego() {
		tablero = new char[][] { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
		jugadorActual = 'X';
		mostrarTablero();
	}

	public static void main(String[] args) {

		mostrarTablero();

		int movimientosJugadorX = 0;
		int movimientosJugadorO = 0;

		while (true) {
			jugarTurno();
			mostrarTablero();

			if (haGanado()) {
				System.out.println("Jugador " + jugadorActual + " ha ganado");
				if (jugadorActual == 'X') {
					partidasGanadasJugadorX++;
				} else {
					partidasGanadasJugadorO++;
				}

				System.out.println("Total de partidas ganadas por Jugador X: " + partidasGanadasJugadorX);
				System.out.println("Total de partidas ganadas por Jugador O: " + partidasGanadasJugadorO);

				System.out.println("¿Deseas jugar de nuevo? (s/n): ");
				Scanner sc = new Scanner(System.in);
				char respuesta = sc.next().toLowerCase().charAt(0);

				if (respuesta == 'n') {
					break;
				} else if (respuesta == 's') {
					reiniciarJuego();
				} else {
					System.out.println("Respuesta no válida. Adiós.");
					break;
				}
			}

			if (jugadorActual == 'X') {
				movimientosJugadorX++;
			} else {
				movimientosJugadorO++;
			}

			if (movimientosJugadorX % 3 == 0 && movimientosJugadorO % 3 == 0) {
				eliminarFicha();
				mostrarTablero();
			}

			cambiarTurno();
		}
	}
}
