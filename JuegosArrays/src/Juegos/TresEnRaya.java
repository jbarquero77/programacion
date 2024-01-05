package Juegos;

import java.util.Scanner;

public class TresEnRaya {
	
	private static char [][]tablero = {{' ', ' ', ' '},{' ', ' ', ' '},{' ', ' ', ' '}};
	private static char jugadores ='X';
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		while(true) {
			imprimirTablero();
			System.out.println("Jugador"+jugadores+ " , introduce la fila (0,2): ");
			int fila = sc.nextInt();
			System.out.println("Jugador"+jugadores+ " , introduce la columna (0,2): ");
			int columna = sc.nextInt();
			
			if (esMovimientoValido(fila, columna)) {
				hacerMovimiento(fila, columna);
				if (ganador()) {
					imprimirTablero();
					System.out.println("El jugador "+jugadores+ " ha ganado!!");
					break;
				}
				if(tableroLLeno()) {
					imprimirTablero();
					System.out.println("Empate");
					break;
				}
				mostrarJugador();
			}else {
				System.out.println("Movimiento inválido. Inténtalo de neuvo.");
			}
		}
	}
	private static void imprimirTablero() {
		System.out.println("-------------");
		for(int i=0;i<3;i++) {
			System.out.print("| ");
			for(int j=0; j<3; j++) {
				System.out.print(tablero[i][j]+ " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}
	
	private static boolean esMovimientoValido(int fila, int columna) {
		return fila >= 0 && fila <3 && columna >=0 && columna <3 && tablero[fila][columna] == ' ';
	}
	private static void hacerMovimiento(int fila, int columna) {
		tablero[fila][columna] = jugadores;
	}
	private static void mostrarJugador() {
		jugadores = (jugadores == 'X') ? '0' : 'X';
	}
	private static boolean ganador() {
		return comprobarFila() || comprobarColumna() || comprobarDiagonales();
	}
	
	private static boolean comprobarFila() {
		for (int i =0; i<3;i++) {
			if(tablero[i][0] == jugadores && tablero[i][1]== jugadores && tablero[i][2] == jugadores) {
				return true;
			}
		}
		return false;
	}
	private static boolean comprobarColumna() {
		for (int i =0; i<3;i++) {
			if(tablero[0][i] == jugadores && tablero[1][i]== jugadores && tablero[2][i] == jugadores) {
				return true;
			}
		}
		return false;
	}
	private static boolean comprobarDiagonales() {
		return (tablero[0][0] == jugadores && tablero [1][1] == jugadores && tablero [2][2]== jugadores) ||
				(tablero[0][2] == jugadores && tablero [1][1] == jugadores && tablero [2][0]== jugadores);
	}
	
	private static boolean tableroLLeno() {
		for(int i=0;i<3;i++) {
			for (int j=0; j<3; j++) {
				if (tablero[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

}
