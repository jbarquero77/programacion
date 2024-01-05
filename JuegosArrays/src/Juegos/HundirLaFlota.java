package Juegos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HundirLaFlota {
	 private static final int SIZE = 10;
	    private static final int NUM_SHIPS = 5;

	    private static final char EMPTY = '-';
	    private static final char SHIP = 'S';
	    private static final char HIT = 'X';
	    private static final char MISS = 'O';

	    private char[][] playerBoard = new char[SIZE][SIZE];
	    private char[][] computerBoard = new char[SIZE][SIZE];

	    private int playerShipsRemaining = NUM_SHIPS;
	    private int computerShipsRemaining = NUM_SHIPS;

	    private Random random = new Random();
	    private Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        HundirLaFlota game = new HundirLaFlota();
	        game.initializeBoards();
	        game.placeShips();
	        game.playGame();
	    }

	    private void initializeBoards() {
	        for (char[] row : playerBoard) {
	            Arrays.fill(row, EMPTY);
	        }

	        for (char[] row : computerBoard) {
	            Arrays.fill(row, EMPTY);
	        }
	    }

	    private void printBoard(char[][] board) {
	        System.out.print("  ");
	        for (int i = 0; i < SIZE; i++) {
	            System.out.print(i + " ");
	        }
	        System.out.println();

	        for (int i = 0; i < SIZE; i++) {
	            System.out.print(i + " ");
	            for (int j = 0; j < SIZE; j++) {
	                System.out.print(board[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    private void placeShips() {
	        placeShipsRandomly(playerBoard);
	        placeShipsRandomly(computerBoard);
	    }

	    private void placeShipsRandomly(char[][] board) {
	        int shipsToPlace = NUM_SHIPS;

	        while (shipsToPlace > 0) {
	            int row = random.nextInt(SIZE);
	            int col = random.nextInt(SIZE);

	            if (board[row][col] == EMPTY) {
	                board[row][col] = SHIP;
	                shipsToPlace--;
	            }
	        }
	    }

	    private void playGame() {
	        while (playerShipsRemaining > 0 && computerShipsRemaining > 0) {
	            System.out.println("\nTu turno:");
	            printBoard(playerBoard);
	            playerTurn();

	            if (computerShipsRemaining > 0) {
	                System.out.println("\nTurno de la computadora:");
	                computerTurn();
	                printBoard(playerBoard);
	            }
	        }

	        if (playerShipsRemaining == 0) {
	            System.out.println("¡Ganaste! Hundiste todos los barcos de la computadora.");
	        } else {
	            System.out.println("La computadora ganó. Todos tus barcos fueron hundidos.");
	        }
	    }

	    private void playerTurn() {
	        int row, col;

	        do {
	            System.out.print("Ingresa la fila para atacar: ");
	            row = scanner.nextInt();
	            System.out.print("Ingresa la columna para atacar: ");
	            col = scanner.nextInt();
	        } while (!isValidAttack(row, col));

	        if (computerBoard[row][col] == SHIP) {
	            System.out.println("¡Impacto! Hundiste un barco de la computadora.");
	            computerBoard[row][col] = HIT;
	            computerShipsRemaining--;
	        } else {
	            System.out.println("¡Agua! No hay barco en esa posición.");
	            computerBoard[row][col] = MISS;
	        }
	    }

	    private void computerTurn() {
	        int row, col;

	        do {
	            row = random.nextInt(SIZE);
	            col = random.nextInt(SIZE);
	        } while (!isValidAttack(row, col));

	        if (playerBoard[row][col] == SHIP) {
	            System.out.println("La computadora te ha atacado. ¡Tu barco fue impactado!");
	            playerBoard[row][col] = HIT;
	            playerShipsRemaining--;
	        } else {
	            System.out.println("La computadora te ha atacado. ¡Agua!");
	            playerBoard[row][col] = MISS;
	        }
	    }

	    private boolean isValidAttack(int row, int col) {
	        return row >= 0 && row < SIZE && col >= 0 && col < SIZE && playerBoard[row][col] != HIT && playerBoard[row][col] != MISS;
	    }
}
