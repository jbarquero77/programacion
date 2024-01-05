package Juego2048;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Juego {
	
	private static int puntuacion;
	private static int [][] tablero;
	private static int TAMANIO_TABLERO;
	
	// Menu para seleccionar el tamaño del tablero
	
	private static void seleccionarTamanioTablero () {
		Scanner sc = new Scanner (System.in);
		System.out.println("Selecciona el tamaño del tablero:");
	    System.out.println("1. Pequeño (3x3)");
	    System.out.println("2. Mediano (4x4)");
	    System.out.println("3. Grande (5x5)");
	    
	    int option = sc.nextInt();
	    
	    switch (option) {
	    	case 1:
	    		TAMANIO_TABLERO =3;
	    		break;
	    	case 2:
	            TAMANIO_TABLERO = 4;
	            break;
	        case 3:
	            TAMANIO_TABLERO = 5;
	            break;
	        default:
	            System.out.println("Opción no válida. Seleccionando tamaño mediano (4x4) por defecto.");
	            TAMANIO_TABLERO = 4;	
	    }	
	    		
	    tablero = new int [TAMANIO_TABLERO][TAMANIO_TABLERO];    
	}
	
	
	//Imprimir el tablero
	
	private static void imprimirTablero() {
		for(int []fila : tablero) {
			for (int celda: fila) {
				imprimirCelda (celda);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	private static void imprimirCelda (int valor) {
		if (valor==0) {
			System.out.print(" \t");		// Espacio para celdas vacías
		}else {
			System.out.print(valor + "\t");
		}
	}

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

	 private static void iniciarJuego() {
	        tablero = new int[TAMANIO_TABLERO][TAMANIO_TABLERO];
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
	
	// Direccion introducida por el usuario
	private static String obtenerDireccion() {
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduce la dirección: w = arriba, a= abajo, s= izquierda, d = derecha: ");
		return sc.nextLine().toLowerCase();
	}
	
	//Funcion para mover las fichas
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
	
// Mover Arriba
	private static void moverArriba() {
        for (int col = 0; col < TAMANIO_TABLERO; col++) {
            // Combinar fichas iguales en la misma columna
            for (int fila = 0; fila < TAMANIO_TABLERO - 1; fila++) {
                if (tablero[fila][col] == tablero[fila + 1][col]) {
                    tablero[fila][col] *= 2;
                    tablero[fila + 1][col] = 0;
                }
            }

            // Mover fichas hacia arriba en la columna
            for (int fila = 0; fila < TAMANIO_TABLERO - 1; fila++) {
                if (tablero[fila][col] == 0) {
                    for (int siguienteFila = fila + 1; siguienteFila < TAMANIO_TABLERO; siguienteFila++) {
                        if (tablero[siguienteFila][col] != 0) {
                            tablero[fila][col] = tablero[siguienteFila][col];
                            tablero[siguienteFila][col] = 0;
                            break;
                        }
                    }
                }
            }
        }
    }
	
	private static void moverIzquierda() {
        for (int fila = 0; fila < TAMANIO_TABLERO; fila++) {
            // Combinar fichas iguales en la misma fila
            for (int col = 0; col < TAMANIO_TABLERO - 1; col++) {
                if (tablero[fila][col] == tablero[fila][col + 1]) {
                    tablero[fila][col] *= 2;
                    tablero[fila][col + 1] = 0;
                }
            }

            // Mover fichas hacia la izquierda en la fila
            for (int col = 0; col < TAMANIO_TABLERO - 1; col++) {
                if (tablero[fila][col] == 0) {
                    for (int siguienteCol = col + 1; siguienteCol < TAMANIO_TABLERO; siguienteCol++) {
                        if (tablero[fila][siguienteCol] != 0) {
                            tablero[fila][col] = tablero[fila][siguienteCol];
                            tablero[fila][siguienteCol] = 0;
                            break;
                        }
                    }
                }
            }
        }
    }

    private static void moverAbajo() {
        for (int col = 0; col < TAMANIO_TABLERO; col++) {
            // Combinar fichas iguales en la misma columna (de abajo hacia arriba)
            for (int fila = TAMANIO_TABLERO - 1; fila > 0; fila--) {
                if (tablero[fila][col] == tablero[fila - 1][col]) {
                    tablero[fila][col] *= 2;
                    tablero[fila - 1][col] = 0;
                }
            }

            // Mover fichas hacia abajo en la columna
            for (int fila = TAMANIO_TABLERO - 1; fila > 0; fila--) {
                if (tablero[fila][col] == 0) {
                    for (int filaAnterior = fila - 1; filaAnterior >= 0; filaAnterior--) {
                        if (tablero[filaAnterior][col] != 0) {
                            tablero[fila][col] = tablero[filaAnterior][col];
                            tablero[filaAnterior][col] = 0;
                            break;
                        }
                    }
                }
            }
        }
    }

    private static void moverDerecha() {
        for (int fila = 0; fila < TAMANIO_TABLERO; fila++) {
            // Combinar fichas iguales en la misma fila (de derecha a izquierda)
            for (int col = TAMANIO_TABLERO - 1; col > 0; col--) {
                if (tablero[fila][col] == tablero[fila][col - 1]) {
                    tablero[fila][col] *= 2;
                    tablero[fila][col - 1] = 0;
                }
            }

            // Mover fichas hacia la derecha en la fila
            for (int col = TAMANIO_TABLERO - 1; col > 0; col--) {
                if (tablero[fila][col] == 0) {
                    for (int colAnterior = col - 1; colAnterior >= 0; colAnterior--) {
                        if (tablero[fila][colAnterior] != 0) {
                            tablero[fila][col] = tablero[fila][colAnterior];
                            tablero[fila][colAnterior] = 0;
                            break;
                        }
                    }
                }
            }
        }
    }
    
    // Verificar estado de juego, si ha terminado, ha ganado o continua
    
    private static boolean verificarEstadoJuego() {
    	if(alcanzar2048()) {
    		System.out.println("Felicidades!! Has ganado");
    		return true;
    	}
    	
    	if(!hayMovimientosPosibles()) {
    		System.out.println("Juego terminado. No hay más movimientos");
    		return true;
    	}
    	return false;
    }
    
    // Verificar si se ha alcanzado el 2048
    private static boolean alcanzar2048() {
    	for(int []fila : tablero) {
    		for (int celda : fila) {
    			if (celda == 2048) {
    				return true;
    			}
    		}
    	}
    	return false;
    }
    
    // Verificar se hay movimientos posibles
    
    private static boolean hayMovimientosPosibles() {
    	if(puedoMoverArriba()) return true;
    	if(puedoMoverIzquierda()) return true;
    	if(puedoMoverAbajo()) return true;
    	if(puedoMoverDerecha()) return true;
    	return false;
    }
    
    //Verificar cada Movimiento
    
    private static boolean puedoMoverArriba() {
    	for (int col=0; col < TAMANIO_TABLERO; col++) {
    		for(int fila =1; fila < TAMANIO_TABLERO; fila++) {
    			if(tablero[fila][col] !=0 && (tablero [fila-1][col]==0 || tablero [fila][col]== tablero[fila-1][col])) {
    				return true;
    			}
    		}
    	}
    	return false;
    }
    
    private static boolean puedoMoverIzquierda() {
        for (int fila = 0; fila < TAMANIO_TABLERO; fila++) {
            for (int col = 1; col < TAMANIO_TABLERO; col++) {
                if (tablero[fila][col] != 0 && (tablero[fila][col - 1] == 0 || tablero[fila][col] == tablero[fila][col - 1])) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean puedoMoverAbajo() {
        for (int col = 0; col < TAMANIO_TABLERO; col++) {
            for (int fila = TAMANIO_TABLERO - 2; fila >= 0; fila--) {
                if (tablero[fila][col] != 0 && (tablero[fila + 1][col] == 0 || tablero[fila][col] == tablero[fila + 1][col])) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean puedoMoverDerecha() {
        for (int fila = 0; fila < TAMANIO_TABLERO; fila++) {
            for (int col = TAMANIO_TABLERO - 2; col >= 0; col--) {
                if (tablero[fila][col] != 0 && (tablero[fila][col + 1] == 0 || tablero[fila][col] == tablero[fila][col + 1])) {
                    return true;
                }
            }
        }
        return false;
    }
    
	
	// Generar una nueva ficha en una posición aleatoria
	private static void generarNuevaFicha() {
        Random rand = new Random();
        int fila, columna;

        do {
            fila = rand.nextInt(TAMANIO_TABLERO);
            columna = rand.nextInt(TAMANIO_TABLERO);
        } while (tablero[fila][columna] != 0);

        // Generar un 2 o 4 con mayor probabilidad de ser 2
        int fichaNueva = (rand.nextInt(10) < 9) ? 2 : 4;

        tablero[fila][columna] = fichaNueva;

        // Actualizar la puntuación al generar una nueva ficha
        puntuacion += fichaNueva;
    }

}
	
	
	

