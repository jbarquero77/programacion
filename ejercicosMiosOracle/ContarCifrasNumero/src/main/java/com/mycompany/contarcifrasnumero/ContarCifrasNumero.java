/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contarcifrasnumero;
import java.util.Scanner;
/**
 *
 * @author joseb
 */
public class ContarCifrasNumero {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        
        int numero;
        
        do{
            System.out.println("Escribe un número positivo");
            numero=sc.nextInt();
        }while(numero<0);
        
        int cifras=cuentaCifras(numero);
        
        System.out.println("Hay "+cifras+" cifras");
    }
    public static int cuentaCifras (int numero){
        int cifras =1;
        
        for(int i=numero;i>10;i/=10){
            cifras++;
        }
        return cifras;
    }
}
