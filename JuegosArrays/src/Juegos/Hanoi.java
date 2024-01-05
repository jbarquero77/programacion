package Juegos;
import java.util.Scanner;
public class Hanoi {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Ingrese el número de discos: ");
	        int numDiscos = scanner.nextInt();

	        resolverTorreHanoi(numDiscos, 'A', 'C', 'B');
	        
	        scanner.close();
	    }

	    static void resolverTorreHanoi(int n, char origen, char destino, char auxiliar) {
	        if (n == 1) {
	            System.out.println("Mover disco 1 de torre " + origen + " a torre " + destino);
	            return;
	        }

	        resolverTorreHanoi(n - 1, origen, auxiliar, destino);
	        System.out.println("Mover disco " + n + " de torre " + origen + " a torre " + destino);
	        resolverTorreHanoi(n - 1, auxiliar, destino, origen);
	    }

}
