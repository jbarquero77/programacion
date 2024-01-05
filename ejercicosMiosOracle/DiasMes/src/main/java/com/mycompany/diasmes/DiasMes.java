/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diasmes;

import java.util.Date;

/**
 *
 * @author joseb
 */
public class DiasMes {

    public static void main(String[] args) {
        System.out.println(numDias(1));
        System.out.println(numDias(2));
        System.out.println(numDias(7));
        System.out.println(numDias(20));
        System.out.println(numDias(5));
        
    }
    
    public static int numDias (int mes){
        
        int numDias=0;
        
        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDias = 31;
                break;
            case 4:
            case 6:
            case 9:    
            case 11:
                numDias = 30;
                break;
            case 2:
                numDias=28;
                
                int anyoActual=new Date().getYear()+1900;
                
                if(esBisiesto(anyoActual)){
                    numDias++;
                }
                
                break;
            default:
                numDias = -1;
        }
        return numDias;
        
    }
    
    public static boolean esBisiesto (int anyo){
        
        if (anyo<=0){
            return false;
        }
        return (anyo % 4 ==0 && (anyo % 100 !=0 || anyo % 400 ==0));
            
        
    }
}
