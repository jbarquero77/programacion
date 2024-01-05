/*  Escribe un programa llamado Calculadora 
 * que haga las siguientes operaciones aritméticas: 
 * suma(s), resta(r), multiplicación(m) y división (d).
 *  Al programa se le pasará por línea de comandos tres parámetros: 
 *  dos números enteros y la operación a realizar. 
 *  Por ejemplo, si ejecutamos “Calculadora 1 2 s”, hará la operación 1 + 2,
 *   si ejecutamos “Calculadora 3 5 m” hará la operación 3 * 5, etc. 
 *   El programa mostrará el resultado de cada una de estas operaciones.  */



package Funciones;

public class Ej8Calculadora {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		String operador = args[2];
				
	        int resultado = calcular(num1, num2, operador);

        
            System.out.println("Resultado: " + resultado);
       
		
	}
	public static int calcular(int num1, int num2, String operacion) {
        int resultado = 0;
        
        switch (operacion) {
            case "s":
                resultado = suma(num1, num2);
                break;
            case "r":
                resultado = resta(num1, num2);
                break;
            case "m":
                resultado = multiplicacion(num1, num2);
                break;
            case "d":
                if (num2 != 0) {
                    resultado = division(num1, num2);
                } else {
                    System.out.println("No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
        }

        return resultado;
    }
		
		
	 public static int suma(int a, int b) {
	        return a + b;
	    }

	    public static int resta(int a, int b) {
	        return a - b;
	    }

	    public static int multiplicacion(int a, int b) {
	        return a * b;
	    }

	    public static int division(int a, int b) {
	        return a / b;
	
	    }
	
}