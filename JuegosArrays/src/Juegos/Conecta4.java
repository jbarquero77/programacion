package Juegos;
import java.util.Scanner;

public class Conecta4 {
	 private static final int ROWS = 6;
	    private static final int COLUMNS = 7;
	    private static char[][] board = new char[ROWS][COLUMNS];

	    public static void main(String[] args) {
	        initializeBoard();
	        printBoard();

	        Scanner scanner = new Scanner(System.in);
	        boolean gameWon = false;
	        int currentPlayer = 1;

	        while (!gameWon) {
	            System.out.println("Jugador " + currentPlayer + ", ingrese la columna (0-6): ");
	            int column = scanner.nextInt();

	            if (isValidMove(column)) {
	                dropPiece(currentPlayer, column);
	                printBoard();
	                gameWon = checkForWin(currentPlayer);
	                if (gameWon) {
	                    System.out.println("¡Jugador " + currentPlayer + " gana!");
	                    break;
	                }
	                currentPlayer = (currentPlayer == 1) ? 2 : 1;
	            } else {
	                System.out.println("Columna no válida. Intente de nuevo.");
	            }
	        }

	        scanner.close();
	    }

	    private static void initializeBoard() {
	        for (int i = 0; i < ROWS; i++) {
	            for (int j = 0; j < COLUMNS; j++) {
	                board[i][j] = ' ';
	            }
	        }
	    }

	    private static void printBoard() {
	        System.out.println(" 0 1 2 3 4 5 6");
	        for (int i = 0; i < ROWS; i++) {
	            for (int j = 0; j < COLUMNS; j++) {
	                char symbol = board[i][j];
	                if (symbol == '1') {
	                    System.out.print("|" + "\u001B[31m" + symbol + "\u001B[0m");
	                } else if (symbol == '2') {
	                    System.out.print("|" + "\u001B[32m" + symbol + "\u001B[0m");
	                } else {
	                    System.out.print("|" + symbol);
	                }
	            }
	            System.out.println("|");
	        }
	        System.out.println("---------------");
	        System.out.println(" 0 1 2 3 4 5 6");
	    }

	    private static boolean isValidMove(int column) {
	        return column >= 0 && column < COLUMNS && board[0][column] == ' ';
	    }

	    private static void dropPiece(int player, int column) {
	        char symbol = (player == 1) ? '1' : '2';
	        for (int i = ROWS - 1; i >= 0; i--) {
	            if (board[i][column] == ' ') {
	                board[i][column] = symbol;
	                break;
	            }
	        }
	    }

	    private static boolean checkForWin(int player) {
	        char symbol = (player == 1) ? '1' : '2';

	        // Verificar victoria horizontal
	        for (int i = 0; i < ROWS; i++) {
	            for (int j = 0; j <= COLUMNS - 4; j++) {
	                if (board[i][j] == symbol &&
	                    board[i][j + 1] == symbol &&
	                    board[i][j + 2] == symbol &&
	                    board[i][j + 3] == symbol) {
	                    return true;
	                }
	            }
	        }

	        // Verificar victoria vertical
	        for (int i = 0; i <= ROWS - 4; i++) {
	            for (int j = 0; j < COLUMNS; j++) {
	                if (board[i][j] == symbol &&
	                    board[i + 1][j] == symbol &&
	                    board[i + 2][j] == symbol &&
	                    board[i + 3][j] == symbol) {
	                    return true;
	                }
	            }
	        }

	        // Verificar victoria diagonal hacia la derecha
	        for (int i = 0; i <= ROWS - 4; i++) {
	            for (int j = 0; j <= COLUMNS - 4; j++) {
	                if (board[i][j] == symbol &&
	                    board[i + 1][j + 1] == symbol &&
	                    board[i + 2][j + 2] == symbol &&
	                    board[i + 3][j + 3] == symbol) {
	                    return true;
	                }
	            }
	        }

	        // Verificar victoria diagonal hacia la izquierda
	        for (int i = 0; i <= ROWS - 4; i++) {
	            for (int j = 3; j < COLUMNS; j++) {
	                if (board[i][j] == symbol &&
	                    board[i + 1][j - 1] == symbol &&
	                    board[i + 2][j - 2] == symbol &&
	                    board[i + 3][j - 3] == symbol) {
	                    return true;
	                }
	            }
	        }

	        return false;
	    }
}
