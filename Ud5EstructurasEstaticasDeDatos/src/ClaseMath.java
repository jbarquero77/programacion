
import java.util.Random;


public class ClaseMath {

	public static void main(String[] args) {
		Random rand = new Random();
		
		
		//Potencias
		double potencia = Math.pow(2,3); // Nos da el resultado de 2 elevado a 3 
		//Raices cuadradas
		double raiz = Math.sqrt(9); // Nos da el resultado de la raíz cuadrada de 9 
		
		double raizCubica = Math.sqrt(9.3); //Raiz cubica de 9
		
		
		int valorAbsoluto = (int) Math.abs(2.3); //Da el valor absoluto de un número x=2
		
		//Redondeo
		double enteroPorArriba = Math.ceil(2.5); // Da el valor más cercano por arriba x=3;
		double enteroPorDebajo = Math.floor(2.5); // Da el valor más cercano por debajo =2;
		double redondeo = Math.round(2.5); //Redondeo al entero más cercano
		
		// Máximo o mínimo entre dos números
		int maximo = Math.max(3,8); // Valor máximo entre 2 números (8)
		int minimo = Math.min(3, 8); // Valor mínimo entre 2 números (3)
		
		
		// Números aleatorios
		double aleatorio = Math.random(); // Devuelve un número aleatorio entre 0 y 1
		double aleatorioRango = (int)(rand.nextDouble() * 6 + 1);  // rand. es el nombre que hemnos puesto al método, 6 es la cantidad de números en el rango [1,6] y 1 es el término inicial del rango
		
		
		System.out.println(potencia);
		System.out.println(raizCubica);
	}

}
