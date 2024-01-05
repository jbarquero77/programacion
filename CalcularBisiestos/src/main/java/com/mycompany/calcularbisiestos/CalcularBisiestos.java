/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcularbisiestos;

/**
 *
 * @author joseb
 */
public class CalcularBisiestos {

    public static void main(String[] args) {
        
        System.out.println(esBisiesto(2018));
        System.out.println(esBisiesto(1218));
        System.out.println(esBisiesto(1818));
        System.out.println(esBisiesto(2032));
    }
       
    public static boolean esBisiesto (int anyo){
        
        if (anyo<=0){
            return false;
        }
        return (anyo % 4 ==0 && (anyo % 100 !=0 || anyo % 400 ==0));
            
        
    }
}
