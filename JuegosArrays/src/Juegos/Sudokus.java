package Juegos;

import java.util.Arrays;
import java.util.Random;

public class Sudokus {
	public static void main(String[] args) {
		int[][] randomSudoku = generateRandomSudoku();
		System.out.println("Sudoku generado:");
		printSudoku(randomSudoku);

		if (solveSudoku(randomSudoku)) {
			System.out.println("\nSudoku resuelto:");
			printSudoku(randomSudoku);
		} else {
			System.out.println("\nNo hay solución para el sudoku generado.");
		}
	}

	private static int[][] generateRandomSudoku() {
		int[][] sudoku = new int[9][9];
		Random random = new Random();

		for (int i = 0; i < random.nextInt(17) + 17; i++) { // Ajusta el rango según la dificultad deseada
			int row = random.nextInt(9);
			int col = random.nextInt(9);
			int num = random.nextInt(9) + 1;

			while (!isValid(sudoku, row, col, num) || sudoku[row][col] != 0) {
				row = random.nextInt(9);
				col = random.nextInt(9);
				num = random.nextInt(9) + 1;
			}

			sudoku[row][col] = num;
		}

		return sudoku;
	}

	private static boolean solveSudoku(int[][] sudoku) {
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {
				if (sudoku[row][col] == 0) {
					for (int num = 1; num <= 9; num++) {
						if (isValid(sudoku, row, col, num)) {
							sudoku[row][col] = num;

							if (solveSudoku(sudoku)) {
								return true;
							}

							sudoku[row][col] = 0; // Vuelve atrás si la solución no es válida
						}
					}
					return false;
				}
			}
		}
		return true;
	}

	private static boolean isValid(int[][] sudoku, int row, int col, int num) {
		// Verifica si el número ya está en la fila o columna
		for (int i = 0; i < 9; i++) {
			if (sudoku[row][i] == num || sudoku[i][col] == num) {
				return false;
			}
		}

		// Verifica si el número ya está en el bloque 3x3
		int startRow = 3 * (row / 3);
		int startCol = 3 * (col / 3);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (sudoku[startRow + i][startCol + j] == num) {
					return false;
				}
			}
		}

		return true;
	}

	private static void printSudoku(int[][] sudoku) {
		for (int[] row : sudoku) {
			System.out.println(Arrays.toString(row));
		}
	}
	
	
}
