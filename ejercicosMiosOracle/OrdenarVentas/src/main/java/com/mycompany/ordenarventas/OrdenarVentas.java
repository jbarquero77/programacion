/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenarventas;

import java.util.Scanner;

/**
 *
 * @author joseb
 */
public class OrdenarVentas {

    public static void main(String[] args) {
        
        double ventas []=new double [30];
        Scanner sc=new Scanner (System.in);
            System.out.println("Ingrese las 30 ventas del mes:");
            for (int i=0;i<ventas.length;i++){
                System.out.println("Venta "+(i+1));
                ventas[i]=sc.nextDouble();
            }
            int k=0;
            int total =0;
            while(k<30)
            {
                if (ventas[k]>2000)
                    System.out.println("$"+ventas[k]);
                }
            total++;
            }
                k++;
                
            }
            System.out.println("El total de las ventas mayores a 2000 es: "+total);
        
    
}
