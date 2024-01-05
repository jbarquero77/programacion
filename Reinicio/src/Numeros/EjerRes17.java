/*
 * Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas.
 *  En cada factura figura: 
 *  el código del artículo, 
 *  la cantidad vendida en litros y 
 *  el precio por litro. 
 *  Se pide de 5 facturas introducidas: 
 * Facturación total, cantidad en litros vendidos del artículo 1 y cuantas facturas se emitieron de más de 600 €.
 */

package Numeros;

import java.util.Scanner;

public class EjerRes17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int codigo;
		int cantidadLitros;
		double precio;
		double factura;
		double facturacionTotal=0;
		int litrosCodigo1=0;
		int mas600=0;
		
		for (int i=0; i<5;i++) {
			System.out.println("Factura número "+ i);
			System.out.println("Introduce el código: ");
			codigo = sc.nextInt();
			System.out.println("Introduce la cantidad en litros: ");
			cantidadLitros = sc.nextInt();
			System.out.println("Introduce el precio: ");
			precio = sc.nextDouble();
			
			factura = cantidadLitros*precio;
			facturacionTotal += factura;
			if (codigo == 1) {
				litrosCodigo1 += cantidadLitros;
			}
			if (factura >=600) {
				mas600++;
			}
		}
		System.out.println("La facturacion total es de "+ facturacionTotal);
		System.out.println("Del articulo 1 se han vendido: "+litrosCodigo1 + " litros");
		System.out.println("Se han emitido "+mas600 + " facturas de más de 600€");

	}

}
