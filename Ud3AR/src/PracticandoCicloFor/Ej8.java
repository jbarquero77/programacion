/*
 * Crea un programa para la gestión de facturas de una empresa que se dedica a la venta de azúcar por kilos.
 * En cada factura se ingresará el código del producto vendido
 * Se ingresará la cantidad de kilos vendida y
 *y el total a pagar por kilos
 *De 5 facturas introducidas, pide:
 * facturación total, +
 * cantidad de kilos vendidas
 * cuantas facturas superan los 1000€
 */


package PracticandoCicloFor;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String codigo = " ";
		double kilos =0;
		double precio =0;
		double importeFactura =0;
		double facturacionTotal =0;
		int contador =0;
		double totalKilos =0;
		
		for (int i =0; i<=5;i++) {
			System.out.println("Factura número: "+i);
			System.out.println(" Cógigo del producto: ");
			codigo = sc.next();
			System.out.println("Cantidad de kilos: ");
			kilos = sc.nextDouble();
			System.out.println("Precio: ");
			precio = sc.nextDouble();
			importeFactura = kilos*precio;
			facturacionTotal = importeFactura + facturacionTotal;
			
			if (importeFactura >= 1000) {
				contador++;
			}
			totalKilos = kilos+totalKilos;
		}
		
		System.out.println("Detalles de la venta: ");
		System.out.println("Facturación total: "+facturacionTotal+" €");
		System.out.println("Total de kilos vendidos: "+totalKilos+" Kg");

	}

}
