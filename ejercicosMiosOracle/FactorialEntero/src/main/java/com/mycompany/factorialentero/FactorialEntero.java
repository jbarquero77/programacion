/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorialentero;

/**
 *
 * @author joseb
 */
public class FactorialEntero {

    public static void main(String[] args) {
        
        
        System.out.println(factorial(5));
    }
    
    public static int factorial (int numero){
       if (numero<0){
           System.out.println("No se puede calcular el factorial de un número negativo");
           return -1;
           } 
       if (numero==0 || numero ==1){
           return 1;
           }
       
       int resultado=numero;
       
       for (int i=(numero-1);i>1;i--){
           resultado*=i;
       }
    }
           
        

